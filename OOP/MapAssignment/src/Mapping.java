import java.util.HashMap;
import java.util.Set;
public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> trackList = new HashMap<String, String>();
		
		trackList.put("song1", "bla bla bla");
		trackList.put("song2", "wow wow wow");
		trackList.put("song3", "yay yay yay");
		trackList.put("song4", "eeo eeo ooo");
		
		String title = trackList.get("song2");
		System.out.println(title);

		 
		 Set<String> keys = trackList.keySet();
	        for(String key : keys) {
	            System.out.println( key+":"+ trackList.get(key)
	            );    
	        }
	}

}
