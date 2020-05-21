package ch09;


import java.util.Scanner;


public class Sieve_Of_Eratosthenes {


              void find(int n) {
                           
                        boolean[] prima = new boolean[n+1];

                             for (int a = 0; a<n; a++) {
                                        prima[a] = true;
                 }

                             for (int b = 2; b * b <= n; p++) {
                                        if (prima[b]) {

                                                     for (int a = b * 2; a<=n; a+=b) {
                                                            prima[a] = false;
                                            }
                                 }
                    } 


                               for (int a = 2; a< n; a++){
                                         if (prima[a]) {
                                                   System.out.println(i + ",");
                                       }
 
                               }

                       }



                  public static void main(String[] args) {

                                 Scanner scan = new Scanner(System.in);
                                       
                                         System.out.print("masukkan batas max bil prima yang inggin di cari : ")
            
                                                      int n = scan.nextInt();

                                 Sieve_Of_Eratosthenes obj = new Sieve_Of_Eratosthenes();
                                 obj.find(n);
           }

     }