package problem_solving.easy

import java.text.SimpleDateFormat
import java.util.*

/* TODO:
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
*/

fun timeConversion(s: String): String {
    val dateIn = SimpleDateFormat("hh:mm:ssaa")
    val dateOut = SimpleDateFormat("HH:mm:ss")
    return dateOut.format(dateIn.parse(s))

}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}



