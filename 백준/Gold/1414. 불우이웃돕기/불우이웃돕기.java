

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    static int [] parent;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        int total_length=0;
        PriorityQueue<Edge> pq= new PriorityQueue<>();
        for(int i=0; i<N; i++){
            char[] arr= br.readLine().toCharArray();
            for(int j=0; j<N; j++){
                if(arr[j]=='0')continue;
                else{
                    int k=convertLength(arr[j]);
                    total_length+=k;
                    if(i!=j && k!=0) pq.add(new Edge(i,j,convertLength(arr[j])));
                }
            }
        }

        parent=new int[N+1];
        Arrays.setAll(parent, (i) -> i);
        int mst_length=0;
        int cnt=0;
        while(!pq.isEmpty()){
            Edge now_edge=pq.poll();
            if(find(now_edge.start)!= find(now_edge.end)){
                union(now_edge.start,now_edge.end);
                mst_length+= now_edge.weight;
                cnt++;
            }
        }
        if(cnt==N-1) System.out.println(total_length-mst_length);
        else System.out.println(-1);
    }

    private static void union(int start, int end) {
        start=find(start);
        end=find(end);
        if(start!=end)parent[end]=start;
    }

    private static int find(int a) {
        if(a==parent[a])return a;
        else return parent[a]=find(parent[a]);
        
    }

    static int convertLength(char c) {
        return (c>='a' && c<='z')? (c-'a'+1): (c-'A'+27);
    }

    static class Edge implements Comparable<Edge>{

        int start;
        int end;
        int weight;

        public Edge(int start , int end , int weight){
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
     
        @Override
        public int compareTo(Edge v){
            return this.weight>v.weight?1:-1;
        }

    }
}
