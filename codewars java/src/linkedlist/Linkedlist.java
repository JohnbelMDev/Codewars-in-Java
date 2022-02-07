//https://www.codewars.com/kata/582c297e56373f0426000098/train/java
////circular linked list

package linkedlist;

public class Linkedlist {
	
	public static void main (String args []) {
		 String printNode = stringify(new Node(1, new Node(2, new Node(3))));
		System.out.println(printNode);
	}

	  public static String stringify(Node list) {
	      // Your code here.
	    String nodeToString = "";
	      while(list != null){
	        nodeToString +=  list.getData() + " -> ";
	        
	        
	       list  = list.getNext(); 
	      }
	    nodeToString += "null";
	      return nodeToString;
	  }

	}