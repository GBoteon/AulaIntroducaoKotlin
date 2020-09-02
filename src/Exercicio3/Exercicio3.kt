package Exercicio3

fun main(){
    print(parImpar(4))
}
fun parImpar(n1: Int): Boolean{
    var x = n1%2
    return x == 0
}