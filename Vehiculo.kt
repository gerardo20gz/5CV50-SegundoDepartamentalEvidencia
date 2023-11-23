package class1

class Vehiculo {
    var color = ""
    var maeca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false

    fun encendedor(){
        encendido = true
    }

    fun apagar(){
        encendido = false
    }

    fun recargar(litros:Float){
        gasolina += litros
    }

}