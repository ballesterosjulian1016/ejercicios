package tema01

 private fun calculadora(a: Double, b: Double, operacion: String): Double{
    return when (operacion.lowercase()){
        "suma"-> a + b
        "resta" -> a-b
        "multiplicacion" -> a * b
        "division" -> {
            require(b != 0.0){"no se puede dividir entre cero"}
            a /b
            }
        else -> throw IllegalArgumentException("operacion invalido")
        }
        }

fun main() {
    print("introduce el primer numero: ")
    val n1 = readln().toDoubleOrNull()
    print("introduce el segundo  numero: ")
    val n2 = readln().toDoubleOrNull()
    print("introduce la operacion: (suma, resta, multiplicacion o division): ")
    val operacion = readln().trim()

    if (n1 == null || n2 == null){
        println ("error numeros no validos ingreselos de nuevo")
        return
    }
    try {
        val resultado = calculadora(a= n1, n2, operacion = operacion)
        println("resultado = $resultado")
    }catch (error : IllegalArgumentException){
        println(error.message)
    }

}