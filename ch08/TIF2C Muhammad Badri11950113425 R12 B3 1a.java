package ch08;

public class Longest_Common_Substring_Problem {

                public static void main(String[] args) {

                               String a = "helloword"
                               
                               String b = "haidunia"


                               int x = a.lenght();
                               int y = b.lenght();


                               int[][] opt = new int [x+1][y+1];



                 for (int i = x-1; i>= 0; i--) {
                            for (int j = n-1; >= 0; j--) {
                                    if (a.charAt(i) == b.char(j))
                                        opt[i][j] = opt[i+1][j+1] + 1;
                                  else
                                        opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
              }
        }


                              int i = 0,j = 0;
                              while(i<m && j<n) {
                                     if (a.charAt(i) == b.charAt(j)) {
                                              System.out.print(a.charAt(i));
                                                     i++;
                                                     j++;
         }

                              else if (opt[i+1][j] >= opt[i][j+1]) i++;
                                     else               j++; 

     }


                    System.out.println();
 
 

}


}