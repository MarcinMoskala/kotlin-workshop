package basics

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

interface Person {
    val name: String
    val age: Int

    // Always true when age >= 21
    val canBuyAlcohol: Boolean

    fun helloText(): String

    fun cheerText(person: Person): String
}

// TODO: Implement here class Businessman that implements Person
// Pass name and age as primary constructor arguments
// Businessman is very polite
// he says hello by "Good morning"
// he cheers another person by "Hello, my name is {businessman name}, nice to see you {another person name}"

// TODO: Implement here class Student that implements Person
// Pass name and age as primary constructor arguments
// Student is chilled out
// he says hello by "Hi"
// he cheers another person by "Hey {another person name}, I am {students name}"

class PersonTest {

//    @Test
//    fun businessmanImplementsPerson() {
//        Assert.assertTrue("Businessman needs to be a person", Businessman("AAA", 30) is Person)
//    }
//
//    @Test
//    fun studentImplementsPerson() {
//        Assert.assertTrue("Student needs to be a person", Student("AAA", 30) is Person)
//    }
//
//    @Test
//    fun personCanBuyAlcoholIfOver21() {
//        Assert.assertTrue("Adult businessman can buy alcohol", Businessman("AAA", 30).canBuyAlcohol)
//        Assert.assertTrue("Adult businessman can buy alcohol", Businessman("AAA", 21).canBuyAlcohol)
//        Assert.assertTrue("Young businessman can' buy alcohol", !Businessman("AAA", 19).canBuyAlcohol)
//        Assert.assertTrue("Young businessman can' buy alcohol", !Businessman("AAA", 17).canBuyAlcohol)
//        Assert.assertTrue("Adult student can buy alcohol", Student("AAA", 30).canBuyAlcohol)
//        Assert.assertTrue("Adult student can buy alcohol", Student("AAA", 21).canBuyAlcohol)
//        Assert.assertTrue("Young student can' buy alcohol", !Student("AAA", 19).canBuyAlcohol)
//        Assert.assertTrue("Young student can' buy alcohol", !Student("AAA", 17).canBuyAlcohol)
//    }
//
//    @Test
//    fun testBusinessmanHelloText() {
//        Assert.assertEquals("Good morning", Businessman("AAA", 30).helloText())
//    }
//
//    @Test
//    fun testStudentHelloText() {
//        Assert.assertEquals("Hi", Student("AAA", 30).helloText())
//    }
//
//    @Test
//    fun testStudentGreetText() {
//        val name1 = "Some name"
//        val name2 = "Another name"
//        val student = Student(name1, 12)
//        val businessman = Businessman(name2, 12)
//        Assert.assertEquals("Hey $name2, I am $name1", Student(name1, 30).cheerText(businessman))
//        Assert.assertEquals("Hey $name1, I am $name2", Student(name2, 30).cheerText(student))
//    }
//
//    @Test
//    fun testBusinessmanGreetText() {
//        val name1 = "Some name"
//        val name2 = "Another name"
//        val student = Student(name1, 12)
//        val businessman = Businessman(name2, 12)
//        Assert.assertEquals("Hello, my name is $name1, nice to see you $name2", Businessman(name1, 30).cheerText(businessman))
//        Assert.assertEquals("Hello, my name is $name2, nice to see you $name1", Businessman(name2, 30).cheerText(student))
//    }
}