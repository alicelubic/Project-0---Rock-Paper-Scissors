package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static int playerChoice = 0;

    static int compChoiceInt = compResponse();

    static int winCounter = 0;
    static int tieCounter = 0;
    static int lossCounter = 0;

    public static void main(String[] args) {

        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("Hello and Welcome to Rock, Paper, Scissors!");
        System.out.println("I'm your opponent, ALEX.");
        System.out.println();
        System.out.println("Type PLAY to face me, if you dare. ");
        System.out.println("Type HISTORY to see how you did.");
        System.out.println("Type ALEX to learn more about me.");
        System.out.println("Type QUIT to turn and run, you coward!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println();

        switch (userInput = userInput.toLowerCase()) {
            case "play":
                System.out.println();
                System.out.println("You think you can beat me? I have the Gods of Chance on my side!");
                System.out.println();
                optionPlay();
                break;
            case "history":
                history();
                break;
            case "quit":
                System.out.println("bye");
                break;
            case "alex":
                System.out.println("I'm ALEX. I like Java, success, and long walks on the beach.");
                System.out.println("But enough about me. I'm not real.");
                System.out.println("Let's just play, shall we?");
                System.out.println();
                //ALEX is my alter-ego, she was born from people mishearing me state my name
                System.out.println(" - - - - - ");
                System.out.println();
                optionPlay();
                break;
            default:
                System.out.println();
                System.out.println("...I don't follow you. Let's try this again.");
                System.out.println();
                System.out.println();
                mainMenu();
        }
        }

    public static void optionPlay() {

        int compChoiceInt = compResponse();


        System.out.println("Rock, Paper, Scissors says... SHOOT!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine();
        playerInput = playerInput.toLowerCase();

        if (playerInput.equals("rock")) {
            playerChoice = 1;
        } else if (playerInput.equals("paper")) {
            playerChoice = 2;
        } else if (playerInput.equals("scissors")) {
            playerChoice = 3;
        } else {
            System.out.println();
            System.out.println("Please only enter ROCK, PAPER, or SCISSORS. This isn't a free for all.");
            System.out.println("You wouldn't bring a gun to a knife fight, would you?");
            System.out.println();
            System.out.println("Oh God... would you?");
            System.out.println();
            System.out.println("...");
            System.out.println();
            optionPlay();
        }

        boolean compTurnRock = compChoiceInt == 1;
        boolean compTurnPaper = compChoiceInt == 2;
        boolean compTurnScissors = compChoiceInt == 3;

        boolean userRockWins = (playerChoice == 1 && compTurnScissors);
        boolean userPaperWins = (playerChoice == 2 && compTurnRock);
        boolean userScissorsWins = (playerChoice == 3 && compTurnPaper);

        boolean compRockWins = (compTurnRock && playerChoice == 3);
        boolean compPaperWins = (compTurnPaper && playerChoice == 1);
        boolean compScissorsWins = (compTurnScissors && playerChoice == 2);


          if (compChoiceInt == playerChoice) {

            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("It's a TIE!");

              tieCounter = tieCounter + 1;
        }
        else if (userRockWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("ROCK CRUSHES SCISSORS! YOU WIN");

              winCounter = winCounter + 1;
        }
        else if (userPaperWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("PAPER COVERS ROCK! YOU WIN");

              winCounter = winCounter + 1;
        }
        else if (userScissorsWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("SCISSORS CUT PAPER! YOU WIN");

              winCounter = winCounter + 1;
        }
        else if (compRockWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("ROCK CRUSHES SCISSORS! YOU LOSE");

              lossCounter = lossCounter + 1;
        }
        else if (compPaperWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("PAPER COVERS ROCK! YOU LOSE");

              lossCounter = lossCounter + 1;
        }
        else if (compScissorsWins) {
            System.out.println(compChoice(compChoiceInt));
              System.out.println();
            System.out.println("SCISSORS CUT PAPER! YOU LOSE");

              lossCounter = lossCounter + 1;
        }
          else {
            System.out.println("Huh?");
            System.out.println();
        }

        System.out.println("");
        System.out.println(" - - - - - ");
        System.out.println("");
        System.out.println("Another round? y/n");
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        String anotherRound = scanner.nextLine();
        anotherRound = anotherRound.toLowerCase();
        System.out.println();


        switch(anotherRound){
            case "y":
                optionPlay();
                break;
            default:
                System.out.println("Well... maybe you'll reconsider when confronted with the Main Menu...");
                System.out.println();
                System.out.println();
                System.out.println();
                mainMenu();


        }


    }

    public static String compChoice(int compChoiceInt) {


        boolean compTurnRock = compChoiceInt == 1;
        boolean compTurnPaper = compChoiceInt == 2;
        boolean compTurnScissors = compChoiceInt == 3;

        if (compTurnRock) {
            return "...ROCK";
        } else if (compTurnPaper) {
            return "...PAPER";
        } else {
            return "...SCISSORS";
        }
    }


    public static int compResponse() {
        Random r = new Random();

        int value = 1 + r.nextInt(3);

        return value;
    }


    public static void history(){

        int[] historyArray = new int[3];
        historyArray[0] = winCounter;
        historyArray[1] = lossCounter;
        historyArray[2] = tieCounter;



        System.out.print("You have " + historyArray[0] + " WIN(S)!");
            if(historyArray[0] > 0){
                System.out.print(" Good job!");
             }
             System.out.println();

        System.out.print("You have " + historyArray[1] + " LOSS(ES)!");
            if(historyArray[1] > 0){
                System.out.print(" :(");
            }
            System.out.println();

        System.out.print("You have " + historyArray[2] + " TIE(S)!");
            if (historyArray[2] > 0){
                System.out.print(" That's... nice.");
            }

            if(historyArray[0] == 0 && historyArray[1] == 0 && historyArray[2] == 0){
                System.out.println();
                System.out.println();
                System.out.println("Nothing, huh? Maybe play a few games first...");
            }

        System.out.println();
        System.out.println();
        System.out.println("Now back to the Menu!");
        System.out.println();
        System.out.println();
        mainMenu();

        }
    }







