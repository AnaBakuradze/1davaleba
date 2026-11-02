package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //exercise 1

        double produtPrice = 107;
        double finalPrice = produtPrice - (produtPrice * 0.10);

        System.out.println(finalPrice);

        if (produtPrice >= 100) {
            System.out.println("გეკუთვნის 10% ფასდაკლება");
        } else {
            System.out.println("არ გეკუთვნის ფასდაკლება");
        }


        //exercise 2
        String username = "admin";
        String password = "123456";

        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }


//exercise 4

        String orderStatus = "NEW";

        switch (orderStatus) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is on the way");
                break;
            case "DELIVERED":
                System.out.println("Order delivered");
                break;
            default:
                System.out.println("Unknown status");

        }
        //exsercise 5

        String text = "goodbay";
        int count = 0;

        System.out.println(text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }


        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'i' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'u' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'a') {

                count++;
            }


        }
        System.out.println("ხმოვნების რაოდენობა  " + count);

        int[] testeResult = {1, 0, 1, 1, 0};
        int passed = 0;
        int failed = 0;

        for (int i = 0; i< testeResult.length; i++) {

            if (testeResult[i] == 1) {
                passed++;


            } else if (testeResult[i] == 0) {
                failed++;


            }
        }


        System.out.println(passed + "   Passed");
        System.out.println(failed+ "  Failed");

    }


}

