public class Kodilla {

    public static void main (String[] args) {
        // your code goes here

        ATMImpl inter = new ATMImpl();
        inter.payment(200);
        inter.payoff(100);
        boolean connectToBank = inter.isConnectToBank();
        boolean isWorkEnd = ATMImpl.isWorkOfAtmEnd();

        System.out.println(isWorkEnd);
        System.out.println(connectToBank);
    }
}

class ATMImpl implements ATM {

    public void payment(int cashIN){
        System.out.println("Wpłacam");
    }

    public void payoff(int cashOut){
        System.out.println("Wypłacam");
    }

    public static boolean isWorkOfAtmEnd(){
        return true;
    }

}

interface ATM{

    void payment(int cashIN);

    void payoff(int cashOut);

    default boolean isConnectToBank() {
        return true;
    }

    static boolean isWorkOfAtmEnd() {
        return true;
    }

}
