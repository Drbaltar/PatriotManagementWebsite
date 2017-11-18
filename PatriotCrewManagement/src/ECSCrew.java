/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot ECS Crew
 */

public class ECSCrew extends ArmyCrew {
	
	private static final String[] TITLES = 
		{"TCA", "TCO", "Commo"};
	
	public ECSCrew() {
		super("ECS", new CrewMember[3], TITLES);
	}
}
