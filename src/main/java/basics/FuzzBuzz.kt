package basics

import org.junit.Test
import kotlin.test.assertEquals

// fizzBuzz function that returns String that represents what should be said in the FizzBuzz game for each number between 1 and 100.
// We list all this numbers in new lines, but we replace some of them with:
// “Fizz” if number is divisible by 3
// “Buzz” if number is divisible by 5
// “FizzBuzz” if number is divisible both by 3 and 5 (by 15)
fun fizzBuzz(): String {
    var text = ""
    for(i in 1..100) {
        text += when {
            i % 15 == 0 -> "FizzBuzz"
            i % 5 == 0 -> "Buzz"
            i % 3 == 0 -> "Fizz"
            else -> i
        }
        if(i != 100) text += ", "
    }
    return text
}

// Few other solutions:

fun fizzBuzz2(): String {
    var all = ""
    for (i in 1..100) {
        var text = ""
        if (i % 3 == 0) text += "Fizz"
        if (i % 5 == 0) text += "Buzz"
        if(text.isEmpty()) text += i
        if(i != 100) text += ", "
        all += text
    }
    return all
}

// Functional solution:

fun fizzBuzz3(): String = (1..100)
        .map { numberToFizzBuzz(it) }
        .joinToString()


private fun numberToFizzBuzz(num: Int): String = when {
    num % 15 == 0 -> "FizzBuzz"
    num % 3 == 0 -> "Fizz"
    num % 5 == 0 -> "Buzz"
    else -> num.toString()
}

// Or even:

fun fizzBuzz4(): String = (1..100).joinToString(transform = ::numberToFizzBuzz)

class FizzBuzzTest {

    @Test
    fun fizzBuzzTest() {
        val solution = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz"
        assertEquals(solution, fizzBuzz())
    }
}