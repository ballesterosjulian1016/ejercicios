package tema01

fun main (){
    val numeros = arrayListOf(1,2,3,4,5,6,7,8,9,10)
    val pares= numeros.filter { it % 2 == 0 }
     println("lista original: $numeros")
    println(" numeros pares: $pares")

}