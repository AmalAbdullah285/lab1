
package first;
import java.util.Scanner;

public class Q8 {
    static void inputAllBaseTypes(){
       String name;
       int age;
       char gender;
       double avg;
       
       Scanner input=new Scanner(System.in);
       System.out.println("ادخل اسمك");
       name=input.nextLine();
       
       System.out.println("ادخل جنسك");
       gender=input.next().charAt(0);
       
       System.out.println("ادخل عمرك");
       age=input.nextInt();
       
       System.out.println("ادخل معدلك");  
       avg=input.nextDouble();
      
      
        System.out.println("اسم المستخدم هو:"+name);  
        System.out.println("عمر المستخدم هو:"+age); 
        System.out.println("جنس المستخدم هو:"+gender); 
        System.out.println("معدل المستخدم هو:"+avg);   
    }
    
    public static void main(String[] args) {
        inputAllBaseTypes();
    }
}
