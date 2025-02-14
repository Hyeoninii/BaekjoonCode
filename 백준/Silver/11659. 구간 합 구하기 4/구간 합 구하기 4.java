import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int DNum = Integer.parseInt(st.nextToken());
        int QNum = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[DNum + 1];  // 1-based indexing으로 간단하게 처리

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= DNum; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < QNum; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(sumArr[end] - sumArr[start - 1]).append("\n");
        }

        System.out.print(sb);
    }
}
