import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        int sum = 1;
        int start = 1;
        int end = 1;
        int count = 1;

        n = Integer.parseInt(br.readLine());

        /*
        투 포인터를 사용하면 3가지 케이스로 나뉜다
        n == end 일 때, n이하 이므로 같아지면 종료 (기존에 count가 1로 시작)
        n > sum 일 때, 구간 합이 더 작으므로 end를 하나 늘려줌
        n < sum 일 때, 구간 합이 더 많으므로 start를 하나 늘려줌
         */

        while(end != n) {
            if (sum == n) {
                count++;
                end++;
                sum += end;
            } else if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
