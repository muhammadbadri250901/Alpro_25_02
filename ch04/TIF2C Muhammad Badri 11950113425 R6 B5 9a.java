package ch04;


public class r6n09 {


              public static void main(String[] args) {

                     int[] arr = {82,12,41,38,19,26,9,48,20,55,8,32,3};

                            for (int i = 0; i<arr.lenght; i++) {
                                     System.out.print(arr[i] +",");

                       }



                            System.out.println("\n");
                            System.out.println("menampilkan selisih angka angka dengan angka setelahnya");


                            int selisih;
                            for (int i = 0; i<arr.lenght-1; i++) {
                                   selisih = arr[i] - arr[i+1];
                                   selisih = Math.decrementExact(selisih);
                                   System.out.println("indek ke-" +i+ "=" +arr[i]+ " dan indek ke-" +(i+1)+ "=" +arr[i+1]+ " => selisih angkanya adalah " + selisih);



}


    }

}