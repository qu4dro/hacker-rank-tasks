package problem_solving.easy

import java.io.File

//You are in charge of the cake for a child's birthday.
//You have decided the cake will have one candle for each
//year of their total age. They will only be able to blow out
//the tallest of the candles. Count how many candles are tallest.

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = 0
    var cnt = 0
    for (i in candles.indices) {
        if (candles[i] > max) max = candles[i]
    }
    for (i in candles.indices) {
        if (candles[i] == max) cnt ++
    }

    return cnt
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}