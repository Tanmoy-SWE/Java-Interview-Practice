package practicePackage._02_arrays.attempts;

public class Stage3 {


	/**
	 * 
	 * @param data
	 * @return number of items that exist exactly once in the array passed
	 * 
	 */
	public static int countUniqueItems(int[] data) {
		if(data==null){
			return 0;
		}
		int ans = 0;
		for(int i=0; i<data.length; i++)
		{
			int cnt =1;
			for(int j=i+1; j<data.length; j++){
				if(data[i]==data[j] && data[j]!=-1){
					data[j]=-1;
					cnt++;
				}
			}
			if(cnt==1){
				ans++;
			}
		}
		return ans;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a contains all the items in b,
	 * false otherwise
	 * return false if either of array passed is null
	 */
	public static boolean contains(int[] a, int[] b) {
		if(a==null || b==null){
			return false;
		}
		int cnt = 0;
		for(int i =0; i<b.length; i++){
			for(int j=0; j<a.length; j++){
				if(b[i]==a[j]){
					cnt++;
				}
			}
		}
		if(cnt==b.length){
			return true;
		}
		else{
			return false; //to be completed
		}
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are mutually reverse, false otherwise
	 * return false if either of the array passed is null
	 */
	public static boolean mutuallyReverse(int[] a, int[] b) {
		if(a==null || b==null){
			return false;
		}
		for(int i=0; i<a.length; i++){
			for(int j=b.length-1; j>=0; j--){
				if(a[i]!=b[j]){
					return false;
				}
			}
		}

		return true; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an array containing items {1, 2, ..., n-1, n}
	 * return null if n is less than 0
	 */
	public static int[] generate(int n) {
		if(n<0){
			return null;
		}
		int[] sample= new int[n] ;
		for(int i=0; i<n; i++){
			sample[i]= i+1;
		}
		return sample; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears most in the array,
	 * or the first item that does so in case of a tie
	 * You may assume that array passed is NOT null
	 */
	public static int getMostFrequentItem(int[] data) {
		int cnt, index=0;
		for (int i=0; i<data.length; i++){
			cnt = 0;
			for(int j=i+1; j<data.length; j++){
				if(data[i]==data[j]){
					cnt++;
				}
			}
			if(cnt>maximum){
				maximum = cnt;
				index = i;
			}
		}
		return index; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing the numbers of occurrences of all distinct items in data
	 * return null if the array is null.
	 */
	public static int[] getFrequencyTable(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param end
	 * @return a subarray of data from the start of the array to index end (inclusive),
	 * return null if array is null or empty or end is invalid
	 */
	public static int[] subarrayUptoIndex(int[] data, int end) {
		if(data==null){
			return null;
		}
		if(data.length==0){
			empty = new int[]{};
			return empty;
		}
		int[] arr;
		int j = 0;
		for(int i=0; i<=end; i++){
			arr[i]= data[i];
		}
		return  arr;
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getPositives(int[] data) {
		if(data==null){
			return null;
		}
		if(data.length==0){
			empty = new int[]{};
			return empty;
		}
		int[] arr;
		int j = 0;
		for(int i=0; i<n; i++){
			if(data[i]!=0){
				arr[j]=data[i];
				j++;
			}
		}
		return  arr;
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-zero items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNonZeroes(int[] data) {
		if(data==null){
			return null;
		}
		if(data.length==0){
			empty = new int[]{};
			return empty;
		}
		int[] arr;
		int j = 0;
		for(int i=0; i<n; i++){
			if(data[i]!=0){
				arr[j]=data[i];
				j++;
			}
		}
		return  arr;

	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutNegatives(int[] data) {
		if(data==null){
			return null;
		}
		if(data.length==0){
			empty = new int[]{};
			return empty;
		}
		int[] arr;
		int j = 0;
		for(int i=0; i<n; i++){
			if(data[i]>=0){
				arr[j]=data[i];
				j++;
			}
		}
		return arr;
	}

	/**
	 * 
	 * @param data
	 * @param idx
	 * @return an array with item at idx (if any) removed.
	 * also remove all adjacent occurrences of item data[idx] 
	 * For example, if data = {10,70,70,70,20,90,70} and idx = 2,
	 * return {10,20,90,70} with item at index 2 (70) and all 
	 * adjacent occurrences removed.
	 * 
	 * if data = null, return null
	 * if index is invalid, return an instance copy of the array
	 */
	public static int[] itemRemovedNeighbourhood(int[] data, int idx) {
		if(data==null){
			return null;
		}
		if(index<0 || index>=data.length){
			return data;
		}
		int arr[] = new int[data.length-3];
		int j =0;
		for(int i=0; i<data.length; i++){
			if(i>=idx-1 && i<=idx+1){
				continue;
			}
			arr[j] = data[i];
			j++;
		}
		return arr;
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return a deep copy of the array passed as parameter,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: you can use getCopy(int[]) from Stage2
	 */
	public static int[][] getDeepCopy(int[][] data) {
		if (data == null) {
			return null;
		}
		if (data.length==0){
			return new int[][];
		}

		final boolean[][] result = new boolean[data.length][];
		for (int i = 0; i < data.length; i++) {
			result[i] = Arrays.copyOf(data[i], data[i].length);
		}
		return result;
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the last index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int lastIndexOf(int[] data, int[] sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of even items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfEvenItems(int[][] data) {
		if(data==null){
			return 0;
		}
		if(data.length==0){
			return 0;
		}
		int cnt = 0;
		for(int i=0; i< data.length; i++){
			for(int j=0; j< data[i].length; j++) {
				if(data[i][j]%2==0){
					cnt++;
				}
			}
		}
		return cnt; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of positive items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfPositiveItems(int[][] data) {
		if (data==null){
			return 0;
		}
		int cnt = 0;
		//int ans[] = new int[data.length];
		for (int i=0; i<data.length; i++){
			if(data[i]>=0){
				cnt++;
			}
		}
		return cnt; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of unique items in each non-null subarray of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfUniqueItems(int[][] data) {
		if (data==null || data.length==0){
			return 0;
		}
		int cnt = 0, ans = 0;
		for(int i=0; i<data.length; i++){
			cnt = 1;
			for(int j=i+1; j<data.length; j++){
				if(data[i]==data[j] && data[j]!==-1){
					cnt++;
				}
			}
			if(cnt==1){
				ans++;
			}
		}
		return ans; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of non-null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNonNullSubarrays(int[][] data) {
		if(data==null){
			return 0;
		}
		if(data.length==0){
			return 0;
		}
		int cnt = 0;
		for(int i=0; i< data.length; i++){
			if(data[i]==null){
				cnt++;
			}
		}
		return cnt; //to be completed
	}
}