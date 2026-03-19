import java.util.*;
import java.io.*;

public class MyFile2 {
	public static void main(String[] args) {
		
		File textFile = new File("zzz.txt");
		
		try {
			textFile.createNewFile();
			
			System.out.println("File zzz.txt has been created.");
			System.out.println("Choose: \n" +
			"1. Keep the file. \n" +
			"2. Delete the file. \n");
			
			Scanner userinput = new Scanner(System.in);
			int choice = userinput.nextInt();
			
			if (choice == 1) {
				System.out.println("Keep the file.");
			}
			else if (choice == 2) {
				textFile.delete();
				System.out.println("Delete this file.");
			}
			else {
				System.out.println("Run again buddy.");
			}
		}
		catch (IOException e) {
			System.out.println("File could not be created!");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
