
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int arr[]= new int[N];
        for(int i =0; i<N; i++){
           arr[i]=Integer.parseInt(bf.readLine());

        }
        BubbleSort(arr);
        for(int i=0; i<N; i++){
         System.out.println(arr[i]);}
    }

    public static void BubbleSort(int[] arr) {
        for(int i=0; i<= arr.length-2; i++){
            for(int j=0; j<= arr.length-i-2; j++){
                if (arr[j]> arr[j+1]) swap(arr,j,j+1);
            }
        }

    }
    public static void swap (int [] arr,int i, int j){
        int tmp= arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
