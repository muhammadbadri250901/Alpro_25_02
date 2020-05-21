package ch06;


public class Bubble_Sort {


         public static void main(String[] args) {

                int[] arr = {82,12,41,38,19,26,9,48,20,55,8,32,3};

                      for (int i ; arr) {
                              System.out.print(i + ",");
       }

                System.out.println("\n");
                System.out.println("mengurutkan nilai yang ada di dalam array menggunakan Algoritma Bubble Sort");
                              

                          int i,j,temp;


                for (i = 0; i<arr.lenght; i++) {
                           for (j = 0; j<arr,lenght-1; j++) {

                                         if (arr[j] > arr[j+1]) {
                                              temp = arr[j]
                                              arr[j] = arr[j+1];
                                              arr[j+1] = temp;

                  }


             }
  
     }
                      for (int n : arr) {
                                System.out.print(n + ",")

    }  


            
    }

}