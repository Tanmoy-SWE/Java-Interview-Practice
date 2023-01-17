package practicePackage._08_recursiveDataStructures.attempts;

import practicePackage._08_recursiveDataStructures.Node;

public class MyLinkedList {
	public Node head;
	


	//DO NOT MODIFY
	public MyLinkedList() {
		head = null;
	}

	/**
	 * DO NOT MODIFY
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * DO NOT MODIFY
	 * insert the value val at the beginning of the list
	 * if the list = null before calling the method
	 * and val = 50, then list should become [50]
	 * after the method finishes execution
	 * @param val
	 */
	public void addAtFront(int val) {
		Node temp = new Node(val, null);
		temp.next = head;
		head = temp;
	}

	//DO NOT MODIFY
	public String toString() {
		String result = "[";
		Node current = head;
		while(current != null) {
			result = result + current.data + ", ";
			current = current.next;
		}
		if(result.length() > 1) {
			result = result.substring(0, result.length()-2);	
		}
		return result + "]";
	}

	/**
	 * DO NOT MODIFY - given as an example of traversal
	 * @return number of items in the list
	 */
	public int size() {
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/**
	 * 
	 * @param idx
	 * @return true if an item can be added at the passed idx
	 * 
	 * FOR EXAMPLE,
	 * if list represents [10, 70, 20, 90],
	 * items can be added at indices 
	 * 0 (before the first item), 1, 2, 3, 4 (after the last item) 
	 * but not at indices [... -2, -1] or [5, 6, ..]
	 */
	public boolean canInsertItemAt(int idx) {
		if (idx<0 || idx>size()){
			return false;
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @return the sum of all positive items (0 if the list is empty)
	 */
	public int totalPositives() {
		if (size()==0){
			return 0;
		}
		if (head == null) {
			return 0;
		}
		int sum = 0;
		Node itr = head;
		while (itr != null) {
			if (itr.data > 0) {
				sum += itr.data;
			}
			itr = itr.next;
		}
		return sum;
	}

	/**
	 * @param target: item to count
	 * @return the number of time target exists in the list 
	 * (0 if the list is empty)
	 */
	public int countOccurrences(int target) {
		if (size()==0){
			return 0;
		}
		if (head == null) {
			return 0;
		}
		int cnt = 0;
		Node itr = head;
		while (itr != null) {
			if (itr.data == target) {
				cnt++;
			}
			itr = itr.next;
		}
		return cnt;
	}

	/**
	 * 
	 * @return true if all items are even numbers, false otherwise
	 * return true if list is empty
	 * 
	 */
	public boolean allEven() {
		if (size()==0){
			return true;
		}
		if (head == null) {
			return false;
		}
		Node itr = head;
		while (itr != null) {
			if (itr.data % 2 != 0) {
				return false;
			}
			itr = itr.next;
		}
		return true;
	}

	/**
	 * 
	 * @param low
	 * @param high
	 * @return true if ANY item is in the range [low...high]
	 * false otherwise.
	 * 
	 * return false if list is empty
	 */
	public boolean containsInRange(int low, int high) {
		if (size()==0){
			return false;
		}
		if (head == null) {
			return false;
		}
		Node itr = head;
		while (itr != null) {
			if (itr.data >= low && itr.data <= high) {
				return true;
			}
			itr = itr.next;
		}
		return false;
	}

	/**
	 * 
	 * @return the highest item in the list
	 * return null if empty
	 * list represents [10, 70, 20, 90], return 90
	 * head = null, return null
	 * list represents [0, 0, 0, 0, return 0
	 */
	public Integer highest() {
		if (size()==0){
			return null;
		}
		if (head == null) {
			return null;
		}
		Node itr = head;
		int highest = -99999;
		while (itr != null) {
			if (itr.data > highest) {
				highest = itr.data;
			}
			itr = itr.next;
		}
		return highest; //to be completed
	}

	/**
	 * O(n) :(
	 * that's why no one uses linked lists!
	 * @param idx
	 * @return item at given index if index is valid, null otherwise
	 */
	public Integer get(int idx) {
		if (idx<0 || idx>=size()){
			return null;
		}
		Node itr = head;
		int ans = 0;
		int i = 0;
		while (itr != null) {
			if (i == idx) {
				ans = itr.data;
			}
			i++;
			itr = itr.next;
		}
		return ans;
	}

	/**
	 * D level
	 * Best case (idx = 0): O(1)
	 * Worst case (idx = size()-1): O(n)
	 * remove and return item at given idx if any
	 * @param idx
	 * @return item remove, null if idx invalid
	 */
	public Integer remove(int idx) {
		if (idx<0 || idx>=size()){
			return null;
		}
		Node temp;
		Node prev;
		temp = head;
		prev = head;
		for (int i = 0; i < size(); i++) {
			if (i == 0 && size() == 1) {
				 int t = head.data;
           		 head = head.next;
				 return t;
			}
			else {
				if (i == idx) {
					int t = prev.next.data;
					prev.next = temp.next;
					return t;
				}
				else {
					prev = temp;

					// Position was greater than
					// number of nodes in the list
					if (prev == null)
						return null;
					temp = temp.next;
				}
			}
		}
		return null;
	}

	/**
	 * 
	 * @param other
	 * @return MyLinkedList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * if 
	 * calling object holds [10, 70, 20]
	 * parameter object (other) holds [50, 90]
	 * 
	 * then for the returned object,
	 * list represents [10, 70, 20, 50, 90]
	 */
	public MyLinkedList join(MyLinkedList other) {
		Node itr = head;
		for(int i =0; i<size(); i++) {
			int p = itr.data;
			other.addAtFront(p);
			itr = itr.next;
		}
		return other		;
	}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 *
	 * if 
	 * calling object holds [10, 70, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return true
	 *
	 * if 
	 * calling object holds [10, 60, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [10, 20]
	 * return false
	 */
	public boolean same(MyLinkedList other) {
		if (other.size()!=size()){
			return false;
		}
		Node itr = other.head;
		Node main = head;
		int sum1 =0, sum2 =0;
		for(int i =0; i<other.size(); i++) {
			int p = itr.data;
			sum1 += p;
			sum2 += main.data;
			main = main.next;
			itr = itr.next;
		}
		return sum1==sum2;
	}
}