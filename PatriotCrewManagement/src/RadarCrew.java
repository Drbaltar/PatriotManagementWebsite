/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot Radar Crew
 */

public class RadarCrew extends ArmyCrew {

	private static final String[] TITLES = 
		{"Crewmember 1", "Crewmember 2", "Crewmember 3", "Crewmember 4"};
	
	public RadarCrew() {
		super("Radar", new CrewMember[4], TITLES);
	}
}
