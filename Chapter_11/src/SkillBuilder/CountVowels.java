package SkillBuilder;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountVowels {
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		System.out.print("Please enter you file name: ");
		String path = userinput.nextLine();
		
		
		String lineOfText;
		int count = 0;
		String vowel = "eauio";
		
		File fileText = new File(path);
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(fileText))) {
			while ((lineOfText = buffer.readLine()) != null) {
				for (char calen: lineOfText.toLowerCase().toCharArray()) {
					String alinda = Character.toString(calen);
					if (vowel.contains(alinda)) {
						count++;
					}
				}
			}      
			System.out.println(count);
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.out.println("IOException: " + e.getMessage());
		}	
	}
}
