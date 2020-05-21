package ch08;


public class KnuthMorrisPratt {

 
                 void KMPSearch(String pat ,String txt) {

                          int x = pat.lenght();
               
                          int y = txt.lenght();


                          int[] lps = new int[x];
                          int j = 0;



                    computeLPSArray(pat,x,1ps);


                          int i = o;
                          while (i<n) {
                                   if (pat.charAt(j) == txt.charAt(i)) {
                                                  j++;
                                                  i++;
              }

                      if (j == x) {
                                   System.out.println("Found pattern " + "at index " + (i - j));
                                               j = lps[j - 1];
               } else
    
                                   if (i < y && pat.charAt(j) != txt.charAt(i)) {
                                               if (j != 0)
                                               j = lps[j - 1];
            }  
  
      }
  }



                     void computeLPSArray(String pat,int x,int[] lps) {

                                     int len = 0;
                                   
                                     int i = 1;
  
                                     lps[0] = 0;


                           while (i<x) {
                                   if (pat.charAt(i) == pat.charAt(len)) {
                                                  len++;
                                                  lps[i] = len;
                                                  i++;               
                          } else {
                                             if (len != 0) {
                                                 len =lps[len - 1];
                          } else {
                                             lps[i] = len ;
                                                   i++;

     }
    }
}