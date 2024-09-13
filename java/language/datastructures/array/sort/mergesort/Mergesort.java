import java.util.Arrays;
import java.util.UUID;
public class Mergesort {

	private int[] numbers;
	private int[] helper;

	private int number;

	public void sort(int[] values) {
		this.numbers = values;
		number = values.length;
		this.helper = new int[number];
		mergesort(0, number - 1, "Initial");
	}

	private void mergesort(int low, int high, String order) {
		String uniqueID = UUID.randomUUID().toString();
		//System.out.println(uniqueID + "  -  entering mergesort call ... " + order + " : " + low +  " < " + high);
		// split array by index
		// check if low is smaller then high, then chunk of array is greater than one element
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// continue to split up left side of array by index
			mergesort(low, middle, "LOW");
			// continue to split up right side of array by index
			mergesort(middle + 1, high, "HIGH");
			// put the pieces back together in sorted order
			merge(low, middle, high, uniqueID);
		}
		//System.out.println(uniqueID + "  -  exiting mergesort call ... " + order + " : "  + low +  " < " + high);
	}

	private void merge(int low, int middle, int high, String uniqueId) {
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		//System.out.println(uniqueId + "  -  entering merge ... " + Arrays.toString(numbers) + " : " + Arrays.toString(helper));

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
			System.out.println(uniqueId + "  -  switching ... " + Arrays.toString(numbers) + " : " + Arrays.toString(helper));
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
		System.out.println(uniqueId + "  -  copying ... " + Arrays.toString(numbers) + " : " + Arrays.toString(helper));
	}

}