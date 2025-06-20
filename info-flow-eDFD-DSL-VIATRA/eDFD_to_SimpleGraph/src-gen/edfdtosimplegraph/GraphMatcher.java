/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import edfdtosimplegraph.GraphMatch;
import edfdtosimplegraph.util.GraphQuerySpecification;
import graph.Graph;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

import java.util.stream.Collectors;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the edfdtosimplegraph.Graph pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link GraphMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern Graph(g : Graph){
 * 	Graph(g);
 * }
 * </pre></code>
 * 
 * @see GraphMatch
 * @see GraphProcessor
 * @see GraphQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class GraphMatcher extends BaseMatcher<GraphMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static GraphMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    GraphMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (GraphMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static GraphMatcher create() throws ViatraQueryException {
    return new GraphMatcher();
  }
  
  private final static int POSITION_G = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GraphMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private GraphMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return matches represented as a GraphMatch object.
   * 
   */
  public Collection<GraphMatch> getAllMatches(final Graph pG) {
	    return rawStreamAllMatches(new Object[] { pG })   // Stream<GraphMatch>
	           .collect(Collectors.toSet());              // → Collection<GraphMatch>
	}


  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return a match represented as a GraphMatch object, or null if no match is found.
   * 
   */
  public GraphMatch getOneArbitraryMatch(final Graph pG) {
    return rawGetOneArbitraryMatch(new Object[]{pG})
    		.orElse(null);
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Graph pG) {
    return rawHasMatch(new Object[]{pG});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Graph pG) {
    return rawCountMatches(new Object[]{pG});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Graph pG, java.util.function.Consumer<? super GraphMatch> processor) {
    rawForEachMatch(new Object[]{pG}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Graph pG, java.util.function.Consumer<? super GraphMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pG}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public GraphMatch newMatch(final Graph pG) {
    return GraphMatch.newMatch(pG);
  }
  
  /**
   * Retrieve the set of values that occur in matches for g.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Graph> rawAccumulateAllValuesOfg(final Object[] parameters) {
    Set<Graph> results = new HashSet<Graph>();
    rawAccumulateAllValues(POSITION_G, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for g.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Graph> getAllValuesOfg() {
    return rawAccumulateAllValuesOfg(emptyArray());
  }
  
  @Override
  protected GraphMatch tupleToMatch(final Tuple t) {
    try {
        return GraphMatch.newMatch((Graph) t.get(POSITION_G));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected GraphMatch arrayToMatch(final Object[] match) {
    try {
        return GraphMatch.newMatch((Graph) match[POSITION_G]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected GraphMatch arrayToMatchMutable(final Object[] match) {
    try {
        return GraphMatch.newMutableMatch((Graph) match[POSITION_G]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<GraphMatcher> querySpecification() throws ViatraQueryException {
    return GraphQuerySpecification.instance();
  }
}
