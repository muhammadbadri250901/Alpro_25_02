package ch05;


import java.util.Scanner;


public class Algoritma_Kadane {


             public statatic void main(String[] args) {

                   Scanner scan = new Scanner(System.in);
                        
                            System.out.print("input size array : ");
                                    int size = scan.nextint()
;
                            System.out.print("input nilai ke dalam array : ");
                                    int[] arr = new int[size];



                  for (int i = 0; i<size; i++){
                            arr[i] = scan.nextint();
       }

                  int MaxSubarraySize = arr[0];
                  int sum = 0;




                  for (int i = 0; i<size; i++){
                          sum = sum + arr[i];
                          if(MaxSubarraySize < sum){
                                  MaxSubarraySize = sum;
                   
                    }else if(sum < 0){
                                sum = 0;



                             System.out.println("aub array max : " + MaxSubarraySize);

     }
 
                
   }

 }