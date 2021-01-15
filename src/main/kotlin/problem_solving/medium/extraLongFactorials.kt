package problem_solving.medium

import java.math.BigInteger
import java.util.*


// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): BigInteger {
    if (n == 1) return BigInteger.valueOf(n.toLong())
    return BigInteger.valueOf(n.toLong()) * (extraLongFactorials(n - 1))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    println(extraLongFactorials(n))
}