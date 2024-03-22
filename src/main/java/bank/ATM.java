package bank;

import java.util.Scanner;

public class ATM {
    public void start() {
        showStartATMInfo();

        checkUserChoice();
    }

    private void checkUserChoice() {
        String choice = getScannerData();

        switch (choice) {
            case "1" -> askCardData();
            case "2" -> askAdminData();
            default -> showChoiceError();
        }
    }

    private String getScannerData() {
        return new Scanner(System.in).nextLine();
    }

    private void showChoiceError() {
    }

    private void askAdminData() {
    }

    private void askCardData() {
        System.out.println("Вставьте карту.");
        String cardNumber = getScannerData();
        checkPinCode(cardNumber);
    }

    private void checkPinCode(String cardNumber) {
        for (int i=0; i < Bank.getAccounts().size(); i++) {

        }
    }

    private void showStartATMInfo() {
        System.out.println("Добро пожаловать!");
    }
}