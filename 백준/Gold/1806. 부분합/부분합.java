import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1] + Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 1;
        int minlen = Integer.MAX_VALUE;

        while(right <= n) {
            if (dp[right] - dp[left] >= s) {
                minlen = Math.min(minlen, right - left);
                left++;
            } else {
                right++;
            }
        }

        bw.write((minlen == Integer.MAX_VALUE) ? "0" : String.valueOf(minlen));
        bw.flush();
        br.close();
        bw.close();


    }
}
