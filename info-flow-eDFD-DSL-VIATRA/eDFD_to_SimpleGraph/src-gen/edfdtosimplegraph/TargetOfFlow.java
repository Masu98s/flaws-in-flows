/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.secdfd.model.Element;
import org.secdfd.model.Flow;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern targetOfFlow(f : Flow, target : Element){
 *         	Flow.target(f, target);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TargetOfFlow extends BaseGeneratedEMFQuerySpecification<TargetOfFlow.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.targetOfFlow pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Flow fF;

    private Element fTarget;

    private static List<String> parameterNames = makeImmutableList("f", "target");

    private Match(final Flow pF, final Element pTarget) {
      this.fF = pF;
      this.fTarget = pTarget;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "f": return this.fF;
          case "target": return this.fTarget;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fF;
          case 1: return this.fTarget;
          default: return null;
      }
    }

    public Flow getF() {
      return this.fF;
    }

    public Element getTarget() {
      return this.fTarget;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("f".equals(parameterName) ) {
          this.fF = (Flow) newValue;
          return true;
      }
      if ("target".equals(parameterName) ) {
          this.fTarget = (Element) newValue;
          return true;
      }
      return false;
    }

    public void setF(final Flow pF) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fF = pF;
    }

    public void setTarget(final Element pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.targetOfFlow";
    }

    @Override
    public List<String> parameterNames() {
      return TargetOfFlow.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fF, fTarget};
    }

    @Override
    public TargetOfFlow.Match toImmutable() {
      return isMutable() ? newMatch(fF, fTarget) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"f\"=" + prettyPrintValue(fF) + ", ");
      result.append("\"target\"=" + prettyPrintValue(fTarget));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fF, fTarget);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TargetOfFlow.Match)) {
          TargetOfFlow.Match other = (TargetOfFlow.Match) obj;
          return Objects.equals(fF, other.fF) && Objects.equals(fTarget, other.fTarget);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }

    @Override
    public TargetOfFlow specification() {
      return TargetOfFlow.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TargetOfFlow.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TargetOfFlow.Match newMutableMatch(final Flow pF, final Element pTarget) {
      return new Mutable(pF, pTarget);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TargetOfFlow.Match newMatch(final Flow pF, final Element pTarget) {
      return new Immutable(pF, pTarget);
    }

    private static final class Mutable extends TargetOfFlow.Match {
      Mutable(final Flow pF, final Element pTarget) {
        super(pF, pTarget);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends TargetOfFlow.Match {
      Immutable(final Flow pF, final Element pTarget) {
        super(pF, pTarget);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.targetOfFlow pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern targetOfFlow(f : Flow, target : Element){
   * 	Flow.target(f, target);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see TargetOfFlow
   * 
   */
  public static class Matcher extends BaseMatcher<TargetOfFlow.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TargetOfFlow.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }

    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static TargetOfFlow.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_F = 0;

    private static final int POSITION_TARGET = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TargetOfFlow.Matcher.class);

    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }

    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TargetOfFlow.Match> getAllMatches(final Flow pF, final Element pTarget) {
      return rawStreamAllMatches(new Object[]{pF, pTarget}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TargetOfFlow.Match> streamAllMatches(final Flow pF, final Element pTarget) {
      return rawStreamAllMatches(new Object[]{pF, pTarget});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TargetOfFlow.Match> getOneArbitraryMatch(final Flow pF, final Element pTarget) {
      return rawGetOneArbitraryMatch(new Object[]{pF, pTarget});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Flow pF, final Element pTarget) {
      return rawHasMatch(new Object[]{pF, pTarget});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Flow pF, final Element pTarget) {
      return rawCountMatches(new Object[]{pF, pTarget});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Flow pF, final Element pTarget, final Consumer<? super TargetOfFlow.Match> processor) {
      rawForEachMatch(new Object[]{pF, pTarget}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Flow pF, final Element pTarget, final Consumer<? super TargetOfFlow.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pF, pTarget}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TargetOfFlow.Match newMatch(final Flow pF, final Element pTarget) {
      return TargetOfFlow.Match.newMatch(pF, pTarget);
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Flow> rawStreamAllValuesOff(final Object[] parameters) {
      return rawStreamAllValues(POSITION_F, parameters).map(Flow.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff(final TargetOfFlow.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff(final Element pTarget) {
      return rawStreamAllValuesOff(new Object[]{null, pTarget});
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff(final TargetOfFlow.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff(final Element pTarget) {
      return rawStreamAllValuesOff(new Object[]{null, pTarget}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOftarget(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGET, parameters).map(Element.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOftarget(final TargetOfFlow.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOftarget(final Flow pF) {
      return rawStreamAllValuesOftarget(new Object[]{pF, null});
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOftarget(final TargetOfFlow.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOftarget(final Flow pF) {
      return rawStreamAllValuesOftarget(new Object[]{pF, null}).collect(Collectors.toSet());
    }

    @Override
    protected TargetOfFlow.Match tupleToMatch(final Tuple t) {
      try {
          return TargetOfFlow.Match.newMatch((Flow) t.get(POSITION_F), (Element) t.get(POSITION_TARGET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TargetOfFlow.Match arrayToMatch(final Object[] match) {
      try {
          return TargetOfFlow.Match.newMatch((Flow) match[POSITION_F], (Element) match[POSITION_TARGET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TargetOfFlow.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TargetOfFlow.Match.newMutableMatch((Flow) match[POSITION_F], (Element) match[POSITION_TARGET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<TargetOfFlow.Matcher> querySpecification() {
      return TargetOfFlow.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.targetOfFlow pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<TargetOfFlow.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pF the value of pattern parameter f in the currently processed match
     * @param pTarget the value of pattern parameter target in the currently processed match
     * 
     */
    public abstract void accept(final Flow pF, final Element pTarget);

    @Override
    public void accept(final TargetOfFlow.Match match) {
      accept(match.getF(), match.getTarget());
    }
  }

  private TargetOfFlow() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TargetOfFlow instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected TargetOfFlow.Matcher instantiate(final ViatraQueryEngine engine) {
    return TargetOfFlow.Matcher.on(engine);
  }

  @Override
  public TargetOfFlow.Matcher instantiate() {
    return TargetOfFlow.Matcher.create();
  }

  @Override
  public TargetOfFlow.Match newEmptyMatch() {
    return TargetOfFlow.Match.newEmptyMatch();
  }

  @Override
  public TargetOfFlow.Match newMatch(final Object... parameters) {
    return TargetOfFlow.Match.newMatch((Flow) parameters[0], (Element) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link TargetOfFlow} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TargetOfFlow#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TargetOfFlow INSTANCE = new TargetOfFlow();

    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();

    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }

  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final TargetOfFlow.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_f = new PParameter("f", "org.secdfd.model.Flow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Flow")), PParameterDirection.INOUT);

    private final PParameter parameter_target = new PParameter("target", "org.secdfd.model.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Element")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_f, parameter_target);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.targetOfFlow";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("f","target");
    }

    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }

    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_f = body.getOrCreateVariableByName("f");
          PVariable var_target = body.getOrCreateVariableByName("target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Flow")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Element")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_f, parameter_f),
             new ExportedParameter(body, var_target, parameter_target)
          ));
          // 	Flow.target(f, target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Flow")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_f, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Flow", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Element")));
          new Equality(body, var__virtual_0_, var_target);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
