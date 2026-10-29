package tema01

fun main (){
    val nombres = arrayListOf<String>()
    while (true){
        print("introduce un nombre: (o 'salir' para terminar): ")
        val nombre = readln().trim()

        if(nombre.lowercase()=="salir")break
        nombres.add(nombre)

    }
    val mayusculas= nombres.map { it.uppercase() }
    println("nombres en mayusculas = $mayusculas")
}