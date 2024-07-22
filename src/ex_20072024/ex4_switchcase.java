package ex_20072024;

import java.util.Scanner;

public class ex4_switchcase {
    public static void main(String[] args) {
        /*int weekno=9;
        switch(weekno){
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thrusday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default: System.out.println("invalid input");
        }*/



       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int weekno =sc.nextInt();

        switch(weekno) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid input");
        }*/



       /* String weekname="sunday";

          int a;
        switch(weekname) {
            case "sunday":
                a=1;
                System.out.println("1");

                break;
            case "Monday":
                a=2;
                System.out.println("2");
                break;
            case "Tuesday":
                a=3;
                System.out.println("3");
                break;
            case "Wednesday":
                a=4;
                System.out.println("4");
                break;
            case "Thrusday":
           a=5;
                System.out.println("5");
                break;
            case "Friday":
                a=6;
                System.out.println("6");
                break;
            case "Saturday":
                a=7;
                System.out.println("7");
                break;
            default:
                a=0;
                System.out.println("Default 0");
        }
        System.out.println(a);*/

        //Example 2: Java Program to demonstrate the use of Java Switch
//statement with String

        //Declaring String variable
              /*  String levelString="Expert";
                int level;
                //Using String in Switch expression
                switch(levelString){
                    //Using String Literal in Switch case
                    case "Beginner": level=1;
                        break;
                    case "Intermediate": level=2;
                        break;
                    case "Expert": level=3;
                        break;
                    default: level=0;
                        break;
                }
                System.out.println("Your Level is: "+level);*/


        // Example 3:
        // Java Program to check the size
// using the switch...case statement
              /* String size;
                int number = 44;


                // switch statement to check size
                switch (number) {

                    case 29:
                        size = "Small";
                        break;

                    case 42:
                        size = "Medium";
                        break;

                    // match the value of week
                    case 44:
                        size = "Large";
                        break;

                    case 48:
                        size = "Extra Large";
                        break;

                    default:
                        size = "Unknown";
                        break;

                }
                System.out.println("Size: " + size);*/


        //Example 4: Simple Calculator using Java switch Statement
       /*char operator;
                Double number1,number2,result;

        Scanner sc=new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = sc.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = sc.nextDouble();

        System.out.println("Enter second number");
        number2 = sc.nextDouble();

        switch(operator){
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        sc.close();*/


        //Example 5: //Java Program to demonstrate the example of Switch statement
        ////where we are printing month name for the given number
        /*int month=7;
        String monthString="";
        switch(month){
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month");
        }
        System.out.println(monthString);*/

        //Important //Example 6: largest of 2 number
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here:");
        int a = sc.nextInt();

        int b = sc.nextInt();
        int res = a > b ? 0:1;

        switch (res)
        {

            case 0:

                System.out.println("Maximum Number is :" + a);break;

            case 1:
               int result = a == b ? 1:0;
                switch (result)
                {
                    case 0:
                        System.out.println("Maximum Number is :" + b);
                        break;
                    case 1:
                        System.out.println("Numbers are equal");
                        break;
                }
                break;



        }*/




      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        int n1 = input.nextInt();
        System.out.println("Enter the Number 2 : ");
        int n2 = input.nextInt();
        int result = n1>n2?1:0;
        switch(result)
        {
            case 0:
                int res = n1==n2?1:0;
                switch(res)
                {
                    case 0:
                        System.out.println("Maximum Number is "+n2);
                        break;
                    case 1:
                        System.out.println("Both are Equals");
                        break;
                }
                break;

            case 1:
                System.out.println("Maximum Number is "+n1);
                break;
        }*/
    }
}


