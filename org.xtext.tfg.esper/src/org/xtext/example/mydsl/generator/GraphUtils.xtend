package org.xtext.example.mydsl.generator

import java.util.HashMap
import java.util.List

class GraphUtils {
	
	HashMap<String, List<String>> mapGraph
	
	new(HashMap<String, List<String>> mapEvent){
		mapGraph = mapEvent	
	}
	
	def int getPriority(String complexEvent){
		if (mapGraph.get(complexEvent).empty){
			return 0
		} else{
			return mapGraph.get(complexEvent)
				.filter[event | !event.equals(complexEvent)]
				.map[ event | getPriority(event)].max + 1
		}
	}
	
}