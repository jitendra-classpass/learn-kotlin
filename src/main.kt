package src

fun main() {
    println("Hello Kotlin")

    var Donn = User("Donn", "Felker")
    Donn.printFullName()

    var jane = User()
    jane.firstName = "Jane"; jane.lastName = "Doe" // this will override the default arguments.
    jane.printFullName()

    var stevenSmith = User()
    stevenSmith.printFullName()

    var bob = User("Bob")
    bob.printFullName()
}