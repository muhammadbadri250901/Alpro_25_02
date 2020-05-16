package ch03;

import java.util.Scanner;


public class r5no3 {

     
        public class static void main(String[] args) {
               Scanner Scan = new Scanner(System.int);
              
               System.out("inputkan bil : ");
                     int bil = Scan.nextint();
        
               for (int i = 3; 1 <= bil; i++) {
                     if (bil %i == 0) {
                             int pembagi = i ;
                       System.out.printlln("pembagi terkecil dari " +bil+ "adalah" + pembagi);
                       break;
                     }else{
                             i = i + 1
                       if (bil %1 == 0) {
                             int pembagi = i;
                              System.out.println("pembagi terkecil dari " +bil+ "adalah" + pembagi);
                               break;  


           }

 

       }

}