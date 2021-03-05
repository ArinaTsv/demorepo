fun main() {
    val a: Int = 9
    val message: String =
            if (a % 2 == 0) {
                "a is even"
            } else if ((a % 2 != 0) && (a % 5 == 0)) {
                "a is divisible by 5"
            } else {
                "a is not even and not divisible by 5"
            }

    println(message)

    fun isEvenWithWhenStatement(value: Int): String =

            when {
                value % 2 == 0 -> "a is even"
                (value % 2 != 0) && (value % 5 == 0) -> "a is divisible by 5"
                else -> "a is not event and not divisible"
            }

}
