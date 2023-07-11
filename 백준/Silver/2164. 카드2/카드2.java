
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main{
    public static void main(String[] args) throws IOException {
        Queue<Integer> que =new ArrayDeque<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bf.readLine());
        for (int i=1; i<=a; i++){
            que.add(i);
        }
 
        int i=1;
        while (que.size()!=1){

            if (i%2==1){
                que.poll();
                i++;
            }
            else{
                int x=que.poll();
                que.add(x);
                i++;
            }
        }
        System.out.println(que.poll());
    }
}
