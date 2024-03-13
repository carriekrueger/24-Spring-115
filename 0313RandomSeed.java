// Carrie Krueger
// 3-13-24
// Notes on random number seeding and random chars

import java.util.Random;
import java.util.Scanner;

public class RandomSeed {

    public static void main(String[] args) {
        makeRandoms(); // make random things using a seed from the user
    }

    // this method asks the user for a seed for the random number generator
    // and then generates random numbers and chars
    public static void makeRandoms() {

        // Seeding the random number generator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a seed value:");
        int seed = sc.nextInt();

        Random rand = new Random(seed);  // use the seed that the user entered

        int rand1 = rand.nextInt(100);   // 0 - 99
        System.out.println("Random number 1 = " + rand1);
        // use the same seed, get the same "random" number!

        // 10 - 50
        int rand2 = rand.nextInt(41) + 10;
                            //  0 - 40 + 10 = 10-50 
        System.out.println("Random number 2 = " + rand2);

        // Random chars... ASCII Values/Table
        // ex. Random uppercase letter... ASCII value 65 - 90
        // need to cast to a char

        int rand3 = rand.nextInt(26) + 65;
        System.out.println("Random number 3 = " + rand3);
        char randomChar = (char)rand3;  // cast to a char
        System.out.println("Random character = " + randomChar);



    }
}
