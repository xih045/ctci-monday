public DutchFlag{

	public static int[] partition (int partitionIndex, int[] arr) {
		int smaller = partitionIndex + 1;
		int larger = arr.length - 1;

		for (int i=smaller; i<arr.length; i++) {
			if (arr[i] < arr[pivot]) {
				swap(arr, i, smaller);
				smaller++;
			}
		}
		swap(arr, partitonIndex, smaller - 1);

		for (int i=arr.length - 2; i > partitionIndex; i--) {
			if (arr[i] > arr[larger]) {
				swap (arr, i, larger);
				larger--;
			}
		}
		return arr;	
	}

	public void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[i];
 	}


 	\
}