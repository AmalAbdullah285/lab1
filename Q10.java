
package first;

import java.util.Scanner;


public class Q10 {
     static boolean Multiple(long n, long m){
         
       for(int i=0; i<=n; i++){
           if(n%m==0) 
          return true;
    }         
         return false;
     }
     
     public static void main(String[] args) {
         System.out.println(Multiple(10,5));
    }
}
