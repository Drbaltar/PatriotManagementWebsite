import java.time.LocalDate;

/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 7NOV2017
 * 
 * Description: Class that represents a crew member for an undetermined crew.
 */

public class CrewMember {
	
	// Class members
	private Soldier soldier;
	private String crewTitle;
	private int crewPosition;
	private LocalDate dateAssigned;
	
	// Constructor
	public CrewMember(Soldier soldier, String crewTitle, int crewPosition) {
		this.soldier = soldier;
		this.crewTitle = crewTitle;
		this.crewPosition = crewPosition;
	}
	
	// Get method for Soldier
	public Soldier getSoldier() {
		return soldier;
	}
	
	// Assigns a Soldier as a crew member
	public void setSoldier(Soldier soldier) {
		this.soldier = soldier;
	}
	
	// Get method for the crew member title (i.e. Tactical Control Officer) 
	public String getCrewTitle() {
		return crewTitle;
	}

	// Get method for crew member position (i.e. Crew Member 4)
	public int getCrewPosition() {
		return crewPosition;
	}
	
	// Get method for crew member assignment date
	public LocalDate getDateAssigned() {
		return dateAssigned;
	}
	
	// Set method for crew member assignment date
	public void setDateAssigned(LocalDate dateAssigned) {
		this.dateAssigned = dateAssigned;
	}
}
