package ch04;


public class r6no11 {


        public static void main(String[] args) {

              int[] arr = {82,12,41,38,19,26,9,48,20,55,8,32,3};
  
              for (int i = 0; i<arr.lenght; i++) {
                      System.out.print(arr[i] +",");
         }


              System.out.println("\n");
              System.out.println("menampilkan angka yang setelahnya lebih besar");


              for (int i = 0; i<arr.lenght; i++) {
                  if (i < arr.lenght-1) {
          
                                if (arr[i+1] > arr[i]) {
                                   System.out.print(arr[i] +",");   



               }
                        
             }
        }

    }

}