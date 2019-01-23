import kotlin.test.assertEquals

sealed class Expression
class Plus(val e1: Expression, val e2: Expression) : Expression()
class Times(val e1: Expression, val e2: Expression) : Expression()
class Const(val value: Int) : Expression()

fun eval(e: Expression): Int = when (e) {
    is Plus -> eval(e.e1) + eval(e.e2)
    is Times -> eval(e.e1) * eval(e.e2)
    is Const -> e.value
}

fun main(args: Array<String>) {
    val expression = Plus(Times(Const(1), Const(2)), Times(Const(3), Const(4)))
    assertEquals(14, eval(expression))
}