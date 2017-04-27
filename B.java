package leetcode;

import java.util.Scanner;

/**
 * @Author Eric Zhang
 * @Date 2017/3/31 19:59
 */
public class B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int K=scanner.nextInt();
        int[] A=new int[M];
        int[][] level=new int[M][K];
        int[] leaf=new int[K];
        int[][] maritx=new int[K][K];
        for (int i=0;i<M;i++){
            A[i]=scanner.nextInt();
        }
        for (int i=0;i<M;i++){
            for (int j=0;j<A[i];j++)
                level[i][j]=scanner.nextInt();
        }
        for (int i=0;i<K;i++){
            leaf[i]=scanner.nextInt();
        }
        for (int i=0;i<K;i++)
            for (int j=0;j<K;j++)
                maritx[i][j]=scanner.nextInt();
    }
}
