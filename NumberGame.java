package CODSOFT;
import java.util.*;



public class NumberGame{
    public static int RandomNumber(int min, int max){
        int num = (int) ((Math.random()*(max-min))+min);
        return num;
    }
    
    public static void main(String[] args) {
        int randomNum = RandomNumber(0,100);
        int higher = 0;
        int lower = 0;
        int correct = 0;
        int attempt = 5;
        int round = 1;
        System.out.println("You have to win within 5 rounds!");
        int roundWon = 0;
        do{
            System.out.println("This is Round "+round);
            do{
            System.out.println("No. of Attempts Remaining : "+attempt );
        System.out.println("Enter Your Guess: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
            
            if(randomNum==input){
                System.out.println(input+" Is the Right Answer!");
                correct++;
                round++;
                break;

                
            }
            else if(randomNum>input){
                System.out.println("Your answer is lower the answer was "+randomNum);
                attempt--;
                lower++;
                
            }
            else if(randomNum<input){
                System.out.println("Your answer is higher. The answer was "+randomNum);
                attempt--;
                higher++;
                
            }
           
            
        
        }while(attempt>0);
        
        System.out.println();
        System.out.println();
        attempt = 5;
        System.out.println("Your score for Round "+round+" is: ");
        System.out.println("Higher Guesses: "+higher);
        System.out.println("Lower Guesses: "+lower);
        System.out.println("Correct Guesses: "+correct);
           System.out.println();
        System.out.println();
        round++;
        
        
        
        

        }while(round<6);
        System.out.println("Your Final Score is");
        System.out.println("Rounds Won: "+roundWon);
        System.out.println("Higher Guesses: "+higher);
        System.out.println("Lower Guesses: "+lower);
        System.out.println("Correct Guesses: "+correct);
        
     
        
        
        
        }
        
        
        
    }

