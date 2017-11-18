/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 12NOV2017
 * 
 * Description: Class that represents a Patriot AMG Crew
 */

public class AMGCrew extends ArmyCrew {
	
	private static final String[] TITLES = 
		{"Crewmember 1", "Crewmember 2", "Crewmember 3"};
	
	public AMGCrew() {
		super("AMG", new CrewMember[3], TITLES);
	}
}
