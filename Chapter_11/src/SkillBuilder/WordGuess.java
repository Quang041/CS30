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
		"--------------------------------------\n");
		
		
		File fileText = new File("../Chapter_11/src/SkillBuilder/words");
		List <String> words = new ArrayList<>();

		/**Determine how many lines in the file.
		 * Use for generate a number, which is later use for determine the word.
		 */
		try (BufferedReader buffer = new BufferedReader(new FileReader(fileText))) {
			String line;
			while ((line = buffer.readLine()) != null) {
				if (!line.trim().isEmpty()) {
					words.add(line.trim()); 
				}
			}
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.out.println("IOException: " + e.getMessage());
		}
		
		/** 
		 *Generate a random to choose the word later on.
		 */
		Random random = new Random();
		int chosen = random.nextInt(words.size());
		
		/**
		 *Choose the word
		 */
		String word = words.get(chosen);
		
		
		char[] chosen_word = word.toCharArray();
		char[] keys = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			keys[i] = '-';
			
		}
		System.out.println(keys);
		
		Scanner userinput = new Scanner(System.in);
		String input = "";
		
		do {
			int count = 0;
			System.out.print("Gimme your guess: ");
			input = userinput.next().toUpperCase();
			
			if (input.equals("!")) {
				System.out.print("Your decision is: ");
				String guess = userinput.next().toUpperCase();
				
				if (guess.equals(word)) {
					System.out.println("Congratulations");
					System.out.print(count + " attempt(s).");
				}
				else if (!guess.equals(word)) {
					System.out.println("Too bad, you lose");
					System.out.println("The word is: " + word);
					System.out.print(count + " attempt(s).");
				}
			}
			else if (!(input.equals("!"))) {
				for (int i = 0; i < chosen_word.length; i++) {
					if (input.charAt(0) == chosen_word[i]) {
						keys[i] = input.charAt(0);
					}
					else if (input.charAt(0) != chosen_word[i]) {
						System.out.print("");
					}
				}
				System.out.println(keys);
			}
			
		} while (!input.equals("!"));
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

