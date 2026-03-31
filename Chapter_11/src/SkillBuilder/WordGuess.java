package SkillBuilder;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordGuess {
	public static void main(String[] args) {
		
		
		System.out.print("How to play\n" +
		"------------------------------\n" +
		"* Just guess the word I give you.\n" +
		"P/S: It's not that hard, trust");
		
		String textFile = ("../Chapter_11/src/Assignment_Something_IDK.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
			String count;
			while ((reader.readLine() != null)) {
				
			}
		} catch (IOException e) {
			System.out.println("An error occured while reading the file: " + e.getMessage());
			e.printStackTrace();
		}
	

}}



