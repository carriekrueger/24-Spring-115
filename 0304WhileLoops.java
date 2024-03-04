// Carrie Krueger
// 3-4-24
// All about while loops

public class WhileLoops {
    public static void main(String[] args) {

       loops(); // while loops
    }

    // this method looks at while loops
    public static void loops() {

       // Ask a question one time: if-statement
       // Ask a question repeatedly (or do something repeatedly): loop (while)

       // LOOP RULES:

       // When you program a loop, you should know that it will 
       // DEFINITELY end once some condition has occurred 

       // Usually you have to increment some variable 
       // so that the loop will approach the end state
       // LCV (loop control variable)

       // WAYS TO INCREMENT A VARIABLE (3.7 in textbook)

        int count = 0;

        // how to add 1?
        count = count + 1; // adds 1 and saves the updated value (assigns) to count
        count += 1;  // compound operator (shortcut)
        count++;  // another common way to increment by 1

        // One more note: use curly braces {  } around the while loop code!

        // HERE COMES A LOOP!

        int counter = 0; 

        // loops ends when the value of counter is 5
        while(counter != 5) {
            System.out.println(counter);
            counter += 1;  // increment (get counter to 5)
        }

        // how many times does this loop run? 5 times
        // can adjust start/end/increment values, can use <, >, etc. ...

        int num = 0;
        while(num < 3) {
            System.out.println(num);
        }

        // INFINITE LOOP OF DOOM!!!!!  (needs an incrementor)
        // Ctrl + z to escape/break the loop in the terminal 

        // Live Code Demos in Brightspace
    }

}
