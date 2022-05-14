fun main() {
    commission("Visa",3000,200)
}

fun commission (typeCard: String = "Vk Pay", amountThisMounth: Int = 0, transferAmount: Int) {
    when {
        // рассмотрим варианты с оплатой Vk Pay
        typeCard === "Vk Pay" && transferAmount <= 15_000 && amountThisMounth <= 40_000 ->
            println("Комиссия не взымается")
        typeCard === "Vk Pay" && transferAmount > 15_000 ->
            println("Вы привысели максимальную сумму перевода за раз")
        typeCard === "Vk Pay" && amountThisMounth > 40_000 ->
            println("Вы привысели максимальную сумму перевода в месяц")
        // рассмотрим варианты с оплатой Mastercard и Maestro
        (typeCard ==="Mastercard" || typeCard === "Maestro") && (transferAmount in 300..75_000) && amountThisMounth <= 600_000 ->
            println("Комиссия не взымается")
        (typeCard === "Mastercard" || typeCard === "Maestro") && (transferAmount < 300 || transferAmount > 75_000) && amountThisMounth <= 600_000 ->
            println("Комиссия составила: ${(transferAmount*0.6 + 20)*100} копеек")
        typeCard === "Mastercard" || typeCard === "Maestro" && transferAmount >= 150_000 && amountThisMounth <= 600_000 ->
            println("Вы привысели максимальную сумму перевода за раз")
        typeCard === "Mastercard" || typeCard === "Maestro" && amountThisMounth > 600_000 ->
            println("Вы привысели максимальную сумму перевода в месяц")
        // рассмотрим варианты оплаты Visa и Мир\
        (typeCard === "Visa" || typeCard === "Мир") && transferAmount < 47 && amountThisMounth <= 600_000 ->
            println("Комиссия за перевод составила: 3500 копеек")
        (typeCard === "Visa" || typeCard === "Мир") && transferAmount in 47..150_000 && amountThisMounth <= 600_000 ->
            println("Комиссия составила: ${transferAmount*0.75*100} копеек")
        (typeCard === "Visa" || typeCard === "Мир") && transferAmount > 150_000 && amountThisMounth <= 600_000 ->
            println("Вы привысели максимальную сумму перевода за раз")
        (typeCard === "Visa" || typeCard === "Мир") && transferAmount <= 150_000 && amountThisMounth > 600_000 ->
            println("Вы привысели максимальную сумму перевода в месяц")
    }
}