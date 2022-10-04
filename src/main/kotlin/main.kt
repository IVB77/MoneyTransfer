fun main() {
    val amount: Int = 10000
    val minCommission: Int = 35
    val commission: Double = 0.75
    val commissionAmount: Int =
        if (amount * commission / 100 < 35) minCommission else (amount * commission / 100).toInt()
    println("Commission amount $commissionAmount")
}