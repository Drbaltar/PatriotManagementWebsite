import java.time.LocalDate;

public class ArmyRankTest {
	public static void main (String[] args) {
		
		Soldier mccain = new Soldier("McCain", "CW2");
		Soldier mccain2 = new Soldier("McCain", "CW2");
		Soldier mccain3 = new Soldier("McCain", "CW2");
		AMGCrew amgCrew = new AMGCrew();
		
		amgCrew.addCrewMember(mccain, 1);
		amgCrew.addCrewMember(mccain2, 2);
		amgCrew.addCrewMember(mccain3, 3);
		
		System.out.println(amgCrew.isCrewFull());
		System.out.println(amgCrew.getBreakDate());
	}
}