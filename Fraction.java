
/**
 * Represents a fraction.
 *
 * @author (Sam Levine)
 * @version (Date: 10/8/2019)
 */
public class Fraction
{
    // fields
    // syntax --> private dataType nameOfField
    private int numVal;
    private int denVal;
    
    // constructor(s)
    // syntax --> public NameOfClass()
    /**
     * Creates a default fraction with numerator 7 and denominator 14.
     */
    public Fraction()
    {
        //gives initial values
        numVal = 7;
        denVal = 14;
    }
    
    public Fraction(int numIn, int denIn)
    {
        numVal = numIn;
        denVal = denIn;
    }
    
    // method(s)
    // syntax --> public returnType nameOfMethod()
    public double getDecimalValue()
    {
        //to return a value --> return
        return (double) (getNum())/(getDen());
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
    /**
     * Returns the string representation of this fraction
     * in the form numerator/denominator.
     * @return
     */
    @Override
    public String toString() {
        return numVal + "/" + denVal;
    }
    /**
     * multiplies our fraction by an integer
     * @param num the number to multiply this fraction by
     * @return the fraction multiplied by our integer input
     */
    public Fraction multiply(int num){
        Fraction result = new Fraction(numVal*num, denVal);
        return result;
    }
    /**
     * divides our fraction by an integer
     * @param num the number to divide this fraction by
     * @return the fraction divided by our integer input
     */
    public Fraction divide(int num){
        Fraction result = new Fraction(numVal, denVal*num);
        return result;
    }
}
