public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
public void push(Node newNode) {

        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
public void printValuesForward() {
        Node current = this.head;
        

        while(current != null) {
            // print it's value
            System.out.println(current.value);

            current = current.next;
        }
    }
public void printValuesBackward() {
	   Node current = this.tail;
 
       while(current != null) {

           System.out.println(current.value);
           current = current.previous;
       }
}
  public Node pop(){
	  
      Node lastNode = this.tail;
      Node before = lastNode.previous;
      before.next = null;
      this.tail = before;
      return lastNode;
  }
  
  public boolean contains(Integer value) {
	  
	   Node current = this.head;    

       while(current != null) {
           if(current.value == value) {
        	   return true;
           }
           current = current.next;
       }
	  return false;
  }
  
  public int size() {
	  Node current = this.head;    
      int counter = 0;
       while(current != null) {
           current = current.next;
           counter++;
       }
       
       return counter;
  }
	
}