import java.io.*;

import java.util.*;

public class MyFile1 {
	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		String file = userinput.nextLine();
		String file1 = file.replace("\\", "\\\\");
		
		File textFile = new File(file);
		
		if (textFile.exists() ) {
			System.out.println("The file is exist");
		}
		else {
			System.out.println("The file is not exist");
		}
	}
}
