import java.util.StringTokenizer;
import java.io.*;

//메모리 12976kb, 시간 1340ms
//비효율적
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // arr는 저장할 필요가 없다.
        // int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                // arr[i][j] = Integer.parseInt(st.nextToken());
                // dp[i][j] = arr[i][j] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
                dp[i][j] = Integer.parseInt(st.nextToken()) + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
            }
        }
        // int[] result = new int[q]; result에 저장하는 것이 아니라 output buffer에 저장하고 한번에 출력

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            //result[i] = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
            bw.write((dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]) + "\n");
        }

        bw.flush(); // 출력 버퍼를 비우면서 실제 출력을 실행
        br.close();
        bw.close();
    }
}
