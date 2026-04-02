/*

Program: CountVowels.java          Last Date of this Revision: April 2, 2026

Purpose: Modify the CountVowels application created in Chapter 5, Exercise 20 to count the number of vowels
in the text file. The application should prompt the user for the file name.

Author: Quang Nguyen
School: CHHS
Course: Computer Programming 30
 

*/
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
			System.out.println("Your file has: " + count + " vowel(s).");
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.out.println("IOException: " + e.getMessage());
		}	
	}
}

/* Screen Dump

Please enter you file name: short_test_version
Your file has: 18 vowel(s).



Please enter you file name: long_test_version
Your file has: 1130 vowel(s).
 
 */