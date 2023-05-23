package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.io.Serializable;
import java.util.Locale;
import java.util.Scanner;

/*
 * Application controller
 * Sets up the system classes, maintains overall flow of the application.
 * Prompts user for inputs and "forwards" those inputs into the system (BACKEND, this will be my bread and butter)
 * Backend makes all the money.
 */
public class DuckRaceApp implements Serializable {
    private final Scanner scanner = new Scanner(System.in); //read inputs from the console
    private Board board = Board.getInstance();

    public void execute(){
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptUserForReward();
        updateBoard(id,reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward);
    }

    private Reward promptUserForReward() {
        Reward reward = null;
        boolean validInput = false;
        while(!validInput){
            System.out.println("Please enter [P]rizes or [D]ebit card: ");
            String input = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
            if (input.matches("D|P")){
                validInput = true;
                reward = ("D".equals(input)) ? Reward.DEBIT_CARD: Reward.PRIZE; //this is the ternary operator, condition -> true value -> else statement.
                /*
                if ("D".equals(input)){
                    reward = Reward.DEBIT_CARD;

                }
                else{
                    reward = Reward.PRIZE;

                }*/
            }
        }

        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while (!validInput){
            System.out.print("Please enter the ID of the winner [1-13]: "); //Done:dont hardcode 13
            String input = scanner.nextLine().trim(); //removes leading/trailing whitespace chars
            if (input.matches("\\d{1,2}")){     //any digit on eor two occurrences
                id = Integer.parseInt(input);         //safe to convert to int at this point.
                if (id>=1 && id<=13){                 //valid id, did not hard code the 13.
                    validInput = true;
                }
            }
        }

        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println(" WELCOME TO THE DUCK RACE APPLICATION ");
        System.out.println(" ==================================== ");
    }
}