
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr;
    static int[] myArr;
    static int check;
    /*
    처음 문자열을 data라 하고
    인자로 세 개 받아서(reqDna, checkArr, data)
    data 값을 각각 A, C, G, T랑 비교해서 checkArr[위치]에 ++
    if(checkArr[위치]==reqDna[위치] 면 cnt++. 이 cnt가 첫줄에 받은 2번째 값이랑 일치하면 result++.
     */
    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = reader.readLine().split(" ");

        int S = Integer.parseInt(strs[0]);
        int P = Integer.parseInt(strs[1]);
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        check = 0;
        A = reader.readLine().toCharArray();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) check++;
        }
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        if (check == 4) result++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);//젤 오른쪽 추가
            Remove(A[j]);//젤 왼쪽 삭제
            if (check == 4) result++;
        }
        System.out.println(result);

    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0])
                    check--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1])
                    check--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2])
                    check--;
                myArr[2]--;
                break;

            case 'T':
                if (myArr[3] == checkArr[3])
                    check--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {switch (c) {
        case 'A':
            myArr[0]++;
            if (myArr[0] == checkArr[0])
                check++;
            break;
        case 'C':
            myArr[1]++;
            if (myArr[1] == checkArr[1])
                check++;
            break;
        case 'G':
            myArr[2]++;
            if (myArr[2] == checkArr[2])
                check++;
            break;

        case 'T':
            myArr[3]++;
            if (myArr[3] == checkArr[3])
                check++;
            break;
    }
    }
}
