package SimpleTask;

public class ChangeNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c ;

        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }
}
