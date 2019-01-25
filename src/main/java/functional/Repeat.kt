fun repeat(times: Int, operation: ()->Unit) {
    for(i in 1..times) operation()
}