package fr.dmas.ocrexamples.utils;

import java.util.Scanner;

public class ScanName {
    public static String getName() {
        System.out.print("What is your name please? ");
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }
}
