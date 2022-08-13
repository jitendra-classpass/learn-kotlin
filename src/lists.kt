package src

fun main() {
    val names: MutableList<String> = mutableListOf<String>("Gonzalez", "Prada").also {
        it.add("Donn")
        it.add("Jenny")
        it.add("Robert")
        it.add("Neal")
        it.add("Peter")
    }
    println(names)

    for (name:String in names) println(name)
}