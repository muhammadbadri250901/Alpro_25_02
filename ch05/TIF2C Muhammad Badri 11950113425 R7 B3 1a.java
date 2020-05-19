package ch05;


import java.util.Scanner;


public class Algoritma_Euclidean {


         public class static void main(String[] args) {
            
             Scanner scan = new Scanner(System.in) ;

             int a ;

             int b ;

                   System.out.print("masukan nilai a") ;            
                       a = scan.nextint();
                   System.out.print("masukkan nilai b");
                       b = scan.nextint();



              while  (b > 0)  {
                       int c = a % b;
                       a = b;
                       b = c;
   
     }

                           System.out.println("pbb: " + a);
}