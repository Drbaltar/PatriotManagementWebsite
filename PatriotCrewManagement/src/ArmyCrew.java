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
	private String crewType;
	private CrewMember[] crewMembers;
	private String[] crewMemberTitles;
	private LocalDate breakDate;
	private boolean isFull;
	
	// Constructor
	public ArmyCrew(String crewType, CrewMember[] crewMembers, String[] crewMemberTitles) {
		this.crewType = crewType;
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
			setBreakDate();
			return true;
		} else {
			return false;
		}
	}
	
	// Get method for the type of crew the object represents
	public String getCrewType() {
		return crewType;
	}

	// Get method for individual crew members on the crew
	public CrewMember getCrewMember(int crewPosition) {
		if (crewPosition > 0 && crewPosition <= crewMembers.length) {
			return crewMembers[crewPosition - 1];
		} else {
			return null;
		}
	}

	// Get method for the crew's break date
	public LocalDate getBreakDate() {
		return breakDate;
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
	
	/*
	// Helper method that sets the break date for the crew if full
	private void setBreakDate() {
		// Do not perform any further operations if crew isn't full
		if (!isFull) {
			return;
		}
		
		// Create new date to represent earliest loss date of crew members
		LocalDate earliestDate;
		
		// Iterate through crewmembers and find earliest loss date
		for (CrewMember crewMember : crewMembers) {
			LocalDate testDate = crewMember.getSoldier().getLossDate();
			
			// Assign crew member loss date as earliest if no date is already assigned
			if (testDate != null && earliestDate == null) {
				earliestDate = testDate;
			} else if (testDate != null && testDate.isBefore(earliestDate)) {
				earliestDate = testDate 
			}
		}
	}
	*/
}
