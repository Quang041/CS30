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
		
		
		File fileText = new File("../School_work/src/SkillBuilder/words");
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
			System.out.print("Gimme your guess: ");
			input = userinput.next().toUpperCase();
			
			if (input.equals("!")) {
				System.out.print("Your decision is: ");
				String guess = userinput.next().toUpperCase();
				
				if (guess.equals(word)) {
					System.out.println("Congratulations");
				}
				else if (!guess.equals(word)) {
					System.out.println("Too bad, you lose");
					System.out.println("The word is: " + word);
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


