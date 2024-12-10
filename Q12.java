
package first;


public class Q12 {
    static int sum(int y){
      int sum=0;
    for(int i=y; i>=0; i--){
      sum=sum+i;
    }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
