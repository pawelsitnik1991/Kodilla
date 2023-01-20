public class Application {

    private String name;
    private int height;
    private int age;

    public Application(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public static void main(String[] args) {
        Application application = new Application("Pawel", 180, 31);
        application.writeYourName();
        application.numberOfAge();
        application.numberOfHeight();

    }

    private void writeYourName() {
        if (this.name.length() > 0) {
            System.out.println("Imie nie jest puste");
        }

    }

    private void numberOfHeight() {
        if (this.height > 160) {
            System.out.println("User is higher then 160cm");
        } else {
            System.out.println("User is lower than 160cm");
        }
    }

    private void numberOfAge() {
        if (this.age > 30) {
            System.out.println("User is older than 30");
        } else {
            System.out.println("User is younger than 30");
        }
    }
}
