/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph.util;

import edfdtosimplegraph.GraphMatch;
import graph.Graph;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the edfdtosimplegraph.Graph pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GraphProcessor implements IMatchProcessor<GraphMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pG the value of pattern parameter g in the currently processed match
   * 
   */
  public abstract void process(final Graph pG);
  
  @Override
  public void process(final GraphMatch match) {
    process(match.getG());
  }
}
