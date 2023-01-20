package SimpleTask;

public class Wrappery {
    public static void main(String[] args) {
        int number = 1;
        Integer integerNumber=1;

        Character character='s';
        char charOne = 's';

        Double doubleOne = 1.2d;
        double doubleTwo = 1.2d;


        System.out.println(number==integerNumber);
        System.out.println(character==charOne);
        System.out.println(doubleOne==doubleTwo);
    }
}
