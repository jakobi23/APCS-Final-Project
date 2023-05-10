import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
public class App {
    

    public static void main(String[] args) throws IOException{
        boolean keepGoing = true;
        int count = 1;
        FileWriter rollsWriter = new FileWriter("rolls.txt");
        Scanner input = new Scanner(System.in);
        while(keepGoing){
            int ans;
            int x;
            int y;
            boolean tOrF = true;
            
            System.out.print("Type the number of dice rolls you want: ");
            x = input.nextInt();
            System.out.print("Type how many sides the dice should have: ");
            y = input.nextInt();

            int[] diceRolls = rollDice(x,y);

            
            rollsWriter.write("Roll " + count + ": " );
            for(int z = 0; z < x - 1; z++){
                rollsWriter.write(diceRolls[z] + ", ");
            }
            rollsWriter.write(diceRolls[x-1] + "\n");
            

            System.out.print("Do you want to roll again (Y = 1/N = 0): ");
            
            ans = input.nextInt();
            while(tOrF){
                if(ans == 0){
                    keepGoing = false;
                    tOrF = false;
                    
                } else if(ans == 1){
                    count = count +1;
                    tOrF = false;
                } else{
                    System.out.println("An error occurred with your input");
                }
            }
            
        }
        input.close();
        rollsWriter.close();
    }


    public static int[] rollDice(int numRolls, int sides){
        int[] rollsArray = new int[numRolls];
        for(int i = 0; i < numRolls; i++){
            rollsArray[i] = Dice.roll(sides);
        }
        return rollsArray;
    }
}
