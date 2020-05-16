package ch03;

import java.util.Scanner;

public class r5no2 {

         public static void main(String[] args) {
       
                Scanner scan = new Scanner(System.in);
    
                int x,y;

                System.out.print("nilai x : ");
                     x = scan.nextint();
                System.out.print("nilai y : ");
                     y = scan.nextint();
                
                if ( x > y ) {
                         System.out.println("nilai x : " + x);
                }else if  ( y > x ) { 
                         System.out.println("nilai y : " + y);
          


             }

       }


}