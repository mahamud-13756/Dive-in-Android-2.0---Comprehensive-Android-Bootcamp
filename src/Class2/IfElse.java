package Class2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a number");
        int a=sc.nextInt();
        System.out.println("Please enter another number");
        int b=sc.nextInt();
        System.out.println("Please enter a double number");
        double c=sc.nextDouble();

//        if (a>b){
//            System.out.println("The big number is: "+a);
//        }
//        else {
//            System.out.println("The big number is: "+b);
//        }

//        if(a==b){
//            System.out.println("The number are equal");
//        }
//        System.out.println("end line");

        if(a>b && a>c){
            System.out.println("The big number is: "+a);
        }
        else if(b>a && b>c){
            System.out.println("The big number is: "+b);
        }
        else if(c>a && c>b){
            System.out.println("The big number is: "+c);
        }
        else{

            System.out.println("The big number are EQUAL");

        }


    }


}
