// Carrie Krueger
// 9-1-22
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2OutputEscape {
    public static void main(String[] args) {
        
        escape(); //in this method we will explore output and escape sequences
    }

    //a method to investigate output and escape sequences
    public static void escape() {

        // print vs. println
        System.out.print("Hello Class!"); // next thing prints on same line
        System.out.println("It is Thursday."); // next thing prints on next line
        System.out.print("Almost Friday!");
        System.out.println(); // print new line/blank line

        // OUTPUT
        System.out.println(2);  // you can put text or numbers in a print statement

        System.out.println(1 + 2 * 3); // can even do math! (order of ops)

        // Escape Sequences
        // special characters denoted with \ (the escape character)

        // \n -> new line
        System.out.print("Hello \n\n\n");
        System.out.print("H\nello");
        System.out.println();

        // \t -> tab
        System.out.println("Hi\tHi");
        System.out.println("Hi\t\t\tHi");

        // \\ -> \
        System.out.println("\\");

        // \" -> "
        System.out.println("She said \"Java is the bestest language!\"");

        // You try!

        // Think of a quotation or saying that you know
        // Create a new class called PrintQuote.java
        // Output your saying with visible quotation marks in the output
        // Use a method to print your quote!

        // Ex. output: "That's the way the cookie crumbles."  


    }


}
