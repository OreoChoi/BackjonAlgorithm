package Java;

import java.util.Scanner;

/*SumOfNumbers*/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long S = sc.nextInt();
        long N = 0;
        long sum = 0;

        for (long i = 1; i < S; i++) {
            sum += i;
            N++;
            if(sum >= S){
                break;
            }
        }

        System.out.println(N-1);
    }
}
