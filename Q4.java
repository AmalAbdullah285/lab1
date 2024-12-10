
package first;

import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        
        int arr[]=new int[7];
       
        System.out.println("enter the array elements ");
       int i=0;
    for( i=0; i<arr.length; i++){
         Scanner input= new Scanner(System.in);
        arr[i]=input.nextInt();
        
     }
        System.out.println("عناصر المصفوفة هي ");
     for( i=0; i<arr.length; i++){
      System.out.print(arr[i]);  } 
    }
}
