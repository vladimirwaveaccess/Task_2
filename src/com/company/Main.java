package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select task:>");
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        System.out.println("3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9.1.");
        System.out.println("9.2.");
        System.out.println("9.3.");
        System.out.println("9.4.");
        System.out.println("9.5.");
        System.out.println("9.6.");
        System.out.println("9.7.");
        System.out.println("9.8.");

        Scanner scanChoose = new Scanner(System.in);
        String choose = scanChoose.next();

        switch (choose) {
            case "1":
                System.out.println("Введите размерность массива>");
                Scanner scan = new Scanner(System.in);
                int size = Integer.parseInt(scan.next());
                String[] strMasive = getStrings(size);

                MinMaxSize(size, strMasive);

                break;
            case "2":
                System.out.println("Введите размерность массива>");
                scan = new Scanner(System.in);
                size = Integer.parseInt(scan.next());
                strMasive = getStrings(size);

                SortAsc(strMasive);
                SortDesc(strMasive);
                break;
            case "3":
                System.out.println("Введите размерность массива>");
                scan = new Scanner(System.in);
                size = Integer.parseInt(scan.next());
                strMasive = getStrings(size);

                
                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            default:
                System.out.println("Something go wrong");
        }



}

    private static void SortAsc(String[] strMasive) {
        for (int i = strMasive.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (strMasive[j].length() > strMasive[j+1].length()){
                    String temp = strMasive[j];
                    strMasive[j] = strMasive[j+1];
                    strMasive[j+1] = temp;
                }
            }
        }
        System.out.println("Массив в порядке возрастания значений их длины.\n" + Arrays.toString(strMasive));
    }

    private static void SortDesc(String[] strMasive) {
        System.out.println(Arrays.toString(strMasive));
        for (int i = strMasive.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (strMasive[j].length() < strMasive[j+1].length()){
                    String temp = strMasive[j];
                    strMasive[j] = strMasive[j+1];
                    strMasive[j+1] = temp;
                }
            }
        }
        System.out.println("Массив в порядке убывания значений их длины.\n" + Arrays.toString(strMasive));
    }

    private static void MinMaxSize(int size, String[] strMasive) {
        String maxStr, minStr;
        maxStr = strMasive[0];
        minStr = strMasive[0];
        for (int i = 0; i < size; i++) {
            if (maxStr.length() < strMasive[i].length()){
                maxStr = strMasive[i];
            }
            else if (minStr.length() > strMasive[i].length()){
                minStr = strMasive[i];
            }
        }
        System.out.println("Число с максимальной длиной = " + maxStr);
        System.out.println("maxStr.length() = " + maxStr.length());
        System.out.println("Число с минимальной длиной = " + minStr);
        System.out.println("minStr = " + minStr.length());
        System.out.println("Массив = " + Arrays.toString(strMasive));
    }

    private static String[] getStrings(int size) {
        Scanner scan;
        System.out.println("Введите элементы массива через Enter>");

        String[] strMasive = new String[size];
        for (int i = 0; i < size; i++) {
            scan = new Scanner(System.in);
            strMasive[i] = scan.next();
        }
        return strMasive;
    }
}
