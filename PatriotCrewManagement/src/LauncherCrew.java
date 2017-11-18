/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot Launcher Crew
 */

public class LauncherCrew extends ArmyCrew {
	
	// List of Crew Member titles
	private static final String[] TITLES = 
		{"Crew Member 1", "Crew Member 2"};
	
	// Constructor
	public LauncherCrew() {
		super("LS", new CrewMember[2], TITLES);
	}
}
