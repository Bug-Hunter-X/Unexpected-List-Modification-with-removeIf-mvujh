fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList) 
    println(list)
}