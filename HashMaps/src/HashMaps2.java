import java.util.HashMap;

public class HashMaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, State> map = new HashMap<String, State>();
		map.put("California",new State());
		
		//check if a key exists - (check if a State is already in the map)
		System.out.println(map.containsKey("Michigan"));
		
		//if the state is already in the map
		//grab the Object and update it
		System.out.println(map.get("California"));
		
	}

}

class State{
	
	int confirmed = 0;
	int deaths = 0;
	int recovered = 0;
	int active = 0;
	
	//allow the printing of a State object
	public String toString() {
		return "c: "+confirmed;
	}
	
	public void add(int c, int d, int r, int a) {
		confirmed+=c;
		deaths+=d;
		recovered+=r;
		active +=a;
	}
	
	
	
	
	
}