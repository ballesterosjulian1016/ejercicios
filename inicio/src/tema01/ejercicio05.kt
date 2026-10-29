package tema01

fun main(){
    val ciudades = arrayListOf("Madrid", "Barcelona","Valencia","Sevilla","Bilbao")
    println("ciudades disponibles: $ciudades")
    print("introduce una ciudad para buscar")
    val ciudad = readln().trim()
    if (ciudades.contains(ciudad)){
        println("la ciudad $ciudad esta en la lista")

    }else{
        println("la ciudad $ciudad no esta en lista")
    }
}


