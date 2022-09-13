package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ввести число в шестнадцатеричной системе счисления :");
        boolean flag = true;
        String number = scanner.nextLine().toUpperCase();

        while (flag) {
            if (number.matches("^[-+]?[0-9A-F]+[.,]?[0-9A-F]*$")) {//Проверка , на то чтобы использовались только символы которые есть в шестнадцатеричной системе счисления
                System.out.println("Перевод из шестнадцатеричной системе счисления в двоичную :" + Hex_To_Binary(number));
                flag = false;
            } else {
                System.out.println("Введено не шестнадцатеричное число.");
                break;
            }
        }
    }

    public static String Hex_To_Binary(String str) {
        char[] chars;
        chars = str.toCharArray();
        String BinNumber = "";
        HashMap<String, String> table = new HashMap<>();//Заполняю символы их табличными значениями
        table.put("0", "0000");
        table.put("1", "0001");
        table.put("2", "0010");
        table.put("3", "0011");
        table.put("4", "0100");
        table.put("5", "0101");
        table.put("6", "0110");
        table.put("7", "0111");
        table.put("8", "1000");
        table.put("9", "1001");
        table.put("A", "1010");
        table.put("B", "1011");
        table.put("C", "1100");
        table.put("D", "1101");
        table.put("E", "1110");
        table.put("F", "1111");

        for (int i = 0; i < chars.length; i++) {

            BinNumber += table.get(chars[i] + "");//Провожу по цыклу символы и записываю их значением из таблицы
        }
        return BinNumber;
    }
}

