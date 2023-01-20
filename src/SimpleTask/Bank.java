package SimpleTask;

public abstract class Bank {
    abstract String checkAccountCash();

    abstract String isAvilableToTransferMoney();

    abstract String agreeToTransferMoney();
}


class ATMachine extends Bank {
    String useCart() {
        return "Karta działa wprowadz karte";
    }

    String useYourPIN() {
        return "Pin zostal wprowadzony";
    }

    String useAtmToEnterMoney() {
        return "Wprowadzono kwote do pobrania";
    }

    String useAtmToPayOffYourMoney() {
        return "Wypłacam gotówke";
    }

    String showDialogToThankYouForPayOffMoney() {
        return "Podziekowanie za wyplacenie gotowki";
    }

    @Override
    String checkAccountCash() {
        return "Gotowka dostepna na koncie";
    }

    @Override
    String isAvilableToTransferMoney() {
        return "Informacja o przyjęciu prośby wypłaty przez SimpleTask.Bank";
    }

    @Override
    String agreeToTransferMoney() {
        return "Potwierdzenie Transferu Gotówki";
    }
}

class BankApplication {
    public static void main(String[] args) {
        ATMachine atMachine = new ATMachine();
        System.out.println(atMachine.useCart());
        System.out.println(atMachine.useYourPIN());
        System.out.println(atMachine.useAtmToEnterMoney());
        System.out.println(atMachine.isAvilableToTransferMoney());
        System.out.println(atMachine.checkAccountCash());
        System.out.println(atMachine.agreeToTransferMoney());
        System.out.println(atMachine.useAtmToPayOffYourMoney());
        System.out.println(atMachine.showDialogToThankYouForPayOffMoney());
    }
}
