fun main() {
    val amount = 1000
    val minCommission = 35
    val commission = 0.75

    var calcCommPercent = amount * commission

    var result = if (calcCommPercent > minCommission) calcCommPercent else minCommission
    println("Ваша комиссия за перевод составляет $result руб.")
}