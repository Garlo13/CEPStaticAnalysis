package org.xtext.example.mydsl.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class PriorityGenerator {

	private URI fileLocation;
	private HashMap<String, Integer> priorityMap;
	private Stack<String> traversingOrderStack;

	public PriorityGenerator(URI fileLocation, HashMap<String, Integer> priorityMap, Stack<String> orderStack) {
		this.fileLocation = fileLocation;
		this.priorityMap = priorityMap;
		this.traversingOrderStack = reverseStack(orderStack);
	}
	
	
	private Stack<String> reverseStack(Stack<String> orderStack) {
		Stack<String> result = new Stack<String>();
		while(!orderStack.isEmpty()) {
			result.push(orderStack.pop());
		}
		return result;
	}


	public String makePriorityFile() {
		
		ResourceSet rs = new ResourceSetImpl();
		URIConverter uriConverter = rs.getURIConverter();
		StringBuilder sb = new StringBuilder();
		
		InputStream inputStream = null;
		try {
			inputStream = uriConverter.createInputStream(fileLocation);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			
			String linea = br.readLine();
			
			while (linea != null) {
				if (!linea.startsWith("@Priority")) {
					sb.append(linea);
					sb.append("\n");
				}
				if (linea.startsWith("insert")) {
					String ruleID = traversingOrderStack.pop();
					//String[] ruleName = linea.split(" ");
					sb.append("@Priority(");
					sb.append(priorityMap.get(ruleID));
					sb.append(")");
					sb.append("\n");
				}
				linea = br.readLine();
			}
			br.close();	
		} catch(IOException e) {
			System.out.println(e.toString()); 
		}
		
		return sb.toString();
	}
	
}
