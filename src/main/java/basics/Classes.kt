package basics

interface Person {
    val name: String
    var age: Int

    val canBuyAlcohol: Boolean
        get() = age > 21

    // Says hello. Example: "Hello, I am Ben"
    fun sayHello()

    // Cheers another person: Example: "Hello Jordan, how are you?"
    fun cheer(person: Person)
}

class Businessman(override val name: String, override var age: Int): Person {

    override fun sayHello() {
        println("Hello, gentleman, my name is $name")
    }

    override fun cheer(person: Person) {
        println("Good morning, mr ${person.name}")
    }
}

class Student(override val name: String, override var age: Int): Person {

    override fun sayHello() {
        println("Hey, I am $name")
    }

    override fun cheer(person: Person) {
        println("Yo, ${person.name}")
    }
}

fun main(args: Array<String>) {
    val businessman: Person = Businessman("John", 25)
    val student: Person = Student("Ben", 20)

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