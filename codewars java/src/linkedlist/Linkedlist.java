//https://www.codewars.com/kata/582c297e56373f0426000098/train/java
////circular linked list



//Rather than passing a new instance for each time we want to create a new node
// I want to implement a push method that when you call that method it creates new node on top of the existing node
// which means it would to be kept in memmory
// for example 
 	//
package linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Linkedlist {
	
	public static void main (String args []) {
//		 String printNode = stringify(new Node(1, new Node(2, new Node(3))));
		int num = 2;
		String [] myArray  =  new String[3];
		String x = "x";
		myArray[num] = x;
//		num++;
//		myArray[num] = num;
		System.out.println(Arrays.toString(myArray));
//		num++;
	}

//	  public static String stringify(Node list) {
//	      // Your code here.
//	    String nodeToString = "";
//	      while(list != null){
//	        nodeToString +=  list.getData() + " -> ";
//	        
//	        
//	       list  = list.getNext(); 
//	      }
//	    nodeToString += "null";
//	      return nodeToString;
//	  }

	}