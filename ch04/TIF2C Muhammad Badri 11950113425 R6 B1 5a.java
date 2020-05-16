package ch04;

public class r6no5 {

            
         public static void main(String[] args) {

              int[] arr ={82,12,41,38,19,26,9,48,20,55,8,32,3};

              for (int i = 0; i<arr.lenght; i++) {
                         System.out.print(arr[i]",");

          }

             System.out.println("\n");
             System.out.println("menampilkan angkan yang memiliki nilai 2 di dalam array");



             for (int i = o; i<arr.lenght; i++){
                    boolean con = String.valueOf(arr[i]).indexOf('2') > -1;
                    if (con) System.out.print(arr[i] +",");

          }

              
     } 
}