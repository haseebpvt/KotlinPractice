package classes_and_objects

// https://kotlinlang.org/docs/reference/data-classes.html

fun main() {
    // Simple data class
    data class User(val name: String, val age: Int)

    // The below line doesn't work because the primary constructor
    // only have one property
    // var (name, age) = Person2("Kotman")

    // Data class with default values
    data class Person(val name: String = "No Name", val age: Int = 0)

    // Properties Declared in the Class Body
    // Compiler only uses primary constructor parameters
    // for automatically generated functions
    data class Person2(val name: String) {
        var age: Int = 0
    }

    // The below print will print true because compiler only uses
    // uses primary constructor parameters for automatically
    // generated functions
    val person1 = Person2("Kotman")
    val person2 = Person2("Kotman")
    person1.age = 1
    person2.age = 2
    println("person1 == person2 ${person1.equals(person2)}")

    // Using of copy
    val jack = User("Jack", 30)
    println(jack)
    val oldJack = jack.copy(age = 40)
    println(oldJack)

    // Destructuring declarations
    data class Car(val speed: Int, val company: String)
    val (speed, company) = Car(20, "Kotcar")
    print("$company, $speed kmph speed")
}