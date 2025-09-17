package FileHandiling1609;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandiling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plese enter your name");
		String Name = sc.next();
		
		System.out.println("plese enter year of birth");
		int year = sc.nextInt();
		
		String username = Name + year;
		System.out.println(username);
		
		//1.directory path
		String path = "C:\\Users\\HP\\Music\\rahul";
		//2.specify file name
		String fileName = "username.txt";
		//C:\\Users\\HP\\Music\\rahul\\username.txt
		
		File file = new File(path + "\\" + fileName);
		// we should create a file if it is not there
		try {
		
		if(file.createNewFile()) {
			System.out.println("file created");
			
		}
		else {
			System.out.println("file already exists");
		}
		FileWriter writer = new FileWriter(file , true);
		writer.write(" * "+ username + System.lineSeparator());
		writer.close();
		System.out.println("Username written in file : " + username);
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		sc.close();
	}
		}
	}

