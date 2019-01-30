package functional

private fun repeat(times: Int, action: () -> Unit) {
    for(i in 1..times) action()
}

fun main(args: Array<String>) {
    repeat(5) { print("A") } // AAAAA
}