/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 18NOV2017
 * 
 * Description: Class that represents a Patriot EPP Crew
 */

public class EPPCrew extends ArmyCrew {
	
	private static final String[] TITLES = 
		{"Crewmember 1", "Crewmember 2"};
	
	public EPPCrew() {
		super("EPP", new CrewMember[2], TITLES);
	}
}
