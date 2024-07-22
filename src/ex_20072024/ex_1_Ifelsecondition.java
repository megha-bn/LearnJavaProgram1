package ex_20072024;

import java.util.Scanner;

public class ex_1_Ifelsecondition {
    public static void main(String[] args) {
//        int Person_age=15;
//        if( Person_age>=18){  //15>=18 -false go out of the loop
//
//            System.out.println("Eligible for Vote");
//
//        }
//        System.out.println("Not Eligible for Vote");



//    int Person_age=15;
//       if( Person_age<=18){  //15<=18 -True go into the loop [print-Eligible for Vote & Not Eligible for Vote]
//
//            System.out.println("Eligible for Vote");
//
//       }
//       System.out.println("Not Eligible for Vote");

//If else condition
//        int Person_age=20;
//        if( Person_age>=18){  //15<=18 -True go into the loop [print-Eligible for Vote & Not Eligible for Vote]
//
//            System.out.println("Eligible for Vote");
//
//        }
//        else{
//        System.out.println("Not Eligible for Vote");}

Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int Person_age=sc.nextInt();

        if( Person_age>=18){  //15<=18 -True go into the loop [print-Eligible for Vote & Not Eligible for Vote]

            System.out.println("Eligible for Vote");

        }
        else{
            System.out.println("Not Eligible for Vote");}
    }
}

