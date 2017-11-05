import java.time.LocalDate;

/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 1NOV2017
 * 
 * Description: Class that represents a Soldier in the US Army
 */

public class Soldier {
	
	// Class members
	private String firstName;
	private String lastName;
	private ArmyRank rank;
	private String mos;
	private LocalDate lossDate;
	
	// Constructor with just last name and rank
	public Soldier(String lastName, String rankString) {
		this.lastName = lastName;
		this.rank = ArmyRank.getRank(rankString);
	}
	
	// Full constructor to initialize all class members
	public Soldier(String firstName, String lastName, String rankString, String mos, LocalDate lossDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rank = ArmyRank.getRank(rankString);
		this.mos = mos;
		this.lossDate = lossDate;
	}
	
	// Get method for Soldier's first name
	public String getFirstName() {
		return firstName;
	}
	
	// Set method for Soldier's first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Get method for Soldier's last name
	public String getLastName() {
		return lastName;
	}
	
	// Set method for Soldier's last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Get method for Soldier's rank as an ArmyRank object
	public ArmyRank getRank() {
		return rank;
	}
	
	// Get method for Soldier's rank as a String
	public String getRankString() {
		return rank.getRankShort();
	}
	
	// Set method for Soldier's rank
	public void setRank(ArmyRank rank) {
		this.rank = rank;
	}
	
	// set method for Soldier's rank as a String
	public boolean setRankString(String rank) {
		ArmyRank newRank = ArmyRank.getRank(rank);

		// Returns true if the input string was a valid short-hand rank
		if (newRank == null) { 
			return false;
		}
		else {
			this.rank = newRank;
			return true;
		}
	}

	// Get method for Soldier's MOS
	public String getMOS() {
		return mos;
	}
	
	// Set method for Soldier's MOS
	public void setMos(String mos) {
		this.mos = mos;
	}

	// Get method for Soldier's loss date
	public LocalDate getLossDate() {
		return lossDate;
	}
	
	// Set method for Soldier's loss date
	public void setLossDate(LocalDate lossDate) {
		this.lossDate = lossDate;
	}

	// Returns whether Soldier out-ranks the Soldier passed in
	public boolean outrank(Soldier otherSoldier) {
		if (this.rank.compareTo(otherSoldier.rank) <= 0) {
			return false;
		} else {
			return true;
		}
	}
}
