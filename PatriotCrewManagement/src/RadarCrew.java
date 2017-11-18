/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot Radar Crew
 */

public class RadarCrew extends ArmyCrew {

	// List of Crew Member titles
	private static final String[] TITLES = 
		{"Crew Member 1", "Crew Member 2", "Crew Member 3", "Crew Member 4"};
	
	// Constructor
	public RadarCrew() {
		super("Radar", new CrewMember[4], TITLES);
	}
}
