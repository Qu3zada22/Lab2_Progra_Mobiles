/**
 * Universidad del Valle de Guatemala
 * Anggie Quezada Molina 23643
 */

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapPersonToStudent(person: Person, studentId: String): Student {
    return Student(name = person.name, age = person.age, gender = person.gender, studentId = studentId)
}

fun main() {
    // Crear una lista de objetos Person
    val personas = listOf(
        Person(name = "Anggie", age = 20, gender = "F"),
        Person(name = "Iris", age = 19, gender = "F"),
        Person(name = "Jonathan", age = 25, gender = "M")
    )

    // Crear una lista de studentIds correspondientes para cada uno de las personas
    val studentIds = listOf("A23643", "A23965", "A23837")

    // Mapear cada Person a Student y almacenar en una nueva lista
    val estudiantes = personas.mapIndexed { index, person ->
        mapPersonToStudent(person, studentIds[index])
    }

    // Imprimir la información de cada Student en el formato especificado
    estudiantes.forEach { student ->
        println("El Estudiante ${student.name} tiene ${student.age} años")
    }
}
