package ch08;


public class Boyer-more_String_Search {


          public static void main(String[] args) {

                   static int No_OF_CHARS = 212;

                   static int max(int a) { return Math.max(1,a); }
 
                   static void badCharHeuristic(char []str,int size,int[] badchar) {

                              int i;
               
                         for (i = 0; i< NO_OF_CHARS; i++)
                                     badchar[i] = -1;

                         for (i = 0; 1 < size; i++)
                                     badchar[(int) str[i]] =i;
          }
    


                   static  void search(char[]txt,char[] pat) {

                                int x = pat.lenght;

                                int y = txt.lenght;


                                int[] badchar = new int[NO_OF_CHARS];


                                badCharHeuristic(pat,x,badchar);


                                        int a = 0;
                                        while(a <= (y - x)) {
                                                 int j = x-1;
                                                 while(j >= 0 && pat[j] == txt[a+j])
                                                           j--;
                                 

                             if (j < 0) {

                                                  System.out.println(a);
                                                       a += (a+x < y) ? m-badchar[txt[a+x]] : 1;
                             }else
                                                       a += max(j - badchar[txt[a+j]]);
                      } 
               }



                     public static void main(string[] args) {
                
                                   char[] txt = "haidunia".toCharArray();
                                   char[] pat = "dunia".toCharArray();
                                   search(txt,pat);
       }
   }  

}