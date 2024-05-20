import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter 0 for ROCK, 1 for PAPER; 2 for SCISSORS");
        int user_input = sc.nextInt();
        System.out.println("Your Choice: "+ user_input);
        int pc_input = rd.nextInt(3);
        System.out.println("Computer's Choice: "+ pc_input);
        if ((user_input==0 && pc_input==2) || (user_input==1 && pc_input==0) || (user_input==2 && pc_input==1)){
            System.out.println("You Win");
        }
        else if (user_input==pc_input)  {
                System.out.println("Draw"); 
            }
            else {
                System.out.println("You Lose");
            }
        }
    }

