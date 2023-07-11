
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bf.readLine());
        for (int i =0; i<a; i++){
           stack.push(Integer.parseInt(bf.readLine()));

        }
        int result = 1;
        int top = stack.peek();
        while (!stack.isEmpty()) {
            int tall = stack.pop();
            if (tall > top) {
                top = tall;
                result++;
            }
        } System.out.println(result);
        }
}
