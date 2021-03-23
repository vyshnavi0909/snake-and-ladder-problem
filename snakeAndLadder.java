import java.util.*;

public class snakeAndLadder{

	public static void main(String[] args){

		//initiallizing start point
		int startPoint = 0;
		int player1 = startPoint;

		//rolling the die to get a number b/w 1 and 6
		Random roll = new Random();
		int dice = roll.nextInt(6) + 1;

		//generating options i.e., 0-noplay 1-ladder 2-snake
		Random options = new Random();
		int opt = options.nextInt(3);

		//checking the options for noPlay or ladder or snake
		switch(opt){
			case 0:
					player1 = player1;
					System.out.println("Sorry! You can't play and remains at same point");
					break;
			case 1:
					player1 = player1 + dice;
					System.out.println("Hurray! You got a ladder and you have moved " + player1 + " steps forward");
					break;
			case 2:
					player1 = player1 - dice;
					System.out.println("Boo! You are bitten by the snake and moved " + player1 + " steps backward");
					break;
			default:
					System.out.println("invaild");
					break;
		}
	System.out.println(player1);
	}
}
