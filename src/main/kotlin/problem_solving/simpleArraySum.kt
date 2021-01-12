package problem_solving

import java.util.*

//Given an array of integers, find the sum of its elements.

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val arCount = sc.nextLine().trim().toInt()
    val ar = sc.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = simpleArraySum(ar)

    println(result)
}

fun simpleArraySum(ar: Array<Int>): Int {
    var result = 0
    for (i in ar.indices) {
        result += ar[i]
    }

    return result
}