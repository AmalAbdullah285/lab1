
package first;

import java.util.Scanner;


public class Q6 {
    public static void inparrele(){
        int arr[]=new int[9];
        System.out.println("ادخل عناصر المصفوفة ");
        Scanner input=new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
           arr[i]=input.nextInt();     
        }
    }
    
    public static void main(String[] args) {
        inparrele();
    }
    }
    

