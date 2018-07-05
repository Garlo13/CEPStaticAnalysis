/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.esper.AbstractFollowBy;
import org.xtext.example.mydsl.esper.Domainmodel;
import org.xtext.example.mydsl.esper.Event;
import org.xtext.example.mydsl.esper.FollowBy;
import org.xtext.example.mydsl.esper.Insert;
import org.xtext.example.mydsl.esper.KindOfEvent;
import org.xtext.example.mydsl.esper.Pattern;
import org.xtext.example.mydsl.esper.Priority;
import org.xtext.example.mydsl.esper.RuleParts;
import org.xtext.example.mydsl.esper.TerminalExpression;
import org.xtext.example.mydsl.generator.GraphUtils;
import org.xtext.example.mydsl.generator.PriorityGenerator;
import org.xtext.example.mydsl.generator.StronglyConnectedComponentDiGraph;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EsperGenerator extends AbstractGenerator {
  private final HashMap<String, List<String>> mapEvents = new HashMap<String, List<String>>();
  
  private final HashMap<String, List<String>> mapUniqueId = new HashMap<String, List<String>>();
  
  private final HashMap<Insert, String> mapRulePartsToString = new HashMap<Insert, String>();
  
  private final HashMap<String, String> mapSimpleEventToString = new HashMap<String, String>();
  
  private HashMap<String, Integer> mapGeneratedPriorities = new HashMap<String, Integer>();
  
  private final HashMap<String, Integer> mapRealPriorities = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.mapEvents.clear();
    this.mapRulePartsToString.clear();
    this.mapSimpleEventToString.clear();
    this.mapUniqueId.clear();
    this.mapGeneratedPriorities.clear();
    this.mapRealPriorities.clear();
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    Domainmodel domainModel = ((Domainmodel) _head);
    final ArrayList<String> simpleEventList = CollectionLiterals.<String>newArrayList();
    final EList<RuleParts> complexEventList = domainModel.getRules();
    final Consumer<Event> _function = (Event event) -> {
      simpleEventList.add(event.getName());
    };
    domainModel.getEvents().forEach(_function);
    final Stack<String> orderRuleStack = new Stack<String>();
    this.makeIntToRuleNameMap(IterableExtensions.<String>toList(simpleEventList), complexEventList, orderRuleStack);
    this.makeMap(IterableExtensions.<String>toList(simpleEventList), complexEventList);
    GraphUtils graphUtils = new GraphUtils(this.mapUniqueId);
    final StronglyConnectedComponentDiGraph stronglyConnected = new StronglyConnectedComponentDiGraph(this.mapUniqueId);
    final String fileName = resource.getURI().lastSegment().replace(".esper", "").replace("-", "");
    boolean _isThereAnySCC = stronglyConnected.isThereAnySCC();
    if (_isThereAnySCC) {
      final List<Set<String>> scc = stronglyConnected.getSimplifiedSCCDiGraph();
      this.generateStronglyConnectedComponent(fsa, fileName, simpleEventList, complexEventList, scc);
    } else {
      this.makePriorityMap(graphUtils);
      URI _uRI = resource.getURI();
      final PriorityGenerator priorityGenerator = new PriorityGenerator(_uRI, this.mapGeneratedPriorities, orderRuleStack);
      this.generateGraphWithPriorities(fsa, fileName, priorityGenerator);
    }
  }
  
  public void generateStronglyConnectedComponent(final IFileSystemAccess2 fsa, final String fileName, final ArrayList<String> simpleEventList, final EList<RuleParts> complexEventList, final List<Set<String>> scc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph ");
    _builder.append(fileName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Set<Map.Entry<String, String>> _entrySet = this.mapSimpleEventToString.entrySet();
      for(final Map.Entry<String, String> entry : _entrySet) {
        _builder.append("\t");
        String _value = entry.getValue();
        _builder.append(_value, "\t");
        _builder.append(" [shape=\"box\", label=\"");
        String _key = entry.getKey();
        _builder.append(_key, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Set<Map.Entry<Insert, String>> _entrySet_1 = this.mapRulePartsToString.entrySet();
      for(final Map.Entry<Insert, String> entry_1 : _entrySet_1) {
        _builder.append("\t");
        String _value_1 = entry_1.getValue();
        _builder.append(_value_1, "\t");
        _builder.append(" [shape=\"oval\", label=\"");
        String _name = entry_1.getKey().getName();
        _builder.append(_name, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Set<Map.Entry<String, List<String>>> _entrySet_2 = this.mapUniqueId.entrySet();
      for(final Map.Entry<String, List<String>> entry_2 : _entrySet_2) {
        {
          List<String> _value_2 = entry_2.getValue();
          for(final String dependencie : _value_2) {
            {
              boolean _isThereAnySetContainingThisPairOfNodes = this.isThereAnySetContainingThisPairOfNodes(entry_2.getKey(), dependencie, scc);
              if (_isThereAnySetContainingThisPairOfNodes) {
                _builder.append("\t");
                _builder.append(dependencie, "\t");
                _builder.append(" -> ");
                String _key_1 = entry_2.getKey();
                _builder.append(_key_1, "\t");
                _builder.append(" [color=firebrick1]");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append(dependencie, "\t");
                _builder.append(" -> ");
                String _key_2 = entry_2.getKey();
                _builder.append(_key_2, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("}\t");
    _builder.newLine();
    fsa.generateFile((fileName + ".dot"), _builder);
    this.generateLogFileWithSCC(fileName, fsa, scc);
  }
  
  public void generateLogFileWithSCC(final String fileName, final IFileSystemAccess2 fsa, final List<Set<String>> scc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*************************************************************************");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.newLine();
    _builder.append("Se han encontrado ciclos en la estructura de las reglas. Por lo tanto, no se ha podido");
    _builder.newLine();
    _builder.append("generar las prioridades para cada regla.");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("Se han generado un ficheros:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- ");
    _builder.append(fileName, "\t");
    _builder.append(".dot donde puede encontrar una representación del grafo de dependencias");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("*************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("Se han encontrado las siguientes componentes conexas:");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Set<String> set : scc) {
        _builder.append("\t");
        _builder.append("- ");
        final Function<String, String> _function = (String uniqueID) -> {
          String _ruleNameFromUniqueID = this.getRuleNameFromUniqueID(uniqueID);
          String _plus = (_ruleNameFromUniqueID + " (");
          String _plus_1 = (_plus + uniqueID);
          return (_plus_1 + ")");
        };
        String _collect = set.stream().<String>map(_function).collect(Collectors.joining(",", "[", "]"));
        _builder.append(_collect, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*************************************************************************\t");
    _builder.newLine();
    fsa.generateFile((fileName + "Log.txt"), _builder);
  }
  
  public String getRuleNameFromUniqueID(final String id) {
    final Predicate<Map.Entry<Insert, String>> _function = (Map.Entry<Insert, String> entry) -> {
      return entry.getValue().equals(id);
    };
    final Function<Map.Entry<Insert, String>, String> _function_1 = (Map.Entry<Insert, String> entry) -> {
      return entry.getKey().getName();
    };
    return this.mapRulePartsToString.entrySet().stream().filter(_function).<String>map(_function_1).collect(Collectors.<String>toList()).get(0);
  }
  
  public boolean isThereAnySetContainingThisPairOfNodes(final String node1, final String node2, final List<Set<String>> scc) {
    final Predicate<Set<String>> _function = (Set<String> set) -> {
      return set.containsAll(CollectionLiterals.<String>newHashSet(node1, node2));
    };
    return scc.stream().anyMatch(_function);
  }
  
  public void generateGraphWithPriorities(final IFileSystemAccess2 fsa, final String fileName, final PriorityGenerator priorityGenerator) {
    final String prioritiesFileName = (fileName + "Priorities.esper");
    final HashMap<String, String> logMap = new HashMap<String, String>();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph ");
    _builder.append(fileName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Set<Map.Entry<String, String>> _entrySet = this.mapSimpleEventToString.entrySet();
      for(final Map.Entry<String, String> entry : _entrySet) {
        _builder.append("\t");
        String _value = entry.getValue();
        _builder.append(_value, "\t");
        _builder.append(" [shape=\"box\", label=\"");
        String _key = entry.getKey();
        _builder.append(_key, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Set<Map.Entry<Insert, String>> _entrySet_1 = this.mapRulePartsToString.entrySet();
      for(final Map.Entry<Insert, String> entry_1 : _entrySet_1) {
        {
          Integer _get = this.mapRealPriorities.get(entry_1.getValue());
          Integer _get_1 = this.mapGeneratedPriorities.get(entry_1.getValue());
          boolean _notEquals = (!Objects.equal(_get, _get_1));
          if (_notEquals) {
            _builder.append("\t");
            String _addEntryToMap = this.addEntryToMap(logMap, entry_1.getKey().getName(), entry_1.getValue());
            _builder.append(_addEntryToMap, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _value_1 = entry_1.getValue();
            _builder.append(_value_1, "\t");
            _builder.append(" [shape=\"oval\", label=\"");
            String _name = entry_1.getKey().getName();
            _builder.append(_name, "\t");
            _builder.append("\", color=firebrick1];");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _value_2 = entry_1.getValue();
            _builder.append(_value_2, "\t");
            _builder.append(" [shape=\"oval\", label=\"");
            String _name_1 = entry_1.getKey().getName();
            _builder.append(_name_1, "\t");
            _builder.append("\"];");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Set<Map.Entry<String, List<String>>> _entrySet_2 = this.mapUniqueId.entrySet();
      for(final Map.Entry<String, List<String>> entry_2 : _entrySet_2) {
        {
          List<String> _value_3 = entry_2.getValue();
          for(final String dependencie : _value_3) {
            _builder.append("\t");
            _builder.append(dependencie, "\t");
            _builder.append(" -> ");
            String _key_1 = entry_2.getKey();
            _builder.append(_key_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile((fileName + ".dot"), _builder);
    fsa.generateFile(prioritiesFileName, priorityGenerator.makePriorityFile());
    this.generateLogFilePriorities(fileName, fsa, logMap);
  }
  
  public void generateLogFilePriorities(final String fileName, final IFileSystemAccess2 fsa, final Map<String, String> map) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("No se han encontrado ciclos en la estructura de las reglas.");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("Se han generado dos ficheros:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- ");
    _builder.append(fileName, "\t");
    _builder.append(".dot donde puede encontrar una representación del grafo de dependencias");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- ");
    _builder.append(fileName, "\t");
    _builder.append("Priorities.esper donde puede encontrar las reglas introducidadas pero  ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("con las prioridades generadas (según orden topológico).");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("*************************************************************************");
    _builder.newLine();
    {
      boolean _isEmpty = map.isEmpty();
      if (_isEmpty) {
        _builder.append(" ");
        _builder.newLine();
        _builder.append("Las prioridades asignadas a las reglas corresponden con las esperadas.");
        _builder.newLine();
        _builder.append(" ");
        _builder.newLine();
        _builder.append("*************************************************************************");
        _builder.newLine();
      } else {
        _builder.append("Se han encontrado reglas cuya prioridades asignadas no son las esperadas:");
        _builder.newLine();
        _builder.append(" ");
        _builder.newLine();
        {
          Set<Map.Entry<String, String>> _entrySet = map.entrySet();
          for(final Map.Entry<String, String> entry : _entrySet) {
            _builder.append("\t");
            _builder.append("La regla ");
            String _key = entry.getKey();
            _builder.append(_key, "\t");
            _builder.append(" (");
            String _value = entry.getValue();
            _builder.append(_value, "\t");
            _builder.append(") con prioridad (");
            Integer _get = this.mapRealPriorities.get(entry.getValue());
            _builder.append(_get, "\t");
            _builder.append(") se esperaba con priodidad (");
            Integer _get_1 = this.mapGeneratedPriorities.get(entry.getValue());
            _builder.append(_get_1, "\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append(" ");
            _builder.newLine();
          }
        }
        _builder.append("*************************************************************************\t");
        _builder.newLine();
      }
    }
    fsa.generateFile((fileName + "Log.txt"), _builder);
  }
  
  public String addEntryToMap(final Map<String, String> map, final String key, final String value) {
    return map.put(key, value);
  }
  
  public void makeMap(final List<String> simpleEventList, final List<RuleParts> complexEventList) {
    final Consumer<String> _function = (String event) -> {
      this.mapEvents.put(event, IterableExtensions.<String>toList(CollectionLiterals.<String>newArrayList()));
    };
    simpleEventList.forEach(_function);
    final Consumer<RuleParts> _function_1 = (RuleParts complexEvent) -> {
      this.mapEvents.put(complexEvent.getInsert().getName(), this.extractDependencies1(complexEvent));
    };
    complexEventList.forEach(_function_1);
  }
  
  public List<String> extractDependencies1(final RuleParts rule) {
    List<String> _xifexpression = null;
    Pattern _pattern = rule.getFromRule().getPattern();
    boolean _tripleNotEquals = (_pattern != null);
    if (_tripleNotEquals) {
      List<String> _xblockexpression = null;
      {
        ArrayList<KindOfEvent> kindOfEventList = new ArrayList<KindOfEvent>();
        EList<AbstractFollowBy> followByList = rule.getFromRule().getPattern().getJoinFollowBy().getFollowsByJoinList();
        ArrayList<String> result = new ArrayList<String>();
        for (final AbstractFollowBy abstractFollowBy : followByList) {
          {
            final List<String> auxList = this.extractDependencies2(abstractFollowBy.getFollowBy(), CollectionLiterals.<String>newArrayList(), kindOfEventList);
            result.addAll(auxList);
          }
        }
        final List<KindOfEvent> distinctKindOfEventList = kindOfEventList.stream().distinct().collect(Collectors.<KindOfEvent>toList());
        this.addDependenciesToUniqueIDMap(rule, distinctKindOfEventList);
        _xblockexpression = result.stream().distinct().collect(Collectors.<String>toList());
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = CollectionLiterals.<String>newArrayList(rule.getFromRule().getEvent().getName());
    }
    return _xifexpression;
  }
  
  public List<String> extractDependencies2(final FollowBy followByExpression, final List<String> dependencies, final List<KindOfEvent> kindOfEventList) {
    List<String> _xblockexpression = null;
    {
      final TerminalExpression leftSide = followByExpression.getLeftSide();
      final EList<TerminalExpression> rightSideList = followByExpression.getRightSide();
      this.extractDependenciesOfLeftSice(leftSide, dependencies, kindOfEventList);
      this.extractDependenciesOfRightSice(rightSideList, dependencies, kindOfEventList);
      _xblockexpression = dependencies;
    }
    return _xblockexpression;
  }
  
  public void extractDependenciesOfRightSice(final List<TerminalExpression> rightSideList, final List<String> dependencies, final List<KindOfEvent> kindOfEventList) {
    for (final TerminalExpression terminalExpression : rightSideList) {
      boolean _isEvery = terminalExpression.isEvery();
      if (_isEvery) {
        this.extractDependencies2(terminalExpression.getEveryExpression(), dependencies, kindOfEventList);
      } else {
        boolean _isParenthesis = terminalExpression.isParenthesis();
        if (_isParenthesis) {
          this.extractDependencies2(terminalExpression.getBetweenParenthesis(), dependencies, kindOfEventList);
        } else {
          dependencies.add(terminalExpression.getSingleDefinition().getSimpleEvents().getName());
          kindOfEventList.add(terminalExpression.getSingleDefinition().getSimpleEvents());
        }
      }
    }
  }
  
  public Object extractDependenciesOfLeftSice(final TerminalExpression terminalExpression, final List<String> dependencies, final List<KindOfEvent> kindOfEventList) {
    Object _xifexpression = null;
    boolean _isEvery = terminalExpression.isEvery();
    if (_isEvery) {
      _xifexpression = this.extractDependencies2(terminalExpression.getEveryExpression(), dependencies, kindOfEventList);
    } else {
      Object _xifexpression_1 = null;
      boolean _isParenthesis = terminalExpression.isParenthesis();
      if (_isParenthesis) {
        _xifexpression_1 = this.extractDependencies2(terminalExpression.getBetweenParenthesis(), dependencies, kindOfEventList);
      } else {
        boolean _xblockexpression = false;
        {
          dependencies.add(terminalExpression.getSingleDefinition().getSimpleEvents().getName());
          _xblockexpression = kindOfEventList.add(terminalExpression.getSingleDefinition().getSimpleEvents());
        }
        _xifexpression_1 = Boolean.valueOf(_xblockexpression);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public void makeIntToRuleNameMap(final List<String> simpleEventList, final List<RuleParts> complexEventList, final Stack<String> stack) {
    int i = 0;
    for (final String simpleEventName : simpleEventList) {
      {
        String _string = Integer.valueOf(i).toString();
        String uniqueID = ((simpleEventName + "_") + _string);
        String _string_1 = Integer.valueOf(i).toString();
        String _plus = ((simpleEventName + "_") + _string_1);
        this.mapSimpleEventToString.put(simpleEventName, _plus);
        this.mapUniqueId.put(uniqueID, IterableExtensions.<String>toList(CollectionLiterals.<String>newArrayList()));
        i++;
      }
    }
    for (final RuleParts complexEvent : complexEventList) {
      {
        String _name = complexEvent.getInsert().getName();
        String _plus = (_name + "_");
        String _string = Integer.valueOf(i).toString();
        String uniqueID = (_plus + _string);
        stack.push(uniqueID);
        this.mapRulePartsToString.put(complexEvent.getInsert(), uniqueID);
        this.makeRealPrioritiesMap(complexEvent, uniqueID);
        i++;
      }
    }
  }
  
  public String getUniqueIDForComplexEvent(final RuleParts complexEvent) {
    return this.mapRulePartsToString.get(complexEvent.getInsert());
  }
  
  /**
   * def checkUniqueIDForSimpleEvent(String valueID){
   * val result = mapSimpleEventToString.entrySet.stream.filter[entry | entry.value.equals(valueID)].collect(Collectors.toList())
   * if (result.isEmpty){
   * return null
   * } else {
   * result.get(0).key
   * }
   * }
   * 
   * def checkUniqueIDForComplexEvent(String valueID){
   * val result = mapRulePartsToString.entrySet.stream.filter[entry | entry.value.equals(valueID)].collect(Collectors.toList())
   * if (result.isEmpty){
   * return null
   * } else {
   * result.get(0).key.name
   * }
   * }
   */
  public List<String> addDependenciesToUniqueIDMap(final RuleParts rule, final List<KindOfEvent> dependencies) {
    List<String> _xblockexpression = null;
    {
      final ArrayList<String> newDependenciesList = new ArrayList<String>();
      for (final KindOfEvent kindOfEvent : dependencies) {
        if ((kindOfEvent instanceof Event)) {
          newDependenciesList.add(this.mapSimpleEventToString.get(((Event)kindOfEvent).getName()));
        } else {
          newDependenciesList.addAll(this.getAllIDWithTheSameInsertInto(kindOfEvent.getName()));
        }
      }
      _xblockexpression = this.mapUniqueId.put(this.getUniqueIDForComplexEvent(rule), newDependenciesList.stream().distinct().collect(Collectors.<String>toList()));
    }
    return _xblockexpression;
  }
  
  public List<String> getAllIDWithTheSameInsertInto(final String insertName) {
    final Predicate<Map.Entry<Insert, String>> _function = (Map.Entry<Insert, String> entry) -> {
      return entry.getKey().getName().equals(insertName);
    };
    final Function<Map.Entry<Insert, String>, String> _function_1 = (Map.Entry<Insert, String> entry) -> {
      return entry.getValue();
    };
    return this.mapRulePartsToString.entrySet().stream().filter(_function).<String>map(_function_1).collect(Collectors.<String>toList());
  }
  
  public Integer makeRealPrioritiesMap(final RuleParts complexEvent, final String uniqueID) {
    int _xifexpression = (int) 0;
    Priority _priority = complexEvent.getPriority();
    boolean _tripleEquals = (_priority == null);
    if (_tripleEquals) {
      _xifexpression = 0;
    } else {
      _xifexpression = complexEvent.getPriority().getPriorityInt();
    }
    return this.mapRealPriorities.put(uniqueID, Integer.valueOf(_xifexpression));
  }
  
  public void makePriorityMap(final GraphUtils graphUtils) {
    final Consumer<Map.Entry<Insert, String>> _function = (Map.Entry<Insert, String> entry) -> {
      String _value = entry.getValue();
      int _priority = graphUtils.getPriority(entry.getValue());
      int _minus = (_priority - 1);
      this.mapGeneratedPriorities.put(_value, Integer.valueOf(_minus));
    };
    this.mapRulePartsToString.entrySet().forEach(_function);
  }
}
