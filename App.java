import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
public class App {
    

    public static void main(String[] args) throws IOException{
        boolean keepGoing = true;
        int count = 1;
        while(keepGoing){
            String ans; 
            Scanner input = new Scanner(System.in);
            System.out.print("Type the number of dice rolls you want: ");
            int x = input.nextInt();
            System.out.print("Type how many sides the dice should have: ");
            int y = input.nextInt();

            int[] diceRolls = rollDice(x,y);

            input.close();

            FileWriter rollsWriter = new FileWriter("rolls.txt");
            rollsWriter.write("Roll " + count + ": " );
            for(int z = 0; z < x; z++){
                rollsWriter.write(diceRolls[z] + ", ");
            }
            rollsWriter.close();
            Scanner secondInput = new Scanner(System.in);

            System.out.print("Do you want to roll again (Y/N): ");
            
            ans = secondInput.nextLine();
            if(ans.equals("N")){
                keepGoing = false;
            } else{
                count = count +1;
            }
            secondInput.close();
        }
    }


    public static int[] rollDice(int numRolls, int sides){
        int[] rollsArray = new int[numRolls];
        for(int i = 0; i < numRolls; i++){
            rollsArray[i] = Dice.roll(sides);
            //System.out.println(rollsArray[i]);
        }
        return rollsArray;
    }
}
