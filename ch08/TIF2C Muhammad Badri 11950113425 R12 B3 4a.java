package ch08;


public class Miller_Rabin {

                
                Static int power(int x,int y,int z) {

                              int res = 1;

                              x = x % z;

                     while (y > 0) {
                          if ((y & 1) == 1)
                                     res = (res * x) % p;


                              y = y >> 1;
                              x = (x * x) % z; 
                   }
                     return res ;


             static boolean miillerTest(int a,int b) {

                              int c = 2 + (int)(Math.random() % (b - 4));
                           
                              int x = power( c,a,b);


                     if (x == 1 || x == b - 1)
                              return true;


                     while (a != b - 1) {
                                    x = (x * x) % b;
                                    a *= 2;
                                    

                                    if (x == 1)
                                                  return false;
                                    if (x == b - 1)
                                               
                                                  return true;
                        }
                           return false;
     }

                static boolean isPrime(int b,int d) {
         
                                if (b <= 1 || b == 4)
                                           return false;
                                if (b <= 3)
                                           return true;

                                int a = b - 1;

                                while (a % 2 == 0)
                                          d /= 2;

                     for ( int i = 0; i<k; i++)
                                  if (!miillerTest(a,b))
                                                 return false;

                                 
                                 return true;
           }
                 

                 public static void main(String[] args) {


                                int k 4;

                          System.out.println("bilangan prima lebih kecil dari " + "dari 100 : ");


                          for (int b = 1; b<100; n++)
                                  if (isPrime(b,k))
                                                 System.out.print(b + ",");
     }  

}