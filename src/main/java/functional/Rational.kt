package functional

import org.junit.Test
import kotlin.test.assertEquals

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

class RationalTests {
    @Test
    fun testIntExtension() {
        assertEquals(RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        assertEquals(RationalNumber(2, 3), Pair(2, 3).r())
    }
}