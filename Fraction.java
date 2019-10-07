
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // fields
    // syntax --> private dataType nameOfField
    private int numVal;
    private int denVal;
    
    // constructor(s)
    // syntax --> public NameOfClass()
    public Fraction()
    {
        //gives initial values
        numVal = 7;
        denVal = 14;
    }
    
    // method(s)
    // syntax --> public returnType nameOfMethod()
    public double getDecimalValue()
    {
        //to return a value --> return
        return (double) numVal/denVal;
    }
    public void setNum(int newNum) {
        numVal = newNum;
    }
    public void setDen(int newDen) {
        denVal = newDen;
    }
    public int getNum() {
        return numVal;
    }
    public int getDen() {
        return denVal;
    }
    public void getFrac() {
        System.out.print(numVal);
        System.out.print("/");
        System.out.println(denVal);
    }
}
