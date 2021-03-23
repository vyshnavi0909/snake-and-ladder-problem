import java.util.*;

public class snakeAndLadder{

	public static void main(String[] args){

		//initiallizing start point
		int startPoint = 0;

		int player1 = startPoint;
		int player2 = startPoint;

		int player1Count = 0;
		int player2Count = 0;

		int previousPos1 = 0;
		int previousPos2 = 0;
		//using while loop for reaching the winning position 100
		while((player1 <= 100)&&(player2 <= 100)){
			//rolling the die for player 1
			Random roll1 = new Random();
			int dice1 = roll1.nextInt(6) + 1;
			player1Count++; //incermenting the player1's dice count

			//rolling the die for player2
			Random roll2 = new Random();
			int dice2 = roll2.nextInt(6) + 1;
			player2Count++; //incermenting the player2's dice count

			//generating options for player1
			Random options = new Random();
			int opt = options.nextInt(3);

			//generating options for player2
			Random options2 = new Random();
			int opt2 = options2.nextInt(3);

			previousPos1 = player1;  //initiallizing previous position

			//checking the options for noPlay or ladder or snake
			switch(opt){
				case 0: //no play
						player1 = player1;
						break;
				case 1: //ladder
						player1 = player1 + dice1;
						Random rollAgain = new Random();
						int dice = rollAgain.nextInt(6)+1;
						player1 = player1 + dice;
						player1Count++;
						break;
				case 2: //snake
						player1 = player1 - dice1;
						break;
				default:
						System.out.println("invaild");
						break;
			}
			previousPos2 = player2;  //initiallizing previous position

			//checking the options for noPlay or ladder or snake
          	switch(opt2){
				case 0: //no play
                	player2 = player2;
						break;
        		case 1: //ladder
                 	player2 = player2 + dice2;
						Random rollAgain = new Random();
                 	int dice = rollAgain.nextInt(6)+1;
                 	player2 = player2 + dice;
						player2Count++;
                  break;
        		case 2: //snake
                  player2 = player2 - dice2;
                  break;
           	default:
                	System.out.println("invaild");
        		}

			if(player1 > 100){
				player1 = previousPos1;
			}

			else if(player1 < 0){
				player1 = startPoint;
			}

			else if(player1 == 100){
				break;
			}

			//printing position of player1
//			System.out.println("Player1 is in " + player1 +" position");

        	if(player2 > 100){
            	player2 = previousPos2;
         	}

        	if(player2 < 0){
            	player2 = startPoint;
         	}

         	if(player2 == 100){
        		break;
         	}

			//printing position of player2
//			System.out.println("Player2 is in " +player2 +" position");

		}
		//System.out.println("Player1 is in " + player1 +" position");
		//System.out.println("Player2 is in " + player2 +" position");

		//System.out.println("Player1 rolled the dice for " + player1Count + " times");
		//System.out.println("Player2 rolled the dice for " + player2Count + " times");
		if(player1 == 100){
			System.out.println("Player 1 wins." );
		}else if(player2 == 100){
			System.out.println("Player 2 wins." );
		}
	}
}
