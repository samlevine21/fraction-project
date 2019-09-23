
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
        return numVal/denVal;
    }
}
