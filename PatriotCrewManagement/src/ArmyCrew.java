import java.time.LocalDate;

/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 5NOV2017
 * 
 * Description: Abstract class that represents an Army crew that is 
 * put together for a specific function or task.
 */

public abstract class ArmyCrew {
	
	// Class members 
	private CrewMember[] crewMembers;
	private String[] crewMemberTitles;
	private LocalDate breakDate;
	private boolean isFull;
	
	// Constructor
	public ArmyCrew(CrewMember[] crewMembers, String[] crewMemberTitles) {
		this.crewMembers = crewMembers;
		this.crewMemberTitles = crewMemberTitles;
		this.isFull = false;
	}
	
	// Adds a crew member to the crew and returns true if successfully added
	public boolean addCrewMember(Soldier soldier, int crewPosition) {
		if (crewPosition > 0 && crewPosition <= crewMembers.length) {
			// Create a new CrewMember object
			CrewMember crewMember = new CrewMember(soldier, 
					crewMemberTitles[crewPosition - 1], crewPosition);
			
			// Insert new CrewMember into the crew array
			crewMembers[crewPosition - 1] = crewMember;
			checkCrewFull();
			return true;
		} else {
			return false;
		}
	}

	// Get method for individual crew members on the crew
	public CrewMember getCrewMember(int crewPosition) {
		if (crewPosition > 0 && crewPosition <= crewMembers.length) {
			return crewMembers[crewPosition - 1];
		} else {
			return null;
		}
	}

	// Get method for the crew member's break date
	public LocalDate getBreakDate() {
		return breakDate;
	}

	// Set method for the crew member's break date
	public void setBreakDate(LocalDate breakDate) {
		this.breakDate = breakDate;
	}

	// Returns true if the crew is full
	public boolean isCrewFull() {
		return isFull;
	}

	// Helper method to check if the crew is full 
	private void checkCrewFull() {
		for (CrewMember member : crewMembers) {
			if (member == null) {
				isFull = false;
				return;
			}
		}
		
		// Change isFull to true is no empty crew positions are found
		isFull = true;
	}
}
