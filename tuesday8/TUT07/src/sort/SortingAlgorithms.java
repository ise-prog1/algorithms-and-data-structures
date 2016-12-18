package sort;

public class SortingAlgorithms {
	
	/**
	 * Selection sort
	 * heavily inspired by the WikiPedia pseudo code
	 * @param input - the array to be sorted in place
	 */
	public static void selectionSort(int[] input) {
		int n = input.length -1;
		int left = 0;
		do {
			int minIndex = left;
			for(int i = left + 1; i <= n; i++) {
				if (input[i] < input[minIndex]) {
					minIndex = i;
				}
			}
			swap(input, minIndex, left);
			left++;
		}while(left < n);
	}
	
	/**
	 * Swaps two values at index a and index b in given array 'in'
	 * @param in - the array to be swapped in
	 * @param a - index 1
	 * @param b - index 2
	 */
	public static void swap(int[] in, int a, int b) {
		int temp = in[a];
		in[a] = in[b];
		in[b] = temp;
	}

	/**
	 * Insertion sort
	 * heavily inspired by the WikiPedia pseudo code
	 * @param input - the array to be sorted in place
	 */
	public static void insertionSort(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int j = i;
			while ( j > 0 && input[j -1] > input[j]) {
				swap(input, j-1, j);
				j--;
			}
		}
	}
	
}
