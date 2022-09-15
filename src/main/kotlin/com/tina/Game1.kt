package com.tina

import java.util.*


fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("請輸入數字:")
        //number = scanner.nextInt()
        //可改成
        number = readLine()!!.toInt()
        if (number > secret) {
            println("lower")
        } else if (number < secret)
            println("higher")
        else {
            println("bingo!!!")
        }
    }
}
