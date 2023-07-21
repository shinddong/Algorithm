
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * 첫줄에 도시의 수 N
 * 둘째줄에 여행계획에 속한 도시들의 수 M
 * 다음 N개 줄에 N개의 정수 주어짐
 * 마지막줄에 여행계획 -> 0~M까지 입력받고, find 다 돌려서 이어지면 YES 아니면 NO
 */
public class Main {
    static int N,M;
    static int parent[];
    static int travel[];
    static boolean check;
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N=Integer.parseInt(bf.readLine());
        M=Integer.parseInt(bf.readLine());
        parent=new int[N+1];
        travel=new int[M];
        for(int i=1; i<N+1; i++){
            parent[i]=i;
        }
        for(int i=1;i<=N;i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=N; j++)
            {   int k=Integer.parseInt(st.nextToken());
                if(k==1) union(i,j);
                   }
    }
        st=new StringTokenizer(bf.readLine());
        int p = find(Integer.parseInt(st.nextToken()));
        check=true;
        while(st.hasMoreTokens()){
            if(p!=find(Integer.parseInt(st.nextToken()))) {check=false;
            break;}
        }
        System.out.println(check==true?"YES":"NO");
    }

    private static int find(int x) {
        if(x==parent[x] )return x;
        return parent[x]=find(parent[x]);

    }


    private static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if (x < y) parent[y] = x;
            else parent[x] = y;
        }
    }
}
