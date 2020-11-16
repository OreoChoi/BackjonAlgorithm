import java.io.*;

/**
 * jhChoi - 201116
 * <p>
 * 백준 1927 - Min Heap
 */

public class MinHeapSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        MinHeap heap = new MinHeap(x);

        for (int i = 0; i < x; i++) {
            int command = Integer.parseInt(br.readLine());

            if (command == 0) {
                bw.write(heap.pop() + "\n");
            } else {
                heap.add(command, heap.index);
            }
        }

        bw.flush();
    }
    static class MinHeap {
        static final int ROOT = 1;
        int[] tree;
        int index = 1;



        public MinHeap(int size) {
            this.tree = new int[size + 1];
            this.tree[0] = 0;
        }

        public MinHeap(int[] tree) {
            this.tree = new int[tree.length + 1];
            this.tree[0] = 0;

            for (int i = 1; i < this.tree.length; i++) {
                add(tree[i - 1], index);
            }
        }

        public boolean isEmpty() {
            return tree[ROOT] == -1;
        }

        public int pop() {
            if (tree[ROOT] == 0) {   //더이상 요소가 존재 하지 않는 경우
                return 0;
            }

            --index;
            int root = tree[ROOT];
            int lastNode = tree[index];
            tree[index] = 0;

            if (tree[ROOT] == 0) {
                return root;
            }

            tree[ROOT] = lastNode;
            int curIndex = ROOT;
            while (true) {
                int lCIndex = curIndex * 2;
                int rCIndex = lCIndex + 1;
                int nextIndex;

                if (index > lCIndex && index > rCIndex) {
                    nextIndex = tree[lCIndex] >= tree[rCIndex] ? rCIndex : lCIndex;
                } else if (index > lCIndex) {
                    nextIndex = lCIndex;
                } else {
                    break;
                }

                int minChild = tree[nextIndex];
                int current = tree[curIndex];

                if (minChild > current) {
                    break;
                } else {
                    swap(nextIndex, curIndex);
                    curIndex = nextIndex;
                }
            }

            return root;
        }

        public void add(int value, int addIndex) {
            tree[addIndex] = value;
            index++;

            if (addIndex == ROOT) {   //루트 노드만 존재 하는 경우
                return;
            }

            while ((addIndex / 2) > 0) {
                if (tree[addIndex] > tree[addIndex / 2]) {
                    break;
                } else {
                    swap(addIndex, addIndex / 2);
                    addIndex = addIndex / 2;
                }
            }
        }

        void swap(int curIndex, int parentIndex) {
            int parentTemp = tree[parentIndex];
            tree[parentIndex] = tree[curIndex];
            tree[curIndex] = parentTemp;
        }
    }

}