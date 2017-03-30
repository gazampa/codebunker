import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class BoxAddition{

	static ClassCoverageResultComparatorA comparator;

	public static void main(String[] args){

		log("hello cleavland");

		CodeCoverageResult[] coverageResults = new CodeCoverageResult[50];
		StringBuilder name = new StringBuilder();
		for (int i = 0; i < 50; i++ ){
			name.append("A");
			CodeCoverageResult coverageResult = new CodeCoverageResult();
			coverageResult.setNumLocationsNotCovered(new Integer(i));
			coverageResult.setNumLocations(new Integer(i*2+10));
			coverageResult.setName(name.toString());
			coverageResults[i] = coverageResult;
		}

		long begin = System.currentTimeMillis();
		double overallCoverage = 0.0;
		if (coverageResults != null) {

			// create a list of coverage result wrapper
			ClassCoverageResult[] listClassCoverageResult = new ClassCoverageResult[coverageResults.length];
			ArrayList<ClassCoverageResult> sortableList = new ArrayList<ClassCoverageResult>();

			int totalCovered = 0;
			int totalNotCovered = 0;
			int i = 0;
			// iterate through the results
			for (CodeCoverageResult result : coverageResults) {

				// add a wrapper instance
				listClassCoverageResult[i] = new ClassCoverageResult();
				sortableList.add(listClassCoverageResult[i]);
				// get the number of lines not covered
				int numOfLinesNotCovered = result.getNumLocationsNotCovered();

				// get the number of lines covered
				int numOfTotalLines = result.getNumLocations();

				Double coverageResult = (((numOfTotalLines - numOfLinesNotCovered) * 1.0)
						/ numOfTotalLines) * 100;

				log(numOfTotalLines + " : " + coverageResult.intValue());

				// set the properties
				listClassCoverageResult[i].setClassName(result.getName());
				listClassCoverageResult[i].setCoveragePercentage(coverageResult.intValue());
				listClassCoverageResult[i].setNumLocations(numOfTotalLines);

				totalCovered+=numOfTotalLines;
				totalNotCovered+=numOfLinesNotCovered;
				i++;
			}

			overallCoverage = ((( totalCovered - totalNotCovered ) *1.0)
						/ totalCovered) *100;

			// write coverage result

			Collections.sort(sortableList, comparator.getComparator(comparator.COVERAGE_ASC_SORT , comparator.NUM_LOCATIONS_DESC_SORT , comparator.NAME_ASC_SORT));

			ClassCoverageResult[] sortedArray = sortableList.toArray(new ClassCoverageResult[sortableList.size()]);

			for ( ClassCoverageResult classDetails : sortedArray ){
				log(" " + classDetails.getCoveragePercentage() + " : " + classDetails.getNumLocations() + " : " + classDetails.getClassName());
			}

		}

		long end = System.currentTimeMillis();

		log("percent " + overallCoverage );

		log("time : "+ (end-begin));

	}

	private static void log(String val){
		System.out.println(val);
	}

}

	class CodeCoverageResult{

		public String name;
		public int numLocations;
		public int numLocationsNotCovered;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumLocations(){
			return numLocations;
		}

		public void setNumLocations(int numLocations){
			this.numLocations = numLocations;
		}

		public int getNumLocationsNotCovered(){
			return numLocationsNotCovered;
		}

		public void setNumLocationsNotCovered(int numLocationsNotCovered){
			this.numLocationsNotCovered = numLocationsNotCovered;
		}

	}

	class ClassCoverageResult{

		public Integer coverPercentage;
		public String className;
		public Integer numLocations;

		public Integer getCoveragePercentage() {
			return this.coverPercentage;
		}

		public void setCoveragePercentage(Integer coveragePercentage) {
			this.coverPercentage = coveragePercentage;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public Integer getNumLocations(){
			return numLocations;
		}

		public void setNumLocations(Integer numLocations){
			this.numLocations = numLocations;
		}

	}

enum ClassCoverageResultComparatorA implements Comparator<ClassCoverageResult>{

    NUM_LOCATIONS_ASC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return Integer.valueOf(o1.getNumLocations()).compareTo(o2.getNumLocations());
        }},
    NUM_LOCATIONS_DESC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return -(Integer.valueOf(o1.getNumLocations()).compareTo(o2.getNumLocations()));
        }},
    COVERAGE_ASC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return Integer.valueOf(o1.getCoveragePercentage()).compareTo(o2.getCoveragePercentage());
        }},
    COVERAGE_DESC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return -(Integer.valueOf(o1.getCoveragePercentage()).compareTo(o2.getCoveragePercentage()));
        }},
    NAME_ASC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return o1.getClassName().compareTo(o2.getClassName());
        }},
    NAME_DESC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return -(o1.getClassName().compareTo(o2.getClassName()));
        }};

    public static Comparator<ClassCoverageResult> descending(final Comparator<ClassCoverageResult> other) {
        return new Comparator<ClassCoverageResult>() {
            public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
                return -1 * other.compare(o1, o2);
            }
        };
    }

    public static Comparator<ClassCoverageResult> getComparator(final ClassCoverageResultComparatorA... multipleOptions) {
        return new Comparator<ClassCoverageResult>() {
            public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
                for (ClassCoverageResultComparatorA option : multipleOptions) {
                    int result = option.compare(o1, o2);
                    if (result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };
    }

}