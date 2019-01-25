package java

class KotlinPerson @JvmOverloads constructor(
        var name: String = "",
        var age: Int = -1
) {
    val isMature: Boolean
        get() = age > 18
}