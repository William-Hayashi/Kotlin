package org.example

class Casas{
    //Propriedades e atributos
    var cor:String
    var vagasGaragem:Int

    constructor(cor:String, vagasGaragem:Int) {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }



    fun detalhesCasa(){
        println("COR: ${cor} - Vagas: ${vagasGaragem}")
    }
}

fun main(){
    var casaPresidente = Casas("Branco", 5)
    casaPresidente.detalhesCasa()
}