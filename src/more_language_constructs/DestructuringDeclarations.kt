package more_language_constructs

fun main() {
    val person = Person("Haseeb", 23)
    val (name, age) = person
    println("$name is $age years old")

    // Example: Returning Three Values from a Function
    val (color, speed, company) = getCarInfo()
    println("$color color $company is $speed fast")

    // Example: Destructuring Declarations and Maps

    // Underscore for unused variables (since 1.1)
    val (_, _, companyName) = getCarInfo()
    println("The company name is $companyName")

}

data class Person(var name: String, var age: Int)

// Example: Returning Two Values from a Function
data class Car(var color: String, var speed: Int, var company: String)
fun getCarInfo(): Car = Car("Red", 100, "BMW")
