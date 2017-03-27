import java.util.*;

public class Mergesort1
{
	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1, 4, 9, 8, 7, 0};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		System.out.println(Arrays.toString(a) + " : " + Arrays.toString(tmp));
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

		String uniqueID = UUID.randomUUID().toString();

		System.out.println(uniqueID + "  -  entering merge ... " + Arrays.toString(a) + " : " + Arrays.toString(tmp) );
		System.out.println(uniqueID + "  -  entering merge ... " + left + " <= " + leftEnd + " :: "+ right + " <= " + rightEnd );

        while(left <= leftEnd && right <= rightEnd){
            System.out.println(uniqueID + "  -  comparing ... " + a[left] + " and " + tmp[k] );
            if(a[left].compareTo(a[right]) <= 0){
                System.out.println(uniqueID + "  -  pushing from left [" + left + "] to tmp [" + k + "] ... " + a[left] + " : " + tmp[k] );
                tmp[k++] = a[left++];
            }else{
                System.out.println(uniqueID + "  -  pushing from right[" + right + "] to tmp[" + k + "] ..." + a[right] + " : " + tmp[k] );
                tmp[k++] = a[right++];
			}
		}

		System.out.println(uniqueID + "  -  post comparison ... " + left + " : " + right );
		System.out.println(uniqueID + "  -  copying ... " + Arrays.toString(a) + " : " + Arrays.toString(tmp));

        while(left <= leftEnd){    // Copy rest of first half
            System.out.println(uniqueID + "  -  finishing left[" + left + "] to tmp[" + k + "] ... " + a[left] + " : " + tmp[k] );
            tmp[k++] = a[left++];
		}

        while(right <= rightEnd){  // Copy rest of right half
            System.out.println(uniqueID + "  -  finishing right[" + right + "] to tmp[" + k + "] ... " + a[right] + " : " + tmp[k] );
            tmp[k++] = a[right++];
		}

		System.out.println(uniqueID + "  -  post finishing ... " + Arrays.toString(a) + " : " + Arrays.toString(tmp));
		System.out.println("");
        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];

    }
 }