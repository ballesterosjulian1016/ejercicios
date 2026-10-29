package tema01

private fun celsiusAFahrenheit (celsius : Double) : Double = celsius * 9 / 5 + 32
private fun  fahrenheitACelsius ( fahrenheit : Double) : Double = (fahrenheit - 32) * 5/9

fun main(){
    print("Introduce la temperatura: ")
    val temperatura = readln().toDoubleOrNull()
    if (temperatura == null) {
        println("Temperatura no valida: ")
        return
    }
    print("Introduce la unidad: (C/F)")
    val unidad = readln().uppercase()

    if(unidad == "C"){
        println("$temperatura°C = ${celsiusAFahrenheit(temperatura)}ºF")
    }
    else if(unidad == "F"){
        println("$temperatura ºF = ${fahrenheitACelsius(temperatura)}ºC")

    }
    else{
        println("Unidad no valida")

    }

}