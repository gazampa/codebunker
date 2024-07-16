package com.sfdc;
import java.util.Comparator;
/**
 * Description: Wrapper clas for coverage result
 *
 * @author Bhawani
 *
 */
public class ClassCoverageResult {

	public Integer coverPercentage;
	public String className;
	public Integer numLocations;
	public Integer numLocationsOpen;

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

	public Integer getNumLocationsOpen(){
		return numLocationsOpen;
	}

	public void setNumLocationsOpen(Integer numLocationsOpen){
		this.numLocationsOpen = numLocationsOpen;
	}

}

enum ClassCoverageResultComparator implements Comparator<ClassCoverageResult>{

    NUM_LOCATIONS_ASC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return Integer.valueOf(o1.getNumLocations()).compareTo(o2.getNumLocations());
        }},
    NUM_LOCATIONS_DESC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return -(Integer.valueOf(o1.getNumLocations()).compareTo(o2.getNumLocations()));
        }},
    NUM_LOCATIONS_NOT_COVERED_ASC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return Integer.valueOf(o1.getNumLocationsOpen()).compareTo(o2.getNumLocationsOpen());
        }},
    NUM_LOCATIONS_NOT_COVERED_DESC_SORT {
        public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
            return -(Integer.valueOf(o1.getNumLocationsOpen()).compareTo(o2.getNumLocationsOpen()));
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

    public static Comparator<ClassCoverageResult> getComparator(final ClassCoverageResultComparator... multipleOptions) {
        return new Comparator<ClassCoverageResult>() {
            public int compare(ClassCoverageResult o1, ClassCoverageResult o2) {
                for (ClassCoverageResultComparator option : multipleOptions) {
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