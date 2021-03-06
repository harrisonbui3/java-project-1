/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        String FILENAME = "hangman.txt";
        ArrayList<String> secretWord = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String currentLine = reader.readLine();
            //Read Document 'hangman.txt' and store
            while (currentLine != null) {
                secretWord.add(currentLine);
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        //Randomly choose word from list
        int indexHiddenWord = (int) (Math.random() * secretWord.size());
        String word = secretWord.get(indexHiddenWord);
        
        //wordList
        ArrayList<Character> wordList = new ArrayList();
        
        for (char c : word.toCharArray()) {
            wordList.add(c);
        }
        System.out.println("The category is food \n\n");

        //Create User's Incorrect Guess Storage
        ArrayList incorrect = new ArrayList();

        //Create User's Correct Guess Storage
        ArrayList<Character> correct = new ArrayList(wordList.size());

        Scanner keyboard = new Scanner(System.in);

        int numGuess = 0;

        ArrayList<Character> dashes = new ArrayList();
        //Printing Hidden Word
        for (int x = 0; x < wordList.size(); x++) {
            dashes.add('_');
        }
        //number of guesses remaining. Exits if user wins of loses
        while (numGuess < 6) {
            int tries = 6 - numGuess;
            if (correct.size()!=0) {
                for (int x = 0; x < wordList.size(); x++) {
                    if (correct.contains(wordList.get(x))){
                        dashes.add(x, wordList.get(x));
                        dashes.remove(x+1);
                    }
                    
                }

            }
            //user guesses word correctly
            if (!(dashes.contains('_'))){
                System.out.println ("Congrats! You guessed correctly");
                break;
            }
            //printed
            System.out.println("The hidden word is \n" + dashes);
            System.out.println("You have " + tries + " tries left");
            System.out.println("\nLETTERS FOUND: " + correct);
            System.out.println("LETTERS NOT FOUND: " + incorrect);
            System.out.println("\nWhat letter is your guess?");
            String userGuess = keyboard.nextLine();
            char guess = userGuess.charAt(0);
            if (wordList.contains(userGuess.charAt(0))) {
                System.out.println("Letter has been found. You lose no guesses.\n");
                correct.add(guess);
            } else {
                System.out.println("Letter has not been found. \n" +
"                System.out.println(\"Letter has not been founou lose one guess\n");
                incorrect.add(userGuess);
                numGuess++;
            }
            
        }
        //if user loses
        if ((dashes.contains('_'))){
            System.out.println ("\nNice try. The secret word was \n" + wordList);
        }
    }
}
