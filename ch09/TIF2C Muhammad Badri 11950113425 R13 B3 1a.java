package ch09;


import java.util.Scanner;


public class Sieve_Of_Atkin {


                    public static void main(String[] args) {

                               Scanner scan = new Scanner(System.in);

                                       System.out.print("masukkan size bilangan");
                                                int size = scan.nextInt();

                                       if (size > 2) {
                                                System.out.print(2 + ",");
                         }

                                       if (size > 3) {
                                                System.out.print(3 + ",");
                         }



                                       boolean[] Soa = new boolean[size];

                               for (int i = 0;i<size; i++) {
                                         Soa[i] = false;
                          }


                               for (int i = 1; i * 1 < size; i++) {
                                       for (int y = 1; y * y <size; y++) {
                                                   int n = (4 * i * i) + (y * y);
                                                         if (n <= size && (n %12 == 1 || n % 12 == 5)) {
                                                               Soa[n]^= true;
                           }


                                        n = (3 * i * i) + (y * y);
                                        if (n <= size && n % 12 == 7) {
                                        Soa[n] ^= true;      
                           }

                                                    n = (3 * i * i) - (y * y);
                                                    if (i>y && n <= size && n % 12 == 11) {
                                                    Soa[n] ^= true;
                    }
                }
            }


                         for (int j = 5; j * j < size; j++) {
                                   if (Soa[j]) {


                                                     for (int k = j * j; k<size; k +=j * j) {
                                                               Soa[k] = false;

                      }
                }
        
           }




                            for (int l = 5; 1<size; i++) {
                                     if (Soa[1]) {
 
                                                    System.out.println(1 + ",");                    
                      }
               }

       
         }
    }