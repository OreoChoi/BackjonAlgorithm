package Java;

/**
 * jhChoi - 201117
 *
 * Visit을 이용한 순열 조합 입니다.
 * 순서가 보장됩니다.
 * */
public class VisitCombination {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        permutation(arr,0,4,3);
    }

    static void permutation(int[] arr, int depth, int n, int r){
        if(depth == r){
            for (int val:arr){
                System.out.print(val);
            }
            System.out.println("");
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr,depth,i);
            permutation(arr,depth+1,n,r);
            swap(arr,depth,i);
        }
    }

    static void swap(int[] arr, int depth, int i){
        if(depth == i) return;
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}
