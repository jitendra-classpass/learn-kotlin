package src

class User constructor(var firstName: String, var lastName: String) { // primary constructor

    constructor(firstName: String) : this(firstName, "Pakulski") {
        println("Constructor with single argument is called.")
    }

    constructor() : this("Steven", "Smith") {
        println("Constructor with zero argument called.")
    }

    fun printFullName() {
        println("Full Name: $firstName $lastName")
    }
}