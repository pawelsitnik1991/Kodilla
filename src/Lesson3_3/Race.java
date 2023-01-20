package Lesson3_3;

import java.util.Random;

public class Race {


    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;

        Random randomGenerator = new Random();
        int n = randomGenerator.nextInt(10);
        int m = randomGenerator.nextInt(50);

        int iteration = 0;
        while (sumA > sumB) {
            System.out.println(iteration++);
            sumA = sumA + n;
            sumB = sumB + m;
            System.out.println(sumA);
            System.out.println(sumB);
        }
    }
}
