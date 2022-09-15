package com.tina

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..5){
        println("請輸入數字:(${i}/5)")
        var number = scanner.nextInt()
        println("這是第${i}次輸入:$number")
        if (number!= secret) {
            println("錯誤")
        }else{
            println("Bingo")
            break
        }

    }

}

