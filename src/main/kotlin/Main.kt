package org.example

fun mostrarMsg(nome:String, sobrenome:String, cpf: Long, idade:Int){
    println("Bom dia, $nome $sobrenome, você tem $idade anos")

}

fun CalcIdade(AnoNasc:Int):Int {
    val idade = 2024 - AnoNasc
    return idade

}
fun main() {
    val idade = CalcIdade(2004)
    mostrarMsg("William", "Hayashi", 38034386839, idade)


}