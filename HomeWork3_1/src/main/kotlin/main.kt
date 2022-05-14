fun main() {
    agoToText(200)
}

// Создадим функция конвертирующую минуты в строки результата вывода на экран
fun resultMinute(minut: Int) {
    when (minut % 10) {
        1 -> println("$minut минуту назад")
        2, 3, 4 -> println("$minut минуты назад")
        else -> println("$minut минут назад")
    }
}

// Создадим функция конвертирующую часы в строки результата вывода на экран
fun resultHour(hour: Int) {
    when (hour % 10) {
        1 -> println("$hour час назад")
        2, 3, 4 -> println("$hour часа назад")
        else -> println("$hour часов назад")
    }
}

// Создадим функцию agoToText
fun agoToText (seconds: Int) {
    when{
        seconds <= 60 -> println("только что")
        seconds in 61..3600 -> resultMinute(seconds / 60)
        seconds in 3601..86400 -> resultHour(seconds / 3600)
        seconds in 86401..172800 -> println("сегодня")
        seconds in 172801..259200 -> println("вчера")
        else -> println("давно")
    }
}