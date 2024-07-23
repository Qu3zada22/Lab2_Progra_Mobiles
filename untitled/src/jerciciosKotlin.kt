/**
 * Universidad de Valle de Guatemala
 * Anggie Quezada Molina 23643
 */

fun calcularPromedio(numeros: List<Double>): Double {
    if (numeros.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacía")
    }

    val suma = numeros.reduce { acc, num -> acc + num }
    return suma / numeros.size
}

fun filtrarImpares(numeros: List<Int>): List<Int> {
    return numeros.filter { it % 2 != 0 }
}

fun isPalindrome(cadena: String): Boolean {
    val sanitized = cadena.replace("\\s".toRegex(), "").lowercase()
    return sanitized == sanitized.reversed()
}

fun agregarSaludo(nombres: List<String>): List<String> {
    return nombres.map { "¡Hola, $it!" }
}

fun main() {
    // Calcular promedio, o sea es el ejercicio 1
    val numeros = listOf(7.0, 5.0, 3.0, 2.0, 6.0)
    val promedio = calcularPromedio(numeros)
    println("El promedio es: $promedio")

    // Filtrar números impares, o sea es el ejercicio 2
    val enteros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val impares = filtrarImpares(enteros)
    println("Números impares: $impares")

    // Verificar si una cadena es un palíndromo, o sea es el ejercicio 3
    val cadena = "A man a plan a canal Panama"
    val esPalindromo = isPalindrome(cadena)
    println("¿'$cadena' es un palíndromo? $esPalindromo")

    // Agregar saludo a los nombres, o sea es el ejercicio 4
    val nombres = listOf("Alicia", "Anggie", "Luiss")
    val saludos = agregarSaludo(nombres)
    saludos.forEach { println(it) }
}
