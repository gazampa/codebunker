package music.intervals;
public interface Intervals{
	// Semi Tones
	// Chromatic :  [A, As, B, C, Cs, D, Ds, E, F, Fs, G, Gs, ^A]
	//   Major C :  [C, D, E, F, G, A, B, ^C]       [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major G :  [G, A, B, C, D, E, Fs, ^G]      [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major D :  [D, E, Fs, G, A, B, Cs, ^D]     [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major A :  [A, B, Cs, D, E, Fs, Gs, ^A]    [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major E :  [E, Fs, Gs, A, B, Cs, Ds, ^E]   [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major B :  [B, Cs, Ds, E, Fs, Gs, As, ^B]  [ W, W, H, W, W, W, H ]  [ 2, 4, 5, 7, 9, 11, 12 ]
	//   Major As : [As, C, D, Eb, F, G, A, ^As] [ As, Bs, Css, Ds, Es, Fss, Gss ] B-flat major
	//   Major Ds : [Ds, F, G, Ab, Bb, C, D, ^Ds] [Ds,Es ,Fss ,Gs ,As ,Bs ,Css ] Eb Major scale = Eb-F-G-Ab-Bb-C-D
	//   Major Fs : [Fs, Gs, As, B, Cs, Ds, Es, ^Fs]
	//   Major Cs : [Cs, Ds, Es, Fs, Gs, As, Bs, ^Cs]
	//   Major Gs : [Gs, As, Bs, Cs, Ds, Es, Fss, ^Gs] A Flat major
	int first = 0;

	int perfectFourth = 5;
	int perfectFifth = 7;
	int perfectEighth = 12;

	int majorSecond = 2;
	int majorThird = 4;
	int majorSixth = 9;
	int majorSeventh = 11;

	int minorSecond = majorSecond-1;
	int minorThird = majorThird-1;
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