import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        int count = 0;

        for(int k=0; k < n; k++) {
            int start = 0;
            int end = n-1;
            while(start < end) {
                if(start == k) {
                    start++;
                    continue;
                }
                if(end == k) {
                    end--;
                    continue;
                }
                int sum = arr[start] + arr[end];
                if(sum == arr[k]) {
                    count++;
                    break;
                } else if(sum < arr[k]) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
