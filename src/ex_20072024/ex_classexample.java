package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex_classexample {
    public static void main(String[] args) {
     //Example 1:
        /*int a=10;
        if (a==10){
            System.out.println("haha");
        }
        else {
            System.out.println("LOl");
        }

         */
        //Example 2:
      /*  boolean b=!false;
      if(b){
    System.out.println("b is true");
           }
         else {
    System.out.println("b is false");
          }*/
        //Example 3:
       /* boolean a= true;
        a=!a;
        if(2+2==4){
            System.out.println("Inside the loop");
        }
        System.out.println("Outside the loop " + a);*/

        //Example 4:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
              int input=  sc.nextInt();
        System.out.println("the value is ");

         */



        // Example 5:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=  sc.nextInt();
        int b=  sc.nextInt();

        System.out.println(Math.max(a,b));*/


        //Example 6: Grade Calculator:
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=  sc.nextInt();

        if (a>=100 && a<=90){
            System.out.println('A');
        }
        else if(a>=80 && a<=89){
            System.out.println('B');
        }
        else if(a>=70 && a<=79){
            System.out.println('C');
        }
        else if(a>=60 && a<=69){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }*/

        //Example 7: Grade Calculator:
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=  sc.nextInt();
        char grade= 'A';
        String res="";
        if (a>=100 && a<=90){
            grade='A';
        }
        else if(a>=80 && a<=89){
            grade='B';
        }
        else if(a>=70 && a<=79){
            grade='C';
        }
        else if(a>=60 && a<=69){
            grade='D';
        }
        else {
            res="Fail";
            System.out.println("Result is  " +res);
        }
        System.out.println("Result is  " +grade);*/

        //Example 8: Finding which browser :

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser :");
        String browser =  sc.next();

        switch (browser){

            case "Chrome":
                System.out.println(" starting the chrome browser");break;

            case "Firefox" :System.out.println(" starting the chrome browser");break;

            case "Edge" :System.out.println(" starting the chrome browser");break;

            case "Safari" :System.out.println(" starting the chrome browser");break;
            default:
                System.out.println("I have no idea");

        }*/

//Example 9: character is a Vowel:

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char user_input =  sc.next().charAt(0);

        switch(user_input){

            case 'a':
                System.out.println("character "+ user_input +" is a Vowel");break;
            case 'e':
                System.out.println("character is a Vowel");break;
            case 'i':
                System.out.println("character "+ user_input +" is a Vowel");break;
            case '0':
                System.out.println("character is a Vowel");break;
            case 'u':
                System.out.println("character "+ user_input +" is a Vowel");break;
            default:
                System.out.println("character is not a Vowel");break;

        }*/
// similarly with if else we can do

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char s =  sc.next().charAt(0);
        if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
        System.out.println(" vowels");}
        else{
            System.out.println("consonent");
        }*/



//Example 10: finding the similar item code:if JDK is more than 13

       /* int itemcode=010;
        switch(itemcode){
            case 001,002,003:
                System.out.println("It is a electronic gadget");break;
            case 007,010,005:
                System.out.println("It is a electronic gadget");break;
            default:
                System.out.println("None");

        }*/
        //Example 11: Important example
/*int a=1;
switch (-1){
    default: System.out.println("default");break;
    case -1: System.out.println("10");break;//-1==-1
case 9: System.out.println("19910");break;}*/


        //Example 12: Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
//        int side1 = 5;
//        int side2 = 4;
//        int side3 = 4;
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 :");
        int side1 =  sc.nextInt();
        System.out.println("Enter the side2 :");
        int side2 =  sc.nextInt();
        System.out.println("Enter the side3 :");
        int side3 =  sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }*/

//Example 13:

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int s =  sc.nextInt();

        if(s%3==0 && s%5==0){
            System.out.println("Fizz Buzz");
        }
        else if(s%5==0){
            System.out.println("Buzz");
        }
        else if(s%3==0){
            System.out.println("Fizz");
        }
        else {
            System.out.println(s);
        }

    }
}
