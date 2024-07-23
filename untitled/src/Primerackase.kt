/**
 * Universidad del Valle de Guatemala
 * Anggie Quezada Molina 23643
 */

fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // Realizo una operación, yo elegí que se iban a multiplicar.
    // Si yo quisiera colocar otra operación, se copia el val pero se cambia el signo para x y y. O sea x + y , x-y , x/y.
    val multiplicacion = performOperation(7, 9) { x, y -> x * y }
    println("El resultado es: $multiplicacion")
}
