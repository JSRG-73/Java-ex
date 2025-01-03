package exercises;

import java.util.Scanner;

public class RockPaperScissors {
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	
	public static String game(String player_choice) {
		// 0-Rock, 1-Paper, 2-Scissors.
		int randomNum = (int)(Math.random() * 3);
		String computer_choice = String.valueOf(randomNum);
		String Splayer, Cplayer;
		//System.out.println(computer_choice);
		switch (player_choice) {
		case "0": {
			Splayer="Rock";
			break;
		}
		case "1": {
			Splayer="Paper";
			break;
		}
		case "2": {
			Splayer="Scissors";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + player_choice);
		}
		
		switch (computer_choice) {
		case "0": {
			Cplayer="Rock";
			break;
		}
		case "1": {
			Cplayer="Paper";
			break;
		}
		case "2": {
			Cplayer="Scissors";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + player_choice);
		}
		
		
		System.out.println("Your choice: " + Splayer + "\nComputer's choice: " + Cplayer);
		
		if(player_choice.equals(computer_choice))return "Draw";
		else if(player_choice.equals("0")) {
			if(computer_choice.equals("1"))return "You lose";
			else if(computer_choice.equals("2"))return "You win";
		}
		else if(player_choice.equals("1")) {
			if(computer_choice.equals("0"))return "You win";
			else if(computer_choice.equals("2"))return "You lose";
		}
		else if(player_choice.equals("2")) {
			if(computer_choice.equals("1"))return "You win";
			else if(computer_choice.equals("0"))return "You lose";
		}
		
		return "";
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\n\nWelcome to rock, paper, Scissors\nType your choice:\n0-Rock\n1-Paper\n2-Scissors\n\nYour choice: ");
			
			System.out.println(game(in.next()));
			//clearScreen();
		}

	}

}
