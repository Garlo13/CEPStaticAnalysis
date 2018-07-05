package org.xtext.example.mydsl.generator;

import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GraphUtils {
  private HashMap<String, List<String>> mapGraph;
  
  public GraphUtils(final HashMap<String, List<String>> mapEvent) {
    this.mapGraph = mapEvent;
  }
  
  public int getPriority(final String complexEvent) {
    boolean _isEmpty = this.mapGraph.get(complexEvent).isEmpty();
    if (_isEmpty) {
      return 0;
    } else {
      final Function1<String, Boolean> _function = (String event) -> {
        boolean _equals = event.equals(complexEvent);
        return Boolean.valueOf((!_equals));
      };
      final Function1<String, Integer> _function_1 = (String event) -> {
        return Integer.valueOf(this.getPriority(event));
      };
      Integer _max = IterableExtensions.<Integer>max(IterableExtensions.<String, Integer>map(IterableExtensions.<String>filter(this.mapGraph.get(complexEvent), _function), _function_1));
      return ((_max).intValue() + 1);
    }
  }
}
