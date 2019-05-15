package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] arr;
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap row");
        row = scanner.nextInt();
        System.out.println("Nhap column");
        column = scanner.nextInt();
        arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri o vi tri " + (i + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int vtcolumn;
        int sum=0;
        System.out.println("Nhap vao vi tri cot muon tinh tong");
        vtcolumn = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==vtcolumn){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tong cua cot "+vtcolumn+" La : "+sum);
    }
}
