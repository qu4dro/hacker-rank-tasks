package problem_solving

import java.util.*

//In this challenge, you are required to calculate and print the sum of the
//elements in an array, keeping in mind that some of those integers may be quite large.

fun aVeryBigSum(ar: Array<Long>) = ar.sumByDouble { it.toDouble() }.toLong()


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}