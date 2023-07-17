
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static boolean [] isVisited;
    static ArrayList<Integer> tree[];
    static int deleteNode;

    static int answer=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        N=Integer.parseInt(st.nextToken());
        isVisited=new boolean[N+1];
        tree=new ArrayList[N+1];
        int root=0;
        for(int i=0; i<N;i++)
        { tree[i]=new ArrayList<>();}
        st=new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++) {
            int arr = Integer.parseInt(st.nextToken(" "));
            if(arr!=-1){
                tree[i].add(arr);
                tree[arr].add(i);

            }else root=i;

        }
        st=new StringTokenizer(bf.readLine());
        deleteNode=Integer.parseInt(st.nextToken());
        if(deleteNode==root) System.out.println(0);
        else{
            DFS(root);
            System.out.println(answer);
        }


    }

    private static void DFS(int num) {
        //확장
        int cnt=0;
        isVisited[num]=true;
        for(int i: tree[num]){
            if(isVisited[i]==false && i!=deleteNode){
                cnt++;
                DFS(i);
            }
        }if(cnt ==0) answer++;
    }
}
