package problem_solving.easy

import java.util.*

//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
//Print the decimal value of each fraction on a new line with  places after the decimal.

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>, n: Int) {

    var positiveProportion = 0.0
    var negativeProportion = 0.0
    var zeroProportions = 0.0
    val proportionPart = 1.0 / n

    for (elem in arr) {
        when {
            elem > 0 -> positiveProportion += proportionPart
            elem < 0 -> negativeProportion += proportionPart
            else -> zeroProportions += proportionPart
        }
    }

    println("${"%.6f".format(positiveProportion)} \n${"%.6f".format(negativeProportion)} \n${"%.6f".format(zeroProportions)}")

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr, n)
}
