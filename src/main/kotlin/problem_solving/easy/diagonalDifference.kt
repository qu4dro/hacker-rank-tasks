package problem_solving.easy

import kotlin.math.abs

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

fun diagonalDifference(arr: Array<Array<Int>>, n: Int): Int {
    var sumFirst = 0
    var sumSecond = 0
    for (i in 0 until n) {
        sumSecond += arr[i][n - i - 1]
    }
    for (i in 0 until n) {
        sumFirst += arr[i][i]
    }
    return abs(sumFirst - sumSecond).toInt()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr, n)

    println(result)
}
