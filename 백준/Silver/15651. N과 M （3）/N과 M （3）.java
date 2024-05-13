import java.util.Scanner;

public class Main {

    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
    }

    static void solve(int depth) {
        // 깊이가 최대 깊이일 경우
        // 더이상 탐색할 자식 노드가 없으므로 return
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }

        // 깊이를 1씩 증가시키면서 재귀 호출
        for(int i=1; i<=N; i++) {
            arr[depth] = i;
            solve(depth + 1);
        }
    }

    public static void main(String[] args) {
        input();
        solve(0);
        System.out.print(sb);
    }
}
