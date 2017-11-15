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
		super(new CrewMember[3]);
	}
	
	// Adds a crew member to the AMG crew and returns true if successfully added
	public boolean addCrewMember(Soldier soldier, int crewPosition) {
		if (crewPosition <= TITLES.length) {
			CrewMember amgCrewMember = new CrewMember(soldier, 
					TITLES[crewPosition - 1], crewPosition);
			
			return insertCrewMember(amgCrewMember, crewPosition);
		} else {
			return false;
		}
	}
}
