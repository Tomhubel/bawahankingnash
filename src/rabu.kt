fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("Faktorial dari $number adalah $result")
}
