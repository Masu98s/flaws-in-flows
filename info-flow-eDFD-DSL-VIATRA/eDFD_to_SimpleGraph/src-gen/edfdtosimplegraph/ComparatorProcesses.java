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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern comparatorProcesses(p : Process){
 *         	Process.responsibility.Action(p, pr);
 *         	pr == ResponsibilityType::Comparator;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ComparatorProcesses extends BaseGeneratedEMFQuerySpecification<ComparatorProcesses.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.comparatorProcesses pattern,
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
    private org.secdfd.model.Process fP;

    private static List<String> parameterNames = makeImmutableList("p");

    private Match(final org.secdfd.model.Process pP) {
      this.fP = pP;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "p": return this.fP;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fP;
          default: return null;
      }
    }

    public org.secdfd.model.Process getP() {
      return this.fP;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("p".equals(parameterName) ) {
          this.fP = (org.secdfd.model.Process) newValue;
          return true;
      }
      return false;
    }

    public void setP(final org.secdfd.model.Process pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.comparatorProcesses";
    }

    @Override
    public List<String> parameterNames() {
      return ComparatorProcesses.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fP};
    }

    @Override
    public ComparatorProcesses.Match toImmutable() {
      return isMutable() ? newMatch(fP) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"p\"=" + prettyPrintValue(fP));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fP);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ComparatorProcesses.Match)) {
          ComparatorProcesses.Match other = (ComparatorProcesses.Match) obj;
          return Objects.equals(fP, other.fP);
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
    public ComparatorProcesses specification() {
      return ComparatorProcesses.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ComparatorProcesses.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ComparatorProcesses.Match newMutableMatch(final org.secdfd.model.Process pP) {
      return new Mutable(pP);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ComparatorProcesses.Match newMatch(final org.secdfd.model.Process pP) {
      return new Immutable(pP);
    }

    private static final class Mutable extends ComparatorProcesses.Match {
      Mutable(final org.secdfd.model.Process pP) {
        super(pP);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ComparatorProcesses.Match {
      Immutable(final org.secdfd.model.Process pP) {
        super(pP);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.comparatorProcesses pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern comparatorProcesses(p : Process){
   * 	Process.responsibility.Action(p, pr);
   * 	pr == ResponsibilityType::Comparator;
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ComparatorProcesses
   * 
   */
  public static class Matcher extends BaseMatcher<ComparatorProcesses.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ComparatorProcesses.Matcher on(final ViatraQueryEngine engine) {
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
    public static ComparatorProcesses.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_P = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ComparatorProcesses.Matcher.class);

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
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ComparatorProcesses.Match> getAllMatches(final org.secdfd.model.Process pP) {
      return rawStreamAllMatches(new Object[]{pP}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ComparatorProcesses.Match> streamAllMatches(final org.secdfd.model.Process pP) {
      return rawStreamAllMatches(new Object[]{pP});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ComparatorProcesses.Match> getOneArbitraryMatch(final org.secdfd.model.Process pP) {
      return rawGetOneArbitraryMatch(new Object[]{pP});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final org.secdfd.model.Process pP) {
      return rawHasMatch(new Object[]{pP});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final org.secdfd.model.Process pP) {
      return rawCountMatches(new Object[]{pP});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final org.secdfd.model.Process pP, final Consumer<? super ComparatorProcesses.Match> processor) {
      rawForEachMatch(new Object[]{pP}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final org.secdfd.model.Process pP, final Consumer<? super ComparatorProcesses.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pP}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ComparatorProcesses.Match newMatch(final org.secdfd.model.Process pP) {
      return ComparatorProcesses.Match.newMatch(pP);
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<org.secdfd.model.Process> rawStreamAllValuesOfp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_P, parameters).map(org.secdfd.model.Process.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<org.secdfd.model.Process> getAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<org.secdfd.model.Process> streamAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray());
    }

    @Override
    protected ComparatorProcesses.Match tupleToMatch(final Tuple t) {
      try {
          return ComparatorProcesses.Match.newMatch((org.secdfd.model.Process) t.get(POSITION_P));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ComparatorProcesses.Match arrayToMatch(final Object[] match) {
      try {
          return ComparatorProcesses.Match.newMatch((org.secdfd.model.Process) match[POSITION_P]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ComparatorProcesses.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ComparatorProcesses.Match.newMutableMatch((org.secdfd.model.Process) match[POSITION_P]);
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
    public static IQuerySpecification<ComparatorProcesses.Matcher> querySpecification() {
      return ComparatorProcesses.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.comparatorProcesses pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<ComparatorProcesses.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pP the value of pattern parameter p in the currently processed match
     * 
     */
    public abstract void accept(final org.secdfd.model.Process pP);

    @Override
    public void accept(final ComparatorProcesses.Match match) {
      accept(match.getP());
    }
  }

  private ComparatorProcesses() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ComparatorProcesses instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ComparatorProcesses.Matcher instantiate(final ViatraQueryEngine engine) {
    return ComparatorProcesses.Matcher.on(engine);
  }

  @Override
  public ComparatorProcesses.Matcher instantiate() {
    return ComparatorProcesses.Matcher.create();
  }

  @Override
  public ComparatorProcesses.Match newEmptyMatch() {
    return ComparatorProcesses.Match.newEmptyMatch();
  }

  @Override
  public ComparatorProcesses.Match newMatch(final Object... parameters) {
    return ComparatorProcesses.Match.newMatch((org.secdfd.model.Process) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ComparatorProcesses} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ComparatorProcesses#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ComparatorProcesses INSTANCE = new ComparatorProcesses();

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
    private static final ComparatorProcesses.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_p = new PParameter("p", "org.secdfd.model.Process", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Process")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_p);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.comparatorProcesses";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("p");
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
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_pr = body.getOrCreateVariableByName("pr");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Process")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p)
          ));
          // 	Process.responsibility.Action(p, pr)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Process")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Process", "responsibility")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Responsibility")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Responsibility", "Action")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.secdfd.org/secdfd", "ResponsibilityType")));
          new Equality(body, var__virtual_1_, var_pr);
          // 	pr == ResponsibilityType::Comparator
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, getEnumLiteral("http://www.secdfd.org/secdfd", "ResponsibilityType", "Comparator").getInstance());
          new Equality(body, var_pr, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
