package ch09;


import java.util.ArrayList;


import java.util.Scanner;


public class Sieve_Of_Sundaram {


                     public static void main(String[] args) {
 
                                   Scanner scan = new Scanner(System.in);

                          System.out.print("masukkan size : ");

                                   int size = scan.nextInt();

                                   int siz = (size - 2) / 2,x,y = 1;

                                   ArrayList<Integer> primes = new ArrayList<>();
                                              for (int i = 0; i < siz; i++)
                                                      primes.add(i +1);
                 

                             for (x = 1; ; x++) {
                                       if (x + y + 2 * x * y >siz) {

                                                       break;

                             for ( y = x; ; y++) {
                                        if (x + y + 2 * x * y > siz) {
                                            y = 1;
                                        
                                                       break;
                                }

                               
                                  for (int j = 0; j < primes.size(); j++)
                                  if (primes.get(j) == X + y +2 * x * y)
                                                      primes.remove(j);
                            }
                        }




                            for (int p = 0; p< primes.size(); p++)
                                       primes.set(p,2 * primes.get(p) + 1);
                                              primes.add(0,2);
                                      


                                       System.out.println("Number of primes below " + size + "is" +primes.size() + "they are : \n");
                                              for (Integer prime : primes) System.out.println(prime + ",");
                    }
            }
      }