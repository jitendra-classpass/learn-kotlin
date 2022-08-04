package src

class User constructor(var firstName: String, var lastName: String){ // primary constructor

    fun printFullName() {
        println("Full Name: $firstName $lastName")
    }
}