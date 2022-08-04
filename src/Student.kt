package src

class Student constructor(var firstName: String, var lastName: String, private var isAbove18: Boolean) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
        if (isAbove18)
            println("Hey $firstName! you can cast your vote.")
        else
            println("Hey $firstName! you ain't eligible to cast your vote.")
    }

    constructor(firstName: String) : this(firstName, "Unknown") {
        println("$firstName $lastName")
    }

    constructor() : this("Unknown")

    fun printFullName() {
        println("$firstName $lastName")
        if (isAbove18) println("You can cast your vote.")
    }
}