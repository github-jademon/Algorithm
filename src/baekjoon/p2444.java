package baekjoon;

import java.util.*;

public class p2444 {
    //https://www.acmicpc.net/problem/2444
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<n; ++i) {
            for(int j=0; j<n-i-1; ++j) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<(i*2); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<n; ++i) {
            for(int j=0; j<i; ++j) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<(n-i-1)*2; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}