import java.io.*;

/**
 * jhChoi - 201114
 * No.1259 팰린드롬수
 */
public class PalindromeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String num = br.readLine();

            if(num.equals("0")){
                break;
            }

            char[] arr = num.toCharArray();
            int last = arr.length - 1;
            String answer = "yes\n";
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[last]) {
                    answer = "no\n";
                    break;
                }
                last--;
            }

            bw.write(answer);
        }

        bw.flush();
    }
}
