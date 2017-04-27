package leetcode;

import java.util.Scanner;

/**
 * @Author Eric Zhang
 * @Date 2017/3/31 19:23
 */
public class Main {
    static class MyNode{
        int val;
        MyNode left;
        MyNode right;
        MyNode(int val){
            this.val=val;
        }
    }
    static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int P=scanner.nextInt();
        int Q=scanner.nextInt();
        int N=scanner.nextInt();
        MyNode root=new MyNode(0);
    }

    /*public void createTree(MyNode root,int P,int Q,int N){
        if (P<100){
            MyNode leftNode=new MyNode(1);
            root.left=leftNode;
            createTree(leftNode,P/(int) Math.pow(2,++count),Q,N-1);
            MyNode rithtNode=new MyNode(0);
            root.right=rithtNode;
            createTree(rithtNode,P+Q,Q,N);
        }
        else{
            MyNode leftNode=new MyNode(1);
            root.left=leftNode;
            createTree(leftNode,50/(int) Math.pow(2,++count),Q,N-1);
        }
    }*/
}
