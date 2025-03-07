import java.io.*;
import java.util.*;

/* 주몽의 망령
위 문제는 무작위 두 수의 합이 n이 되는 갯수를 찾는 방법에 대한 것이다.
무작위 고유의 자연수를 받기 때문에 정렬을 통해서 오름차순으로 정렬한 후,
처음과 끝을 더하면 3가지 경우가 나온다.
1. a[i] + a[j] > n : 왼쪽의 숫자는 현재 더할 수 있는 가장 작은 숫자이므로 큰 숫자를 줄여야 한다.
2. a[i] + a[j] < n : 오름차순으로 정렬했기 때문에 a[j-1]은 항상 a[j]보다 작다.
3. a[i] + a[j] = n
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 재료의 수 = 배열의 길이
        int m = Integer.parseInt(br.readLine()); // 구해야 하는 합

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 1;
        int end = n;
        int count = 0;

        while(start < end) {
            if(arr[start] + arr[end] > m) {
                end--;
            } else if(arr[start] + arr[end] < m) {
                start++;
            } else {
                count++;
                start++;
                end--;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
