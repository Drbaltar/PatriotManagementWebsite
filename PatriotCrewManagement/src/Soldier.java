import java.util.Date;

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
	private Date lossDate;
	
	// Constructor with just last name and rank
	public Soldier(String lastName, String rankString) {
		this.lastName = lastName;
		this.rank = ArmyRank.getRank(rankString);
	}
	
	// Full constructor to initialize all class members
	public Soldier(String firstName, String lastName, String rankString, String mos, Date lossDate) {
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
	
	// Get method for Soldier's last name
	public String getLastName() {
		return lastName;
	}
	
	// Get method for Soldier's rank as an ArmyRank object
	public ArmyRank getRank() {
		return rank;
	}
	
	// Get method for Soldier's rank as a String
	public String getRankString() {
		return rank.getRankShort();
	}
	
	// Get method for Soldier's MOS
	public String getMOS() {
		return mos;
	}
	
	// Get method for Soldier's loss date
	public Date getLossDate() {
		return lossDate;
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
