package ch05;


import java.util.Scanner;


public class Algoritma_Longest_Common Subsequence {


                   public static void main(String[] args) {
    
                          Scanner scan = new Scanner(System.in);


                          System.out.print("input String pertama : ");
                                 String a = scan.nextint();

                          System.out.print("input String kedua : ");
                                 String b = scan.nextint();
 

                                      int a = a.lenght();

                                      int b = b.lenght();
                                    
                                      int[][] 1csArr = new int[a + b][b + 1];


                                 for (int i = 0; i<=a; i++) {
                                             for (z = 0; z<= b; z++) {
                                             if (i == 0 || z == 0) {
 
                                                        1csArr[i][z] = 0;

                                       }else if (a.charAt(i - 1) == b.charAt(Z - 1)) {
                                                        1csArt[i][z] = 1csArt[i - 1][j - 1] + 1;
                                       }else{
                                                        1csArr[i][z] = Math.max(1csArr[i - 1][z] , 1csArr[i][z - 1]);
 
               } 
 
          }       
                                      
    }

                       int index = 1csArr[a][b];
                       
                       int newIndex = index;


                       char[] 1csChar = new char[index + 1];

                       while (a > 0 && b > 0) {
                                if (a.charAt(a - 1) == b.charAt(b - 1)) {
                                          1csChar[index - 1] = a.charAt(a - 1);

                          a--;
                                         b--;
                                         index--;
                       
                    }else if (1csArr[a - 1][b] > 1csArr[a][b - 1]) {
                                         a--; 
                    }else{
                                         b--;

           }



                                  System.out.print("LCS of " + a + " and " + b + " is ");
                                           for (int i = 0; i<newIndex; i++) ;
                                                    System.out.print(1csChar[i]);
        }
}
                                