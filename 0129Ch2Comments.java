// Carrie Krueger
// 1-29-24
// Chapter 2 Notes: Comments

public class Ch2Comments {
    public static void main(String[] args) {
        comments(); //in this method we will explore comments
    }

    //a method to investigate comments
    public static void comments() {
        // anything you write in a comment is NOT read by the computer

        // We use comments for:
        // -Adding your name to the program
        // -Adding a brief description of the program 
        // -As you go along, to explain to others (and yourself) what your code should do

        // Also - DEBUGGING
        // If there is code that doesn't work quite yet 
        // If there's a bunch of lines that don't work and you want to isolate them

        // GIVE CREDIT
        // If you use someone else's code, use comments to credit them/the source
        // ex. shamelessly stolen from https://github.com/awesomecoder

        // HOW DO WE MAKE COMMENTS?

        // Line comments: anything after the // is ignored by the compiler
        // Block comments:  /* */  (slash star star slash) (comment sandwich)
        // Java Doc comments: /** */ will automatically generate code documentation

        // EXAMPLES

        /*  When you have multiple lines of comments
            it's helpful to do a block comment because
            you can add as many lines as you want.
            Good for program name/description at the top of the program
        */

        // DEBUGGING

        System.out.println("Hello World!");
        //System.out.println("Hello World!");
        System.out.println("Hello World!");
        //System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");


        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        */

    }
}
