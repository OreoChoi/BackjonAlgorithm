package Java;

/**
 * jhChoi - 201119
 * 셀프넘버
 */
public class SelfNumber {
    public static void main(String[] args) {
        boolean[] selfNum = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            if (selfNum[i]) {
                continue;
            }

            int num = i;
            while (num < 10001) {
                char[] arr = Integer.toString(num).toCharArray();
                for (char c : arr) {
                    num = num + (c - '0');
                }

                if(num >10000){
                    break;
                }
                selfNum[num] = true;
            }
        }

        for (int i = 1; i < selfNum.length; i++) {
            if(!selfNum[i]) System.out.println(i);
        }
    }
}