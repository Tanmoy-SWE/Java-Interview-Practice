package practicePackage._05_arrayList.attempts;

import serviceClasses.MathService;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Stage3 {


	/**
	 * 
	 * @param list
	 * @param target
	 * @return the SECOND-LAST index at which target exists in the list passed.
	 * return -1 if list is null or target doesn't exist TWICE in the list.
	 */
	public static int secondLastIndexOf(ArrayList<Integer> list, int target) {
		if(list==null){
			return -1;
		}
		int cnt = 0, idx = 0;
		boolean flag = false;
		for(int i=list.size()-1; i>=0; i--){
			if(list.get(i)==target){
				cnt = cnt + 1;
			}
			if(cnt==2){
				idx = i;
				flag = true;
				break;
			}
		}
		if(flag==false){
			return -1;
		}
		return idx;
	}

	/**
	 * Remove all negative items from the list
	 * @param list
	 * 
	 * For example,
	 * 
	 * if list = [2, 4, 0, -1, -2, -3, 0, 4, -8, 3, 0, -1, -1], 
	 * it should become [2, 4, 0, 0, 4, 3, 0]
	 * 
	 * TIP: use remove method and use the debugger to ensure that the right item is being removed
	 */
	public static void removeNegatives(ArrayList<Integer> list) {
		if(list==null){
			return;
		}
		for(int i=0; i<list.size(); i++){
			if(list.get(i)<0){
				list.remove(i);
				i=0;
			}
		}
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains three instances of target in a row, false otherwise.
	 * return false if list is null or if it contains less than 3 items
	 */
	public static boolean threeInARow(ArrayList<Integer> list, int target) {
		if(list==null){
			return false;
		}
		for(int i=0; i<list.size()-2; i++){
			if(list.get(i)==target && list.get(i+1)==target && list.get(i+2)==target){
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @return true if every item in the list occurs only once, false otherwise.
	 * return true if list is empty, false if the list is null
	 * 
	 * TIP: use of methods indexOf and lastIndexOf will make your life oh-so-easy
	 */
	public static boolean allUnique(ArrayList<Integer> list) {
		if(list==null){
			return false;
		}
		if(list.size()==0){
			return true;
		}
		for(int i =0; i<list.size(); i++){
			int cnt = 1;
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i)==list.get(j)){
					cnt = cnt + 1;
				}
				if(cnt==2){
					return false;
				}
			}
		}

		return true; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param init
	 * @param inc
	 * @return an list containing n items such that the first item is init, 
	 * and each item is inc more than the previous item.
	 * return null if n is less than 0
	 * 
	 * NOTE 1: take special care when n = 0, the method should return the list {}
	 * NOTE 2: inc can be negative too :)
	 */
	public static ArrayList<Integer> generatePatternedArray(int n, int init, int inc) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items in the same order,
	 * false otherwise 
	 * return false if either of list passed is null
	 */
	public static boolean identical(ArrayList<Integer> a, ArrayList<Integer> b) {
		if(a==null || b==null){
			return false;
		}
		if(a.size()!=b.size()){
			return false;
		}
		for(int i=0; i<a.size(); i++){
			if(a.get(i)!=b.get(i)){
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items but not necessarily in the same order,
	 * false otherwise 
	 * return false if either of list passed is null
	 */
	public static boolean same(ArrayList<Integer> a, ArrayList<Integer> b) {
		if(a==null || b==null){
			return false;
		}
		int sum1 =0, sum2 =0;
		for(int i=0; i<a.size(); i++){
			sum1 = sum1 + a.get(i);
		}
		for(int i=0; i<b.size(); i++){
			sum2 = sum2 + b.get(i);
		}
		if(sum1==sum2){
			return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an list containing items {1, 2, ..., n-1, n}
	 * return null if n is less than 0
	 */
	public static ArrayList<Integer> generate(int n) {
		if(n<0){
			return null;
		}
		if(n==0){
			return new ArrayList<>();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=1; i<=n; i++){
			ans.add(i);
		}
		return ans;
	}

	/**
	 * 
	 * @param list
	 * @return an list containing the numbers of occurrences of all distinct items in list
	 * return null if the list is null.
	 */
	public static ArrayList<ArrayList<Integer>> getFrequencyTable(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the item that appears most in the list,
	 * or the first item that does so in case of a tie
	 * You may assume that list passed is NOT null
	 */
	public static int getMostFrequentItem(ArrayList<Integer> list) {
		int maxim = 0, cnt = 0, idx =0;
		for(int i=0; i<list.size(); i++){
			cnt = 0;
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i) == list.get(j)){
					cnt = cnt+1;
				}
			}
			if(cnt>maxim){
				maxim = cnt;
				idx = i;
			}
		}
		return list.get(idx); //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param end
	 * @return a sublist of list from the start of the list to index end (inclusive),
	 * return null if list is null or empty or end is invalid
	 */
	public static ArrayList<Integer> sublistUptoIndex(ArrayList<Integer> list, int end) {
		if(list==null || list.size()==0 || end>=list.size() || end <0){
			return null;
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<=end; i++){
			ans.add(list.get(i));
		}
		return ans; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all negative items of list,
	 * return null if list passed is null,
	 * return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getNegatives(ArrayList<Integer> list) {
		if(list==null){
			return null;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++){
			if(list.get(i)<0){
				ans.add(list.get(i));
			}

		}
		return ans;
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all items of list that are prime numbers,
	 * return null if list passed is null,
	 * return an empty list if list passed is empty
	 * 
	 * TIP: Use isPrime from MathService class as:
	 * MathService.isPrime(number to check)
	 */
	public static ArrayList<Integer> getPrimes(ArrayList<Integer> list) {
		if(list==null){
			return null;
		}
		ArrayList<Integer> primes = new ArrayList<>();
		for(int i=0; i < list.size(); i++){
			if(MathService.isPrime(list.get(i))){
				primes.add(list.get(i));
			}
		}

		return primes; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return an list containing all non-positive items of list,
	 * return null if list passed is null,
	 * return an empty list if list passed is empty
	 */
	public static ArrayList<Integer> getWithoutPositives(ArrayList<Integer> list) {
		if(list==null){
			return null;
		}
		ArrayList<Integer> Nonpos = new ArrayList<>();
		for(int i=0; i < list.size(); i++){
			if(list.get(i)<=0){
				Nonpos.add(list.get(i));
			}
		}

		return Nonpos; //to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return a copy of the list passed as parameter (not the same reference),
	 * return null if list passed is null,
	 * return an empty list if list passed is empty
	 * 
	 * TIP: use method getCopy from Stage2
	 */
	public static ArrayList<ArrayList<Integer>> getCopy(ArrayList<ArrayList<Integer>> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param sub
	 * @return the last index at which sub starts in list
	 * return -1 if sub has a higher length than list or there is no such sub found in list
	 */
	public static int lastIndexOf(ArrayList<Integer> list, ArrayList<Integer> sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of even items in non-null sublists of list,
	 * return 0 if list is null or empty
	 */
	public static int totalNumberOfEvenItems(ArrayList<ArrayList<Integer>> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of positive items in non-null sublists of list,
	 * return 0 if list is null or empty
	 */
	public static int totalNumberOfPositiveItems(ArrayList<ArrayList<Integer>> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the total number of unique items (items existing only once) within a non-null sublist of list,
	 * return 0 if list is null or empty
	 */
	public static int totalNumberOfUniqueItems(ArrayList<ArrayList<Integer>> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list: a list of lists
	 * @return the number of non-null sublists in list,
	 * return 0 if list is null or empty
	 */
	public static int countNonNullSublists(ArrayList<ArrayList<Integer>> list) {
		return 0; //to be completed
	}
}