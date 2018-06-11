/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import edfdtosimplegraph.util.GraphQuerySpecification;
import graph.Graph;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the edfdtosimplegraph.Graph pattern,
 * to be used in conjunction with {@link GraphMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GraphMatcher
 * @see GraphProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class GraphMatch extends BasePatternMatch {
  private Graph fG;
  
  private static List<String> parameterNames = makeImmutableList("g");
  
  private GraphMatch(final Graph pG) {
    this.fG = pG;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("g".equals(parameterName)) return this.fG;
    return null;
  }
  
  public Graph getG() {
    return this.fG;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("g".equals(parameterName) ) {
        this.fG = (Graph) newValue;
        return true;
    }
    return false;
  }
  
  public void setG(final Graph pG) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fG = pG;
  }
  
  @Override
  public String patternName() {
    return "edfdtosimplegraph.Graph";
  }
  
  @Override
  public List<String> parameterNames() {
    return GraphMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fG};
  }
  
  @Override
  public GraphMatch toImmutable() {
    return isMutable() ? newMatch(fG) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"g\"=" + prettyPrintValue(fG)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fG == null) ? 0 : fG.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof GraphMatch)) { // this should be infrequent
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        if (!specification().equals(otherSig.specification()))
            return false;
        return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GraphMatch other = (GraphMatch) obj;
    if (fG == null) {if (other.fG != null) return false;}
    else if (!fG.equals(other.fG)) return false;
    return true;
  }
  
  @Override
  public GraphQuerySpecification specification() {
    try {
        return GraphQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static GraphMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static GraphMatch newMutableMatch(final Graph pG) {
    return new Mutable(pG);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pG the fixed value of pattern parameter g, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static GraphMatch newMatch(final Graph pG) {
    return new Immutable(pG);
  }
  
  private static final class Mutable extends GraphMatch {
    Mutable(final Graph pG) {
      super(pG);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends GraphMatch {
    Immutable(final Graph pG) {
      super(pG);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
