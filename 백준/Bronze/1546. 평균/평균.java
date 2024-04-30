import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double sumScore = 0;
        double maxScore = 0;
        for(int i=0; i<N; i++) {
            int score = sc.nextInt();
            if(score > maxScore) maxScore = score;
            sumScore += score;
        }

        System.out.println(sumScore  * 100.0 / maxScore / N);
    }
}
