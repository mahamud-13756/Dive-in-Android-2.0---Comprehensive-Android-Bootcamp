package Class3.Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s;
        System.out.println("Please Enter an Array size: ");
        s=sc.nextInt();
        int []a=new int[s];// or int a[]=new int[size];

        for (int i = 0; i<s; i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Please enter array value of index "+ i);
             a[i] = sc1.nextInt();
        }
        for (int g: a) {
            System.out.println(g);
        }
        System.out.println();

    }
}
