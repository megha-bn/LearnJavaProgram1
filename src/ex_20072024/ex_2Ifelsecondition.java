package ex_20072024;

import java.util.Scanner;

public class ex_2Ifelsecondition {
    public static void main(String[] args) {

// example 1 -Even or Odd Number
//        int A=10;
//        if (A%2==0){
//            System.out.println("number is even"+ A);
//        }
//        else{
//            System.out.println("number is odd"+ A);




//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Value");
//        int s =sc.nextInt();
//
//
//        if (s%2==0){
//            System.out.println("number is even:" + s);
//        }
//        else{
//            System.out.println("number is odd:" + s);
//        }


        //Example3: check number is positive, negative or zero.
//        int a=-2;
//        if(a>0){
//            System.out.println("number is positive:" +a );
//        }
//        else{
//            System.out.println("number is negative:" +a);
  //      }

      /*  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value");
      int s =sc.nextInt();

        if(s>0){
          System.out.println("number is positive:" +s );
      }
     else if(s<0){
           System.out.println("number is negative:" +s);
               }
     else{
            System.out.println("number is Zero:" +s);
        }*/


      /*  Example4:  largest of 3 numbers
                a=10, b=20, c=30

        a>b and a>c   -- a is largest
        b>a  and b>c   --- b is largest
        c>a and c>b   -- c largest*/

      /*  int a=100;
        int b=50;
        int c=90;
        if (a>b && a>c){
            System.out.println("a is largest number");
        }
        else if(b>a && b>c){
            System.out.println("b is largest number");
        }
        else{
            System.out.println("c is largest number");
        } */



       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("a is largest number");
        }
        else if(b>a && b>c){
            System.out.println("b is largest number");
        }
        else{
            System.out.println("c is largest number");
        }*/
//Example 5:   Smallest of 3 numbers(if..else)

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value a:");
        int a =sc.nextInt();
        System.out.println("Enter the Value b:");
        int b = sc.nextInt();
        System.out.println("Enter the Value c:");
        int c = sc.nextInt();

        if (a<b && a<c){
            System.out.println("a is the smallest number");
        }
        else if(b<a && b<c){
        System.out.println("b is the smallest number");}
        else {
            System.out.println("c is the smallest number");
        }



       // Example 6:  display week names based on week number
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int weekno =sc.nextInt();

        if (weekno==1)
        {
            System.out.println(weekno +"is a Monday");
        }
        else if(weekno==2){
            System.out.println(weekno +"is a Tuesday");
        }
        else if(weekno==3){
            System.out.println(weekno +"is a Wednesday");
        }
        else if(weekno==4){
            System.out.println(weekno +"is a Thrusday");
        }
        else if(weekno==5){
            System.out.println(weekno +"is a Friday");
        }
        else if(weekno==6){
            System.out.println(weekno +"is a Saturday");
        }
        else {
            System.out.println(weekno +"is a Sunday");
        }*/

//Example 7 : If else statement with loops

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int weekno =sc.nextInt();
        for (weekno=1;weekno<=7;weekno++) {

            if (weekno == 1) {
                System.out.println(weekno + "is a Monday");
            } else if (weekno == 2) {
                System.out.println(weekno + "is a Tuesday");
            } else if (weekno == 3) {
                System.out.println(weekno + "is a Wednesday");
            } else if (weekno == 4) {
                System.out.println(weekno + "is a Thrusday");
            } else if (weekno == 5) {
                System.out.println(weekno + "is a Friday");
            } else if (weekno == 6) {
                System.out.println(weekno + "is a Saturday");
            } else {
                System.out.println(weekno + "is a Sunday");
            }
        }*/

    }
}
