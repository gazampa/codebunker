import music.scales.HeptatonicMajorScale;
import music.scales.ChromaticScale;
import music.scales.chords.HeptatonicMajorTriads;
public class MakeBeautifulMusic{

	public static void main(String[] args){

		ChromaticScale chromaticScale = new ChromaticScale("G");
		HeptatonicMajorScale majorA =  new HeptatonicMajorScale("G");
		HeptatonicMajorTriads Atriads = new HeptatonicMajorTriads("A");
		HeptatonicMajorTriads Btriads= new HeptatonicMajorTriads("B");
		HeptatonicMajorTriads Ctriads= new HeptatonicMajorTriads("C");
		HeptatonicMajorTriads Dtriads= new HeptatonicMajorTriads("D");
		HeptatonicMajorTriads Etriads= new HeptatonicMajorTriads("E");
		HeptatonicMajorTriads Ftriads= new HeptatonicMajorTriads("F");
		HeptatonicMajorTriads Gtriads= new HeptatonicMajorTriads("G");
		System.out.println("Chromatic : "+chromaticScale.toString());
		System.out.println("Major : "+majorA.toString());
		System.out.println();
		System.out.println(Atriads.buildTriads());
		System.out.println(Btriads.buildTriads());
		System.out.println(Ctriads.buildTriads());
		System.out.println(Dtriads.buildTriads());
		System.out.println(Etriads.buildTriads());
		System.out.println(Ftriads.buildTriads());
		System.out.println(Gtriads.buildTriads());
	}

}