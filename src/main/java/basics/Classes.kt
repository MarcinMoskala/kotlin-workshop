package basics

interface Person {
    val name: String
    val canBuyAlcohol: Boolean

    // Says hello. Example: "Hello, I am Ben"
    fun sayHello()

    // Cheers another person: Example: "Hello Jordan, how are you?"
    fun cheer(person: Person)
}

class Businessman(override val name: String, private val age: Int) : Person {

    override val canBuyAlcohol: Boolean
        get() = age > 18

    override fun sayHello() {
        println("Hello, my name is $name")
    }

    override fun cheer(person: Person) {
        println("Hello ${person.name}")
    }
}

class Student(override val name: String, private val age: Int) : Person {

    override val canBuyAlcohol: Boolean
        get() = age >= 18

    override fun sayHello() {
        println("Hi, I am $name")
    }

    override fun cheer(person: Person) {
        println("Hi ${person.name}")
    }
}

fun main(args: Array<String>) {
    val businessman: Person = Businessman("John", 25)
    val student: Person = Student("Jake", 17)

    businessman.sayHello()
    student.sayHello()

    businessman.cheer(student)
    student.cheer(businessman)

    fun sayIfCanBuyAlcohol(person: Person) {
        val modal = if(person.canBuyAlcohol) "can" else "can't"
        println("${person.name} $modal buy alcohol")
    }

    sayIfCanBuyAlcohol(businessman)
    sayIfCanBuyAlcohol(student)
}