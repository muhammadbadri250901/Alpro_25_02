package ch05;


public class Algoritma_Longest_Increasing_Subsequence {

             statis int lis(int[] arr,int n) {
 
                           int[] lis = new int[n];
             
                           int i,j, max = 0;

 
                           for (i = 0; i<n; i++)
                                     lis[i] = 1;
               
                           for (i = 1; i<n; i++)
                                     for (j = 0; j<i; j++)
                                                
                                             if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                                                        lis[i] = lis[j] + 1;


                            for (i = 0; i<n; i++)
                                  if (max <lis[i])
                                              
                                        max = lis[i];

                                  return max;


 
         }

        public static void main(String[] args) {
 
                       int[] arr = [12,9,40,33,90,25,41,33,45,10]
                       int n = arr.lenght;
                            
                                System.out.println("lenght of lis is " + lis(arr,n) + "\n");
    }
}