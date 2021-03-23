import java.util.*;

public class snakeAndLadder{

	public static void main(String[] args){

		//initiallizing start point
		int startPoint = 0;

		int player1 = startPoint;
		int diceCount = 0;

		//using while loop for reaching the winning position 100
		while(player1 <= 100){

			//rolling the die to get a number b/w 1 and 6
			Random roll = new Random();
			int dice = roll.nextInt(6) + 1;
			diceCount++; //incermenting the dice count

			//generating options i.e., 0-noplay 1-ladder 2-snake
			Random options = new Random();
			int opt = options.nextInt(3);

			int previousPosition = player1;  //initiallizing previous position

			//checking the options for noPlay or ladder or snake
			switch(opt){
				case 0: //no play
						player1 = player1;
						break;
				case 1: //ladder
						player1 = player1 + dice;
						break;
				case 2: //snake
						player1 = player1 - dice;
						break;
				default:
						System.out.println("invaild");
						break;
			}
			//to win exactly by 100 so it has to roll again
			if(player1 > 100){
				player1 = previousPosition;
			}

			//if position goes to negative then player is restarting the game
			if(player1 < 0){
				player1 = startPoint;
			}

			if(player1 == 100){
				break;
			}
			System.out.println("You are in " +player1 +" position");
		}
		System.out.println("You have rolled the dice for " + diceCount + " times");
		System.out.println("Hurrah! You have reached 100." );
	}
}
