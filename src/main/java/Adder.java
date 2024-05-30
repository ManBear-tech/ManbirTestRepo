import java.util.ArrayList;

public class Adder
{
    private int num1;

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int getNum3()
    {
        return num3;
    }

    public void setNum3(int num3)
    {
        this.num3 = num3;
    }

    private int num2;
    private int num3;

    public Adder()
    {}

    public Adder(Subtractor sub, Multiplier mult)
    {
        String[] emptyArray = new String[0];
        emptyArray[1] = "lol";
    }

    public int addSomething(int something, Subtractor sub)
    {
        return something + something  + 5 - 4;
    }

    public int addSomething(int num1, int num2)
    {
        return num1 + num2 + 10 - 5;
    }

    public int doNothing(int something)
    {
        return something * something + 1;
    }
}
