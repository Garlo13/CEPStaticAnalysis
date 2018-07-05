package org.xtext.example.mydsl.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class StronglyConnectedComponentDiGraph {

	private Map<String, List<String>> reverseGraph;
	private Map<String, List<String>> successorsMap;
	
	private List<Set<String>> sccList;
	
	public StronglyConnectedComponentDiGraph(Map<String, List<String>> mapEvent) {
		// TODO Auto-generated constructor stub
		reverseGraph = mapEvent;
		successorsMap = reverseGraph(reverseGraph);
		
		//printStack();
	}
	/*
	private void printStack() {
		// TODO Auto-generated method stub
		System.out.println("*******************************************");
		getSccDiGraph().stream().map(Set::toString).forEach(System.out::println);
		System.out.println("***********FIN*********");
	}
	*/
	private Map<String, List<String>> reverseGraph(Map<String, List<String>> graph){
		Map<String, List<String>> reverseGraphResult = new HashMap<String, List<String>>();
		
		reverseGraph.forEach((key, dependenciesList) -> reverseGraphResult.put(key, new ArrayList<String>()));
				
		reverseGraphResult.forEach((reverseKey, successorsList) -> 
			reverseGraph.forEach((key, dependenciesList) -> {
					if (dependenciesList.contains(reverseKey)) {
						successorsList.add(key);
					}
				}
			)
		); 
		
		return reverseGraphResult;
	}
	
	public boolean isThereAnySCC() {
		return reverseGraph.keySet().size() != createSCC().size();
	}
	
	public List<Set<String>> getSimplifiedSCCDiGraph(){
		return createSCC().stream().filter(set -> set.size() > 1).collect(Collectors.toList());
	}
	
	public List<Set<String>> getSccDiGraph(){
		return createSCC();
	}
	
	private List<Set<String>> createSCC() {
		if (sccList == null) {
			Stack<String> stackByFinishTime = dftForEachNode();
			sccList = sccDiGraph(stackByFinishTime);
		}
		return sccList;
	}

	//---------------SCC-TRAVERSING----------------------------------------
	private List<Set<String>> sccDiGraph(Stack<String> stackByFinishTime) {
		List<Set<String>> setsList = new ArrayList<>();
		Set<String> visitedNodes = new HashSet<>();
		
		auxLoopForSCC(stackByFinishTime, setsList, visitedNodes);
		
		return setsList;
	}
	
	private void auxLoopForSCC(Stack<String> stackByFinishTime, List<Set<String>> setsList, Set<String> visitedNodes) {
		//System.out.println("Entro");
		if (!stackByFinishTime.empty()) {
			//System.out.println("Estoy dentro");
			
			String currentNode = stackByFinishTime.pop();
			
			if (isNodeNotVisited(currentNode, visitedNodes)) {
				Set<String> connectedComponent = new HashSet<>();
				connectedComponent.add(currentNode);
				visitedNodes.add(currentNode);
				
				traversingNodePath(currentNode, connectedComponent, visitedNodes);
				
				
				setsList.add(connectedComponent);
			}
			
			auxLoopForSCC(stackByFinishTime, setsList, visitedNodes);
		}
		
	}
	
	

	private void traversingNodePath(String currentNode, Set<String> connectedComponent, Set<String> visitedNodes) {
		List<String> successorsList = reverseGraph.get(currentNode);
		
		if (!successorsList.isEmpty()) {
			successorsList.forEach(successors -> {
				if (isNodeNotVisited(successors, visitedNodes)) {
					visitedNodes.add(successors);
					connectedComponent.add(successors);
					traversingNodePath(successors, connectedComponent, visitedNodes);
				}
			});
		}
		
		
	}
	//----------------DFT-TRAVERSING----------------------------------------
	private Stack<String> dftForEachNode(){
		Set<String> visitedNodes = new HashSet<String>();
		Stack<String> stackByFinishTime = new Stack<String>();
		successorsMap.forEach((key, succesorsList) -> 
				auxLoopForDFT(key, visitedNodes, stackByFinishTime)
				);
		return stackByFinishTime;
	}

	private void auxLoopForDFT(String key , Set<String> visitedNodes,
			Stack<String> stackByFinishTime) {
		
		if (isNodeNotVisited(key, visitedNodes)) {
			visitNode(key, visitedNodes);
			
			List<String> successorsList = successorsMap.get(key);
			
			if (!successorsList.isEmpty()) {
				successorsList.forEach(successor -> auxLoopForDFT(successor, visitedNodes, stackByFinishTime));
			}
			
			stackByFinishTime.push(key);
			//a lo mejor despues del paso rescursivo va el meterlo en la pila
		}
		
	}

	private boolean isNodeNotVisited(String key, Set<String> visitedNodes) {
		return !visitedNodes.contains(key);
	}

	private void visitNode(String key, Set<String> visitedNodes) {
		visitedNodes.add(key);
	}
	
}
