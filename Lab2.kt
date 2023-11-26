/* Лабораторна робота 2, Варіант 19
Маслова Віталія, І-221д
Завдання: Розробити клас даних "Спеціалізація" з полями: назва, опис, кількість студентів.
Додати можливість порівнювати спеціалізації за кількістю студентів.*/

// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/
class Specialization(val name: String, val description: String, var samount: Int) : Comparable<Specialization> {
    /* "other - the second file involved in the operation, if any"
    compareTo повертає нуль, якщо об’єкт дорівнює other, від’ємне число якщо менший other,
    додатне число якщо більший за other */
    override fun compareTo(other: Specialization): Int {
        return this.samount.compareTo(other.samount)
    }
}

fun main() {
    val spec1 = Specialization("Фізика", "Вивчають фізику", 56)
    val spec2 = Specialization("Хімія", "30 днів вчать таблицю Менделєєва", 73)

    val topSpec = if (spec1 > spec2) {
        spec1
    } else {
        spec2
    }

    println("Назва спеціалізації: ${spec1.name}, Опис: ${spec1.description}, Кількість студентів: ${spec1.samount}")
    println("Назва спеціалізації: ${spec2.name}, Опис: ${spec2.description}, Кількість студентів: ${spec2.samount}")
    println("Спеціалізація з найбільшою кількістю студентів: ${topSpec.name}")
}
