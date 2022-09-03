package com.tina;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /*Random random = new Random();
        int secret = random.nextInt(10)+1;*/
        //上面兩行程式碼＝下面一行
        int secret = new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.println("請輸入數字：");
            number = scanner.nextInt();
            if(number>secret) {
                System.out.println("小一點");
            } else if (number<secret) {
                System.out.println("大一點");
            } else{
                System.out.println("bingo");
                break;
            }



        }

    }
}