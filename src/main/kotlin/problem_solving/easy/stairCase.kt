package problem_solving.easy

import java.util.*

fun staircase(n: Int) {
    var cnt = 1
    while (cnt <= n) {
        println(" ".repeat(n - cnt) + "#".repeat(cnt))
        cnt++
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}