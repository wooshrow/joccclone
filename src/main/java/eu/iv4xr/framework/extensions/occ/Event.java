package eu.iv4xr.framework.extensions.occ;

import java.util.function.Function;

/**
 * Representing an event. 
 */
public class Event {
	
	public String name ;
	public Function<BeliefBase,BeliefBase> effect ;
	
	public Event() { }
	public Event(String name) { this.name = name ; }
	
	public Event WithEffect(Function<BeliefBase,BeliefBase> e)
    {
        this.effect = e;
        return this;
    }
	
	@Override
	public String toString() { return "Event " + name ; }
	
	public static class Tick extends Event {
		
		public Tick() {
			name = "tick" ;
			effect = bbs -> bbs ; // a tick event does not change the beliefbase...
		}
	}


}
