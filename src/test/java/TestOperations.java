import org.junit.*;

public class TestOperations {
    private static Calculate calc = new Calculate();
    @Test
    public void additionTest(){
        double result = calc.addTwoNumbers(5,4);
        Assert.assertEquals(9, result, 0.0);
    }
    @Test
    public void substractionTest(){
        double result = calc.substractTwoNumbers(9, 8);
        Assert.assertEquals(1, result, 0.0);
    }
    @Test
    public void divisionTest(){
        double result = calc.divideTwoNumbers(6, 3);
        Assert.assertEquals(2, result, 0.0);
    }
    @Test
    public void multiplicationTest(){
        double result = calc.multiplyTwoNumbers(2, 5);
        Assert.assertEquals(10, result, 0.0);
    }
}
