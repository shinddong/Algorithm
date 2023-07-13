
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {


    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    N=Integer.parseInt(bf.readLine());
    StringTokenizer st = new StringTokenizer(bf.readLine());
    //초기값 저장
    int arr[]= new int[N];
        for(int i =0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());

        }
   //정렬
   Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        int result[]=new int[N];
        result[0]=arr[0];
        for (int i=1; i<N;i++){
            result[i]=result[i-1]+arr[i];
        }
     //   System.out.println(Arrays.toString(result));
        int sum=0;
        for(int i=0; i<N;i++){
            sum+=result[i];
        }
        System.out.println(sum);
}}
