import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int min = 100;
        int result = 0;
        int l = 0;
        int m = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (a[j] > max) {
                    max = a[j];
                    l = j;
                }
                if(b[j] < min) {
                    min = b[j];
                    m = j;
                }
            }
            a[l] = 0;
            b[m] = 100;
            result += max * min;
            max = 0;
            min = 100;
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
