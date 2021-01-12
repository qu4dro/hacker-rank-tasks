package problem_solving

import java.util.*

//Complete the function solveMeFirst to compute the sum of two integers.

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}

fun solveMeFirst(num1: Int, num2: Int) = num1 + num2