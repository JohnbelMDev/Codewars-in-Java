//https://www.codewars.com/kata/582c297e56373f0426000098/train/java

public class Kata {

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





public void Push(int newNumber){
    Node newNode = new Node (newNumber);
    
  
}

Node linebyline = new Node(1,new Node(2,new Node(9)));

Node node1 = new Node(1);
Node node2 = new Node(2);
Node node9 = new Node(9);
node1.next = node2;
node2.next = node9;










test.push(4) 





//circular linked list