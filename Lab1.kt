/* Лабораторна робота 1, Варіант 6
Маслова Віталія, І-221д
Завдання: Створіть локальну функцію в межах функції-розширення для колекцій, яка видаляє дублікати елементів*/

fun main() {
    fun <T> List<T>.deleteDuplicates(): MutableList<T> {
        val numlist = mutableListOf<T>()
        for (num in this) { //"this keyword inside the extension function refers the receiver object"
            if (!numlist.contains(num)) {
                numlist.add(num)
            }
        }
        return numlist
    }

    val list = listOf(1, 1, 2, 3, 4, 3, 5, 6, 6, 5, 1)
    val newlist = list.deleteDuplicates()
    println("Оригінальний список: $list")
    println("Новий список (без дублікатів): $newlist")
}
