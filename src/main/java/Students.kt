class Student(val name: String, val isPassing: Boolean, val grades: List<Int>)

fun printPassingNames(students: List<Student>) {
    students.filter { it.isPassing }
            .forEach { print(it.name) }

    students.joinToString()
}