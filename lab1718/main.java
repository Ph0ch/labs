package lab1718;

import java.util.Scanner;
import java.util.regex.*;

public class main {

    public static void main(String[] args) {
        System.out.println("\nПункт 1 (строка)");
        checkRegEx("^abcdefghijklmnopqrsyuv18340$");

        System.out.println("\nПункт 2 (MAC-адрес)");
        checkRegEx("(?<![:-])\\b(?:[0-9A-Fa-f]{2}:){5}[0-9A-Fa-f]{2}\\b(?![:-])");

        System.out.println("\nПункт 3 (Валюта)");
        checkRegEx("\\d+(\\.\\d+)? (USD|RUR|EUR)");
    }

    public static void checkRegEx(String strRexEx){
        System.out.print("Введите входные данные: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile(strRexEx);
        Matcher m1 = p1.matcher(str);
        System.out.println("Результат: " + m1.matches());
    }
}
