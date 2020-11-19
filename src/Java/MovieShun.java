package Java;

import java.io.*;

/**
 * jhChoi - 201114
 * 1436 - 영화감독 숌
 * */
public class MovieShun {
    static String FIND_NUM = "666";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int startNum = 666;
        String mvName = "";

        while (N > count) {
            mvName = Integer.toString(startNum);
            if (mvName.contains(FIND_NUM)) {
                count++;
            }
            startNum++;
        }
        bw.write(mvName);
        bw.flush();
    }
}
/*

666
1666
2666
3666
4666
5666
6660
6661
6662
6663
6664
6665
6667
6668
6669
7666
8666
9666
10666
11666
12666
13666
14666
15666
16660

100666
106660
159666
160666
161666
162666
163666
164666
165666
166600
166601
166602
166603
166604
166605
166606
166607
166608
166609
166610
166611
166659
166670
166671
166672


*/
