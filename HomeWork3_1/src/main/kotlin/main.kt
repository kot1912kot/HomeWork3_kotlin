fun main() {
    println(agoToText(15000))
}

// Создадим функция конвертирующую минуты в строки результата вывода на экран
fun resultMinute(minut: Int): String {
    val s = when (minut % 10) {
        1 -> "$minut минуту назад"
        2, 3, 4 -> "$minut минуты назад"
        else -> "$minut минут назад"
    }
    return s
}

// Создадим функция конвертирующую часы в строки результата вывода на экран
fun resultHour(hour: Int): String {
    val s = when (hour % 10) {
        1 -> "$hour час назад"
        2, 3, 4 -> "$hour часа назад"
        else -> "$hour часов назад"
    }
    return s
}

// Создадим функцию agoToText
fun agoToText (seconds: Int): String {
    val result = when {
        seconds <= 60 -> "только что"
        seconds in 61..3600 -> resultMinute(seconds / 60)
        seconds in 3601..86400 -> resultHour(seconds / 3600)
        seconds in 86401..172800 -> "сегодня"
        seconds in 172801..259200 -> "вчера"
        else -> "давно"
    }
    return result
}