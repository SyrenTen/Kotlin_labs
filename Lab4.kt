/* Лабораторна робота 4, Варіант 19
Маслова Віталія, І-221д
Завдання: Реалізуйте клас "Повідомлення", який має тему (String) та текст (String?).
Напишіть функцію, яка виводить інформацію про повідомлення, ігноруючи null значення. */

//Знак питання можна додати після будь-якого типу, щоб вказати, що змінні цього типу можуть зберігати значення null
class Message(val topic: String, val text: String?) {
    fun showinfo(){
        println("Тема повідомлення: $topic")
        println("Інформація: $text")
    }
}

fun main(){
    val mes1 = Message("Фізика", "Яке домашнє завдання?")
    val mes2 = Message("Книжка", null)

    mes1.showinfo()
    mes2.showinfo()
}
