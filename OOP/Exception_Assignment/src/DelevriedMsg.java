//import java.util.ArrayList;
////class ClassCastException extends Exception{}
//public class DelevriedMsg {
//
//	public static void main(String[] args){
//		// TODO Auto-generated method stub
//		
//		
//		ArrayList<Object> myList = new ArrayList<Object>();
//		myList.add("13");
//		myList.add("hello world");
//		myList.add(48);
//		myList.add("Goodbye World");
//		
//		casting c = new casting();
//		
//		
//		try {
//			
//		   c.castArr(myList);
//			System.out.println("yay");
//		}catch(castingException e) {
//			System.out.println(e);
////			System.out.println("you can't cast this object to integer");
//		}
//		
////		for(int i = 0; i < myList.size(); i++){
////			
////			try {
////			
////				
////		    Integer castedValue = (Integer) myList.get(i); 
////		      c.castArr(); 
////			}catch(Exception e) {
////				
////				System.out.println(e);
////				System.out.println("you can't cast this object to integer");
////			}
////		}
//
//	}
//
//}
import java.util.ArrayList;
class DelevriedMsg{
    public static void main(String[] args){
        casting friend = new casting();
        
    	ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
    	
        try{
            friend.deliverMessage(myList);
		 
        } catch (castingException e){
        	System.out.println(e);
		System.out.println("you can't cast this object to integer");
        }
    }
}
