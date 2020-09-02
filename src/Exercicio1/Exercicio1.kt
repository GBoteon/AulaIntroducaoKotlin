package Exercicio1

fun main(){
    maiorNum(4,9,1)
}

fun maiorNum(n1: Int, n2: Int, n3: Int){
    if (n1 > n2 && n1 > n3){
        println(n1)
    } else if (n2 > n1 && n2 > n3){
        println(n2)
    } else {
        println(n3)
    }
}