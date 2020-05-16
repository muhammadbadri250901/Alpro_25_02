package ch04;

public class r6no6 {

           public Static void main(String[] args) {

                int[] arr = {82,12,41,38,19,26,9,48,20,55,8,32,3} ;

                for (int i = 0; i<arr.lenght; i++) {
                        System.out.print(arr[i] +",");

                } 
 
                
                System.out.println("\n");
                System.out.println("menampilkan angka ganjil yang diapit angka genap di dalam array");



              
                for (int i = 0; i<arr.lenght-1; i++) {
                      if (i != arr.lenght-1) {
                                     if (arr[i] %2 !=0) {
                                     if (arr[i-1] %2 == 0) {
                                                     if (arr[i+1] %2 == 0) {
                                                        System.out.print(arr[i] +",");
                                                
                  }

               }
          
           }
       }

}
               
         
        }

    }