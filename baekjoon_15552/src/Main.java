import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            sb.append(sum);
            sb.append("\n");

        }

        System.out.println(sb);

    }
}