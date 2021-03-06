/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot ECS Crew
 */

public class ECSCrew extends ArmyCrew {
	
	// List of Crew Member titles
	private static final String[] TITLES = 
		{"TCA", "TCO", "Commo"};
	
	// Constructor
	public ECSCrew() {
		super("ECS", new CrewMember[3], TITLES);
	}
}
