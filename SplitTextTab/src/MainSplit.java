import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class MainSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String textFilePlace;
		String singleTFP;
		
					
		BufferedReader breader=null;
		breader = null;
		try {
			breader = new BufferedReader(new FileReader(textFilePlace));		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> singleMsg = new ArrayList<String>();
		
		
		
		try {
			breader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}

}
