/*

Program: WordGuess.java          Last Date of this Revision: April 2, 2026

Purpose: Modify the WordGuess case study from Chapter 5 to use a word from a file as the secret word.
The file should contain a list of words, with one word per line. The WordGuess application should 
determine which word to use, by generating a random number that corresponds to one of the word in the
fil

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

public class WordGuess {
	public static void main(String[] args) {
		
		
		System.out.print("             How to play\n" +
		"--------------------------------------\n" +
		"* Enter a letter for your guess.\n" +
		"* Hit '!' to guess the entire word.\n" + 
		"* If you put in 2 characters, we count\n" +
		"the first one.\n" +
		"* Just guess the word I give you.\n" +
		"P/S: It's not that hard, trust.\n" +
		"--------------------------------------\n");  //Introduce the user to the game//
		
		
		File fileText = new File("../Chapter_11/src/SkillBuilder/words");  //Access to the file of words I created//
		List <String> words = new ArrayList<>();  //Make a list for words from the words file//

		/**Determine how many lines in the file.
		 * Use for generate a number, which is later use for determine the word.
		 */
		try (BufferedReader buffer = new BufferedReader(new FileReader(fileText))) {
			String line; //Will be updated constantly to compare//
			while ((line = buffer.readLine()) != null) { //If the word ON THAT LINE is not empty, then the loop starts//
				if (!line.trim().isEmpty()) { //Trim all the space so that the word only has |APPLE| not |APPLE |//
					words.add(line.trim());  //Add to the list//
				}
			}
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.out.println("IOException: " + e.getMessage());
		} //Catch the error any time there is a error in reading that file//
		
		/** 
		 *Generate a random to choose the word later on.
		 */
		Random random = new Random();
		int chosen = random.nextInt(words.size()); //Create a random number depends on how many words available in the file//
												   //Why words.size()? Because the words file can be edited and updated to more than 34 words. so that by this way, the  application can flexibly changed//
		
		/**
		 *Choose the word
		 */
		String word = words.get(chosen); //By using the word and the number created, if number is the same as the line//
		
		
		char[] chosen_word = word.toCharArray(); //Convert the chosen word to the array of chars//
		char[] keys = new char[word.length()];  //Key variable = what the user will put in. Word length always = 5//
		
		for (int i = 0; i < word.length(); i++) {
			keys[i] = '-'; //Before the users play the game, 5 dashes are shown//
			
		}
		System.out.println(keys);
		
		Scanner userinput = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.print("Gimme your guess: "); //Take the user guess//
			input = userinput.next().toUpperCase(); //Upcase the word, so that the comparasion can work easier//
			
			if (input.equals("!")) { //When user choose this, allows user to give their answer//
				System.out.print("Your decision is: ");
				String guess = userinput.next().toUpperCase(); //Compare//
				
				if (guess.equals(word)) { //If input = word, then the user win//
					System.out.println("Congratulations");
				}
				else if (!guess.equals(word)) { //If input is not = word, then the user lose//
					System.out.println("Too bad, you lose");
					System.out.println("The word is: " + word);
				}
			}
			else if (!(input.equals("!"))) { //If the user decides not to guess to word, so that the computer understands that user just want to guess the letter inside the word//
				for (int i = 0; i < chosen_word.length; i++) { //The for loop will run all over every chars in the word//
					if (input.charAt(0) == chosen_word[i]) { //If the user's input = any letter in the array. Then update the - from ealier to that letter//
						keys[i] = input.charAt(0);
					}
					else if (input.charAt(0) != chosen_word[i]) { //If the user's input is not = any letter in the array. Then the application does nothing//
						System.out.print("");
					}
				}
				System.out.println(keys); //Shown the updated version//
			}
			
		} while (!input.equals("!")); //Notify the application when the user hits !, stop the game//
	}
}
/* Screen Dump

             How to play
--------------------------------------
* Enter a letter for your guess.
* Hit '!' to guess the entire word.
* If you put in 2 characters, we count
the first one.
* Just guess the word I give you.
P/S: It's not that hard, trust.
--------------------------------------
-----
Gimme your guess: a
-A---
Gimme your guess: b
BA---
Gimme your guess: y
BA---
Gimme your guess: s
BAS--
Gimme your guess: i
BASI-
Gimme your guess: !
Your decision is: baSil
Congratulations
 
 */

