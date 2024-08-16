package org.example

class Casa{
    //Propriedades e atributos

    var cor:String = ""

    //Métodos
    fun detalhesCasa(){
        println("COR: ${cor}")
    }
    fun abriJanelas(){
        println("Abrindo Janelas")
    }
    fun abriPortas(){
        println("Abrindo Portas")
    }
    fun abrirCasa(){
        this.abriPortas()
        this.abriJanelas()
    }

}

fun main(){
    var casaPresidente = Casa()
    casaPresidente.cor = "Branco"
    casaPresidente.detalhesCasa()
    casaPresidente.abrirCasa()
}