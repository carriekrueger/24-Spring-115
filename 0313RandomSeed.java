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


    }
}
