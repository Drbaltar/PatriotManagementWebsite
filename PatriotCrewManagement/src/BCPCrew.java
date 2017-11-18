/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot BCP Crew
 */

public class BCPCrew extends ArmyCrew {

	// List of Crew Member titles
	private static final String[] TITLES = 
		{"TPW Operator", "RTO", "JWARN"};
	
	// Constructor
	public BCPCrew() {
		super("BCP", new CrewMember[3], TITLES);
	}
}
