import java.io.*;
import java.util.*;

public class MyFile1 {
	
	public static void main(String[] args) {
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter a path without quotation marks.");
		System.out.print("Enter a path: ");
		String path = userinput.nextLine();
		path = path.replace("\"", "");
		
		File textFile = new File(path);
		if (textFile.exists() ) {
			System.out.println("The file is exist");
		}
		else {
			System.out.println("The file is not exist");
		}
	}
}
