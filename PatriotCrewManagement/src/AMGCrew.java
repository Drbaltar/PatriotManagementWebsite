/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 12NOV2017
 * 
 * Description: Class that represents a Patriot AMG Crew
 */

public class AMGCrew extends ArmyCrew {
	
	// List of Crew Member titles
	private static final String[] TITLES = 
		{"Crew Member 1", "Crew Member 2", "Crew Member 3"};
	
	// Constructor
	public AMGCrew() {
		super("AMG", new CrewMember[3], TITLES);
	}
}
