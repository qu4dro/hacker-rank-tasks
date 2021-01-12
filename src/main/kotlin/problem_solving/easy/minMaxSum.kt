package problem_solving.easy

import java.util.*

//Given five positive integers, find the minimum and maximum values that can be calculated
//by summing exactly four of the five integers.
//Then print the respective minimum and maximum values as a
//single line of two space-separated long integers.
// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>) {
    val sum = Array<Long>(arr.size) { 0 }
    var tmp: Long
    for (i in arr.indices) {
        tmp = 0
        for (j in arr.indices) {
            if (i == j) continue
            tmp += arr[j]
            sum[i] = tmp
        }
    }
    println("${sum.min()} ${sum.max()}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}