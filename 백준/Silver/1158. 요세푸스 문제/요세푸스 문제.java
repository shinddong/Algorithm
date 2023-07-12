

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int idx=0;
        sb.append("<");
        while(!queue.isEmpty()){
            int poll_value=queue.poll();
            if(++idx%K==0) sb.append(poll_value+", ");
            else queue.offer(poll_value); //다시 뒤로 집어넣음
        }
        sb.delete(sb.length()-2,sb.length()); //뒤에 두개 삭제
        sb.append(">");
        System.out.println(sb.toString());
    }
}
