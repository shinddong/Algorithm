

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] board;

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        board = new int[N];
        dfs(0);
        System.out.println(cnt);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            board[depth] = i;
            //조건 맞으면 dfs
            if (check(depth) == true)
                dfs((depth + 1));
        }
    }

    private static boolean check(int num) {
        for (int i = 0; i < num; i++) {
            if(board[i]==board[num]|| Math.abs(board[i]-board[num])==Math.abs(i-num)){
                return false;
            }
        }


        return true;

    }

}
