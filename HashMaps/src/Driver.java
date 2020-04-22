import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File text = new File("covid417.csv");
		HashMap<String, State> map = new HashMap<String, State>();
			
	     //Creating Scanner instnace to read File in Java
	    try {
			Scanner scanner = new Scanner(text);
			scanner.nextLine();
			while(scanner.hasNextLine()) {
				
				System.out.println(scanner.nextLine());
				//handle one line
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
