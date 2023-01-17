package practicePackage._08_recursiveDataStructures.attempts;

import practicePackage._08_recursiveDataStructures.Node;

public class NodeService {


	public static boolean isEquals(Node start1, Node start2) {
		Node itr = start1, temp = start2;
		while (itr != null && temp != null) {
			if (itr.data != temp.data)
				return false;
			itr = itr.next;
			temp = temp.next;
		}
		if (itr == null && temp == null) {
			return true;
		}
		return false;
	}



	//DO NOT MODIFY
	public static String toString(Node start) {
		return "["+ toStringSecondary(start);
	}

	// DO NOT MODIFY
	public static String toStringSecondary(Node start) {
		if(start == null) {
			return "]";
		}
		String sub = toStringSecondary(start.next);
		if(sub == "]") {
			return start.data + sub;
		}
		else {
			return start.data + ", " + sub;
		}
	}

	/**
	 * 
	 * @param start
	 * @return sum of all odd numbers
	 */
	public static int sumOdd(Node start) {
		if (start == null) {
			return 0;
		}
		int sum = 0;
		Node itr = start;
		while (itr != null) {
			if (itr.data % 2 != 0) {
				sum += itr.data;
			}
			itr = itr.next;
		}
		return sum;
	}

	/**
	 * 
	 * @param start
	 * @return number of positive numbers
	 */
	public static int countPositives(Node start) {
		if (start == null) {
			return 0;
		}
		int count = 0;
		Node itr = start;
		while (itr != null) {
			if (itr.data > 0) {
				count++;
			}
			itr = itr.next;
		}
		return count;
	}

	/**
	 * 
	 * @param start
	 * @return the first Node starting at Node start
	 * containing a positive data value
	 * return null if no Node containing a positive data value
	 * 
	 * for example, if
	 * start represents [-5, 0, 6, 2, -8, 0]
	 * 
	 * and the Node returned is result, then
	 * result represents [6, 2, -8, 0]
	 */
	public static Node getFirstPositiveNode(Node start) {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp != null) {
			if (temp.data > 0) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	/**
	 * 
	 * @param start
	 * @param idx
	 * @return a reference to the node at index idx (if any) in the sequence
	 * of nodes starting at start. return null if an item doesn't exist at that index.
	 * Note: first item (start) is considered to be at index 0
	 */
	public static Node getItemAt(Node start, int idx) {
		if (start == null) {
			return null;
		}
		if (idx == 0) {
			return start;
		}
		return getItemAt(start.next, idx - 1);
	}

	/**
	 * 
	 * @param start
	 * @param val
	 * do nothing (and return false) if start is null.
	 * otherwise, add a node containing val at the end of the sequence
	 * of nodes starting at start, and return true.
	 */
	public static boolean append(Node start, int val) {
		if (start == null) {
			return false;
		}
		Node temp = start;
		Node temp2 = new Node(val);
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = temp2;
		return true;
	}

	/**
	 * 
	 * @param start1
	 * @param start2
	 * @return true if items starting at Nodes
	 * start1 and start2 are the same  
	 * (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 *
	 * if 
	 * start1 represents [10, 70, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return true
	 *
	 * if 
	 * start1 represents [10, 60, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [10, 20]
	 * return false
	 */
	public static boolean same(Node start1, Node start2) {
		Node node1 = sort(start1,true);
		Node node2 = sort(start2, true);
		return isEquals(node1, node2);
	}

	/**
	 * sort the nodes starting at Node start
	 * in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param start
	 * @param asc
	 * @return reference to the first Node at which the sorted sequence starts
	 */
	public static Node sort(Node start, boolean asc) {
		if (start == null) {
			return null;
		}
		Node temp = start;
		Node itr1 = new Node(temp.data, null);
		Node itr2 = itr1;
		temp = temp.next;
		while (temp != null) {
			itr2.next = new Node(temp.data, null);
			itr2 = itr2.next;
			temp = temp.next;
		}
		Node node = itr1, i = null;
		int x;
		while (node != null) {
			i = node.next;
			while (i != null) {
				if (asc) {
					if (node.data > i.data) {
						x = node.data;
						node.data = i.data;
						i.data = x;
					}
				} else {
					if (node.data < i.data) {
						x = node.data;
						node.data = i.data;
						i.data = x;
					}
				}
				i = i.next;
			}
			node = node.next;
		}
		return itr1; // to be completed
	}

}
