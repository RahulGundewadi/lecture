package FileHandling1709;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	
	public static void main(String[] args) {
		
	/*	String filePath = "E:\\FileJava\\StudentDetails.txt";
		try {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line = reader.readLine();
		System.out.println(line);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}*/
		String filePath = "E:\\FileJava\\StudentDetails.txt";
		try {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line ;
		while((line = reader.readLine()) != null) {
		System.out.println(line);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
