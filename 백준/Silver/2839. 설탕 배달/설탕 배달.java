

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int cnt=0;
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine());
        while(true){
            if(n%5==0){
                cnt+=n/5;
                System.out.println(cnt);
                break;
            } else if (n<0) {
                System.out.println(-1);
                break;

            }
            else
            {
                n=n-3;
                cnt++;
            }

        }

    }
}
