package com.tina;

import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        //int number = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1 ; i< 6 ; i ++) {
            System.out.println("這是第"+i+"次輸入("+i+"/5):");
            int number = scanner.nextInt();
            if (number != secret) {
                System.out.println("錯誤");
            }else {
                System.out.println("bingo!");
                break;
            }
        }
        System.out.println("遊戲結束");
    }
}
