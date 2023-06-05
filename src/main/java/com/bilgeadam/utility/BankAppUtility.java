package com.bilgeadam.utility;

import java.util.Scanner;

public class BankAppUtility {

    static Scanner scanner=new Scanner(System.in);


    public  static int  intVeriAlma(String query){
        System.out.println(query);
        int value=scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public  static double  doubleVeriAlma(String query){
        System.out.println(query);
        double value=scanner.nextDouble();
        scanner.nextLine();
        return value;
    }


    public  static  String stringVeriAlma(String query){
        System.out.println(query);
        return  scanner.nextLine();
    }
    public  static long  longVeriAlma(String query){
        System.out.println(query);
        long value=scanner.nextLong();
        scanner.nextLine();
        return value;
    }
}
