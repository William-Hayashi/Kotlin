package org.example

open class Animal {
    var cor: String = ""
    var idade: Int = 0
    var peso: Double = 0.00


    open fun dormir() {
        println("Dormindo...")
    }
}

class Cachorro : Animal() {
    var raca:String = ""

    override fun dormir(){
        super.dormir()
        println("Dormindo como um cachorro...")
    }
    fun latir(){
        println("Latindo...")
    }
}


fun main(){
    var cachorro_golden = Cachorro()
    cachorro_golden.cor = "Dourado escuro"
    cachorro_golden.peso = 6.600
    cachorro_golden.idade = 2
    cachorro_golden.raca = "Golden"
    cachorro_golden.dormir()

}