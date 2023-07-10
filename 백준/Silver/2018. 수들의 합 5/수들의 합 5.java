
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int cnt=1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//system.in: 외부입력
        int N = Integer.parseInt(reader.readLine());

        for (int i=1; i<N; i++){
            int sum=i;
            for( int j=i+1; j<N; j++){
                sum+=j;


            if(sum==N) {cnt++;break;}
                else if(sum>N) break;
        }
        }
        System.out.println(cnt);


    }
}