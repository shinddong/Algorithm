import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int K=Integer.parseInt(br.readLine());
        Stack<Integer> stack= new Stack<>();
        for(int i =0 ; i<K; i++){
            int curr=Integer.parseInt(br.readLine());
            if(curr!=0)stack.push(curr);
            else stack.pop();
        }
        int result=0;
        for(int i=0;i<stack.size();i++){
            result+= stack.get(i);
        }
        System.out.println(result);
    }
}
