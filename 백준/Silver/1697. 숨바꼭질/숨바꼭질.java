
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int K;
    static ArrayList<Integer>[] graph;
    static int isVisited[];
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        isVisited = new int[100001];
        ans=0;
        bfs(N);
        System.out.println(ans);
    }

    private static void bfs(int n) {
        ans++;
        Queue<Integer> queue= new ArrayDeque<>();
        isVisited[n]=1;
        queue.add(n);
        while(!queue.isEmpty()){
            int now= queue.poll();
            if(now==K){
                ans=isVisited[now]-1;
                return;
            }

            if(now-1>=0 && isVisited[now-1]==0){
                isVisited[now-1]=isVisited[now]+1;
                queue.add(now-1);
            }
            if(now+1<=100000 && isVisited[now+1]==0){
                isVisited[now+1]=isVisited[now]+1;
                queue.add(now+1);
            }
            if(now*2<=100000 && isVisited[now*2]==0){
                isVisited[now*2]=isVisited[now]+1;
                queue.add(now*2);
            }
    }

}
}