public interface Intervals{

	int first = 0;

	int perfectFourth = 5;
	int perfectFifth = 7;
	int perfectEighth = 12;

	int majorSecond = 2;
	int majorThird = 4;
	int majorSixth = 9;
	int majorSeventh = 11;

	int minorSecond = majorSecond-1;
	int minorThird= majorThird-1;
	int minorSixth = majorSixth-1;
	int minorSeventh = majorSeventh-1;

	int diminishedFirst = first -1;
	int diminishedSecond = majorSecond-2;
	int diminishedThird = majorThird-2;
	int diminishedFourth = perfectFourth-1;
	int diminishedFifth = perfectFifth-1;
	int diminishedSixth = majorSixth-2;
	int diminishedSeventh = majorSeventh-2;
	int diminishedEighth = perfectEighth-1;

	int augmentedFirst = first+1;
	int augmentedSecond = majorSecond+1;
	int augmentedThird = majorThird+1;
	int augmentedFourth = perfectFourth-1;
	int augmentedFifth = perfectFifth+1;
	int augmentedSixth = majorSixth+1;
	int augmentedSeventh = majorSeventh+1;
	int augmentedEighth = perfectEighth+1;

}