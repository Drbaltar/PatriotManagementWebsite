
public class ArmyRankTest {
	public static void main (String[] args) {
//		System.out.println(ArmyRank._1LT.getRankLong());
//		
//		
//		ArmyRank testRank = ArmyRank.getRank("PFC");
//		if (testRank != null) {
//			System.out.println(testRank.getRankLong());
//		}
		
		Soldier mccain = new Soldier("McCain", "CW2");
		Soldier davis = new Soldier("Davis", "SGT");
		
		System.out.println("McCain outranks Davis: " + mccain.outrank(davis));
		
//		System.out.println(mccain.getRank().getRankLong());
//		
//		for (ArmyRank rank : ArmyRank.values()) {
//			System.out.print(rank.getRankShort() + " : ");
//			System.out.print(rank.getRankLong() + " : ");
//			System.out.print(rank.getGrade() + " : ");
//			System.out.println(rank.ordinal());
//		}
//		
//		System.out.println(ArmyRank._1LT.compareTo(ArmyRank.CPT));
	}
}