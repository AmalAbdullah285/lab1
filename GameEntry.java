
package first;


public class GameEntry {
    int score ;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
   
    public static void main(String[] args) {
         GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100); 
        }
        
         GameEntry[] B = A.clone();
            A[4].setScore(550);
            System.out.println("قيمة B[4].score هي: " + B[4].getScore());

    }
}
