public class Dice{
    public static int roll(int sides){
        int roll = (int) (Math.random()*sides);
        return roll;
    }
}