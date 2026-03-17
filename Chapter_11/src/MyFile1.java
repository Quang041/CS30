import java.io.*;
import java.util.*;

public class MyFile1 {
	
	public static void main(String[] args) {
	
		
		File textFile = new File("../Chapter_11/src/test");
		
		if (textFile.exists() ) {
			System.out.println("The file is exist");
		}
		else {
			System.out.println("The file is not exist");
		}
	}
}
