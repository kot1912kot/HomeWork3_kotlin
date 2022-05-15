fun main() {
    println(commission("Maestro",3000,76000))
}

fun commission (typeCard: String = "Vk Pay", amountThisMounth: Int = 0, transferAmount: Int): Int {
    when (typeCard){
        // рассмотрим варианты с оплатой Vk Pay
        "Mastercard", "Maestro" -> if (transferAmount <= 75_000 && amountThisMounth <= 600_000)  return 0
            else return ((0.06 * transferAmount + 20)*100).toInt()
        "Vk Pay" -> return 0
        "Visa", "Мир" -> if (transferAmount in 47..150_000 && amountThisMounth <= 600_000) return ((0.075 * transferAmount)*100).toInt()
            else return (35*100)
    }
    return 0
}