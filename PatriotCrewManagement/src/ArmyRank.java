import java.util.HashMap;
import java.util.Map;

/*
 * License: There is no applicable license
 * Author: CW2 Kyle T. McCain
 * Date: 22OCT2017
 * 
 * Description: Enumeration that represents a rank available in the US Army, 
 * It cannot represent either Sergeant Major of the Army (SMA) or the 
 * General of the Army (GOA).
 */

public enum ArmyRank implements Comparable<ArmyRank> {
	// Enlisted Ranks (minus Sergeant Major of the Army)
	PVT		("PVT", "Private", "E-1"),
	PV2		("PV2", "Private Second Class", "E-2"),
	PFC		("PFC", "Private First Class", "E-3"),
	SPC		("SPC", "Specialist", "E-4"),
	CPL		("CPL", "Corporal", "E-4"),
	SGT		("SGT", "Sergeant", "E-5"),
	SSG		("SSG", "Staff Sergeant", "E-6"),
	SFC		("SFC", "Sergeant First Class", "E-7"),
	MSG		("MSG", "Master Sergeant", "E-8"),
	_1SG	("1SG", "First Sergeant", "E-8"),
	SGM		("SGM", "Sergeant Major", "E-9"),
	CSM		("CSM", "Command Sergeant Major", "E-9"),
	
	// Warrant Officer Ranks
	WO1		("WO1", "Warrant Officer 1", "W-1"),
	CW2		("CW2", "Chief Warrant Officer 2", "W-2"),
	CW3		("CW3", "Chief Warrant Officer 3", "W-3"),
	CW4		("CW4", "Chief Warrant Officer 4", "W-4"),
	CW5		("CW5", "Chief Warrant Officer 5", "W-5"),
	
	// Officer Ranks (minus General of the Army)
	_2LT	("2LT", "Second Lieutenant", "O-1"),
	_1LT	("1LT", "First Lieutenant", "O-2"),
	CPT		("CPT", "Captain", "O-3"),
	MAJ		("MAJ", "Major", "O-4"),
	LTC		("LTC", "Lieutenant Colonel", "O-5"),
	COL		("COL", "Colonel", "O-6"),
	BG		("BG", "Brigadier General", "O-7"),
	MG		("MG", "Major General", "O-8"),
	LTG		("LTG", "Lieutenant General", "O-9"),
	GEN		("GEN", "General", "O-10");
	
	// Class members
	private String rankShort;		// Shorthand version of rank (i.e PFC)
	private String rankLong;		// Long version of rank (i.e Private First Class)
	private String grade;			// Pay grade of rank
	
	// Static HashMap with all the enum values and short-hand version of rank
	private static Map<String, ArmyRank> ranksShort;
	
	// Static block used to initialize the HashMap used for rank lookup
	static {
		ranksShort = new HashMap<String, ArmyRank>();
		
		for (ArmyRank rank : ArmyRank.values()) {
			ranksShort.put(rank.getRankShort(), rank);
		}
	}
	
	// Constructor
	private ArmyRank(String rankShort, String rankLong, String grade) {
		this.rankShort = rankShort;
		this.rankLong = rankLong;
		this.grade = grade;
	}
	
	// Get method for short-hand of rank
	public String getRankShort() {
		return rankShort;
	}
	
	// Get method for long-hand of rank
	public String getRankLong() {
		return rankLong;
	}
	
	// Get method for grade of rank
	public String getGrade() {
		return grade;
	}
	
	// Returns the enumeration value that corresponds with the input String (if valid)
	public static ArmyRank getRank(String rank) {
		return ranksShort.get(rank);
	}
	
	// Returns true if passed in rank is a valid rank for promotion
	public static boolean isPromotionPossible(ArmyRank rank) {
		if (rank == ArmyRank.SGM || rank == ArmyRank.CSM
				|| rank == ArmyRank.CW5 || rank == ArmyRank.GEN) {
			return false;
		} else {
			return true;
		}
	}
	
	// Returns true if current rank is a valid rank for promotion
	public boolean isPromotionPossible() {
		if (this == ArmyRank.SGM || this == ArmyRank.CSM
				|| this == ArmyRank.CW5 || this == ArmyRank.GEN) {
			return false;
		} else {
			return true;
		}
	}
	
	// Returns true if passed in rank is a valid rank for demotion
	public static boolean isDemotionPossible(ArmyRank rank) {
		if (rank == ArmyRank.PVT || rank == ArmyRank.WO1 ||  rank == ArmyRank._2LT) {
			return false;
		} else {
			return true;
		}
	}
	
	// Returns true if current rank is a valid rank for demotion
	public boolean isDemotionPossible() {
		if (this == ArmyRank.PVT || this == ArmyRank.WO1 ||  this == ArmyRank._2LT) {
			return false;
		} else {
			return true;
		}
	}
}
