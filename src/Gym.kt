package src

class Gym constructor(var owner: String, var numberOfMembers: Int){
    init {
        println("First initializer block.")
    }
    init {
        println("Second initializer block.")
    }

    fun printGym(){
        println("The owner of this gym is $owner and there are $numberOfMembers members of this gym.")
    }
}