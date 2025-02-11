import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] score = s.split(" ");
        double avg = 0;
        int[] scores = Arrays.stream(score)
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = 0;

        for (int i = 0; i < n; i++) {
            avg += scores[i];
            max = Math.max(max, scores[i]);
        }
        System.out.println((avg*100)/(max*n));
    }
}