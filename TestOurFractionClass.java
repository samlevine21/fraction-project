
/**
 * Write a description of class TestOurFractionClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestOurFractionClass
{
    public static void main(String[] args){
        //create a fraction object named f
        Fraction f = new Fraction();
        
        // let's get the num of f and store it in n
        int n = f.getNum();
        System.out.println(n);
        
        // frction g
        Fraction g = new Fraction();
        f.setNum(5);
        //now print it
        System.out.println(f.getNum());
        
        Fraction h = new Fraction(5,11);
        h.setDen(13);
    }
    public static void testMultiplyMethod() {
        Fraction f = new Fraction(4,5);
        System.out.print(f.multiply(2));
    }
    public static void testDivideMethod() {
        Fraction f = new Fraction(4,5);
        System.out.print(f.divide(2));
    }
}
