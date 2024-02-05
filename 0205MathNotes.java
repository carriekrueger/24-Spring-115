// Carrie Krueger
// 2-5-24
// Notes on math, casting, constants (Ch. 3), Math, rounding (Ch. 4)


public class MathNotes {
    public static void main(String[] args) {
        doMath();
    }

    //in this method, we'll do math things
    public static void doMath() {
        // Division

        System.out.println(5/2);  // 2
        System.out.println(5.0/2);// 2.5

        int num1 = 60;
        int num2 = 50;

        System.out.println(num1/num2);  // 1... exact?
        System.out.println(1.0*num1/num2); // works - introduce a DOUBLE LITERAL value

        System.out.println((double)num1/num2);  // the right way: CASTING
        // casting is when you temporarily turn a variable into another type... PEMDAS!

        System.out.println((double)(num1/num2)); // nope- cast is too late :-(

        // casting TRUNCATES (doesn't round)

        double pay = 500.92;
        System.out.println((int)pay); // 500!

        pay = 99.99999999999;
        System.out.println((int)pay);  // 99

        // What if we want to round?
        // Math: a premade Java class (like String)
        // many useful methods that do various math things
        // access using Math.___
        // can send in information/variables in ()

        //round: Math.round(double num)
        //returns (gives) a long, need to cast to an int

        int roundedPay = (int)Math.round(pay);
        // without cast: error (type mistmatch)
        System.out.println(roundedPay);  // 100

        // EXPONENTS (POWERS)
        // ex. num1 squared?
        // num1 * num1
        // OR use Math.pow(base, exponent) ** returns a double

        double squared = Math.pow(num1, 2);
        System.out.println(squared);  //3600.0

        // CONSTANTS (constant variable)
        // a variable whose value is set once and cannot be changed
        // proper formatting: all caps, keyword final

        final int NUMBER_OF_STUDENTS = 16;

        double TAX_RATE = 0.08;  // almost... missing final

        // Math -> built in constants
        System.out.println(Math.PI);




    } 

    
}
