package ch03;

import java.util.Scanner;

public class r5no1 {


         public class static void main(String[] args) {

               Scanner scan = new Scanner(System.in);
 
               System.out.print("inputkan bil : ");
                    int bil = scan.nextint();
                    int n = 0;


               for (int i = 1; i <= bil; i++) {
                         if (bil %i == 0) {
                         n = n + 1;


               if (n == 2) {
                         System.out.println("bil + "merupakan bil prima");
               }else{
                         System.out.println("bil + "bukan bil prima");


a

                 }

           }

     
      }