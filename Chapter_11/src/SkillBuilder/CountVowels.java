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
		String path = userinput.nextLine(); //User input//
		
		
		String lineOfText; //Use to store the text in the file//
		int count = 0;  //Count the amount of vowels//
		String vowel = "eauio";  //What are vowels include//
		
		File fileText = new File(path);  //Take access to the file//
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(fileText))) {  //Read the file//
			while ((lineOfText = buffer.readLine()) != null) { //Condition: if the line from the text, sent to lineOfText is not empty, continue in the for loop//
				for (char calen: lineOfText.toLowerCase().toCharArray()) { //Take ever characters from the text, convert to lowercase//
					String alinda = Character.toString(calen); //Convert the char data type to String type, in order to compare//
					if (vowel.contains(alinda)) { //If any vowel is found, update the count variable//
						count++;
					}
				}
			}      
			System.out.println("Your file has: " + count + " vowel(s)."); //Notify how any vowels//
		} catch (IOException e) { //Catch any error if the file cannot be read//
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
