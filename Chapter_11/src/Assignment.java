import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
	public static void main(String[] args) {
		
		
		String textFile = ("../Chapter_11/src/Assignment_Something_IDK.txt");
		
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(textFile))) {
			String line;
			while ((line = bufferedreader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("An error occured while reading the file: " + e.getMessage());
			e.printStackTrace();
		}
	

}}
