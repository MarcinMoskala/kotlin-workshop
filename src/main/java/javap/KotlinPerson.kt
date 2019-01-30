package javap

class KotlinPerson(
        var name: String = "",
        var age: Int = -1
) {
    val isMature: Boolean
        get() = age > 18

    internal fun isAdult() = isMature
}