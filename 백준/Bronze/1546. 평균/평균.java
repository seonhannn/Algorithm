import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        for(int i=0; i<N; i++) {
            scores[i] = sc.nextInt();
        }

        double sumScore = 0;
        double maxScore = 0;
        for(int i=0; i<N; i++) {
            if(scores[i] > maxScore) maxScore = scores[i];
            sumScore += scores[i];
        }

        System.out.println(sumScore  * 100.0 / maxScore / N);
    }
}
