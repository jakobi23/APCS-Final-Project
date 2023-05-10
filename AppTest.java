import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest{

    @Test
    public void rollTest(){
        int[] rollArr = new int[1];
        rollArr = App.rollDice(1, 20);
        int[] rollArr2 = new int[1];
        rollArr2 = App.rollDice(1,20);
        Assertions.assertTrue(rollArr[0] >=1 && rollArr2[0] >=1 && rollArr[0] <=20 && rollArr2[0] <= 20);
    }

    @Test
    public void rollTest2(){
        int[] rollArr = new int[3];
        rollArr = App.rollDice(3, 6);
        int[] rollArr2 = new int[3];
        rollArr2 = App.rollDice(3,6);
        Assertions.assertTrue((rollArr[0] >=1 && rollArr2[0] >=1 && rollArr[0] <=20 && rollArr2[0] <= 20) && (rollArr[1] >=1 && rollArr2[1] >=1 && rollArr[1] <=6 && rollArr2[1] <= 6) && (rollArr[2] >=1 && rollArr2[2] >=1 && rollArr[2] <=6 && rollArr2[2] <= 6));
    }

}