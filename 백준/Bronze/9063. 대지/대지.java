import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxx = -10000;
        int maxy = -10000;
        int minx = 100000;
        int miny = 10000;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dx = Integer.parseInt(st.nextToken());
            int dy = Integer.parseInt(st.nextToken());
             minx= Math.min(dx,minx);
             maxx=Math.max(dx,maxx);
             miny=Math.min(dy,miny);
             maxy=Math.max(dy,maxy);
        }

        System.out.println((maxx - minx) * (maxy - miny));
    }
}
