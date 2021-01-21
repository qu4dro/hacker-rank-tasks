package problem_solving.easy

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the superReducedString function below.
fun superReducedString(s: String): String {
    var newS = s

    while (true) {
        val length = newS.length
        newS = newS.replace(("(.)\\1").toRegex(), "")
        if (length == newS.length) break

    }
    return if (newS.isEmpty()) "Empty String" else newS

}


fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}
