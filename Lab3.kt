/* Лабораторна робота 3, Варіант 19
Маслова Віталія, І-221д
Завдання: Створіть функцію, яка приймає список чисел і повертає список чисел,
які є добутком трьох інших чисел зі списку.*/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-not-null.html


//Функція flatMap спочатку перетворює кожен елемент в колекцію відповідно до функції у аргументі,
// а потім збирає декілька списків в один
fun calculateProduct(nums: List<Int>): List<Int> {
    return nums.flatMap { x ->
        nums.flatMap { y ->
            nums.mapNotNull { z ->
                if (x != y && y != z && x != z) x * y * z else null //перевірка що 3 різних числа та обчисл. добутка
            }
        }
    }
}

//узято з Лаб1, для видалення дублікатів
fun <T> List<T>.deleteDuplicates(): List<T> {
    val numlist = mutableListOf<T>()
    for (num in this) {
        if (!numlist.contains(num)) {
            numlist.add(num)
        }
    }
    return numlist
}


fun main() {
    val list = listOf(1, 2, 6, 3, 5)
    //val result = calculateProduct(list).deleteDuplicates()
    println("Числа, які є добутком трьох інших чисел зі списку: ${calculateProduct(list).deleteDuplicates()}")
}
