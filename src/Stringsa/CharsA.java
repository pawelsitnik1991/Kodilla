package Stringsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharsA {

    public static void main(String[] args) {
        Letters letters = new Letters();
        Random random = new Random();
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        int randomNumber;
        for (int i = 0; i < 50; i++) {
            randomNumber = random.nextInt(1, 50);
            stringArrayDeque.offer(letters.letterOfAlphabet(randomNumber, 'a'));
            System.out.println(letters.letterOfAlphabet(randomNumber, 'a'));
        }

        ArrayList<String> stringArrayListOfEvenNumbers = new ArrayList<>();
        ArrayList<String> stringArrayListOfOddNumbers = new ArrayList<>();
        while (stringArrayDeque.iterator().hasNext()) {
            if (stringArrayDeque.getFirst().length() % 2 == 0) {
                stringArrayListOfEvenNumbers.add(stringArrayDeque.poll());
            } else {
                stringArrayListOfOddNumbers.add(stringArrayDeque.poll());
            }
        }
        System.out.println(stringArrayDeque.size());

        System.out.println(stringArrayListOfEvenNumbers.size());
        for (int i = 0; i < stringArrayListOfEvenNumbers.size(); i++) {
            System.out.println(stringArrayListOfEvenNumbers.get(i).chars().count() + "---" + stringArrayListOfEvenNumbers.get(i));
            System.out.println();
        }

        for (int i = 0; i < stringArrayListOfOddNumbers.size(); i++) {
            System.out.println(stringArrayListOfOddNumbers.get(i).chars().count() + "---" + stringArrayListOfOddNumbers.get(i));
            System.out.println();
        }
        System.out.println(stringArrayListOfOddNumbers.size());

    }
}


class Letters {
    public String letterOfAlphabet(int numberOfRepetitions, Character letterToRepetitions) {
        String word = "";
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < numberOfRepetitions; i++) {
            characters.add(letterToRepetitions);
            word = word.concat(characters.get(i).toString());
        }
        return word;
    }
}
