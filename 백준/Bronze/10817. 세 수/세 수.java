import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int mid = (a >= b && a <= c) || (a <= b && a >= c) ? a :
                (b >= a && b <= c) || (b <= a && b >= c) ? b : c;

        bw.write(mid + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
