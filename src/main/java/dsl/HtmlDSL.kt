package dsl

open class HtmlDsl

fun createTable(): HtmlDsl = table {
    tr {
        for (i in 1..2) {
            td {
                +"This is row $i"
            }
        }
    }
}

fun table(init: TABLE.() -> Unit): HtmlDsl {
    return TABLE().apply(init)
}

class TABLE: HtmlDsl() {
    private val trs = mutableListOf<TR>()

    fun tr(init: TR.() -> Unit) {
        trs += TR().apply(init)
    }

    override fun toString(): String = "<table>${trs.joinToString(separator = "")}<\\table>"
}

class TR {
    private val tds = mutableListOf<TD>()

    fun td(init: TD.() -> Unit) {
        tds += TD().apply(init)
    }

    override fun toString(): String = "<tr>${tds.joinToString(separator = "")}<\\tr>"
}

class TD {
    private val texts = mutableListOf<String>()

    operator fun String.unaryPlus() {
        texts += this
    }

    override fun toString(): String = "<td>${texts.joinToString(separator = "")}<\\td>"
}

fun main(args: Array<String>) {
    println(createTable()) //<table><tr><td>This is row 1</td><td>This is row 2</td></tr></table>
}
