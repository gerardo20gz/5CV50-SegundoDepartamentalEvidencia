import Vehicle.Vehicle
import class1.Koopa
import class1.Vehiculo

class Hello {

}

fun main(){
    /*
    var nombre = "Gerardo";
    var edad = 20;
    var estatura = 1.73;
    //imprimir la variable a
    var a = 1025;
    var b = 8;
    var c = 4;
    c += b;
    print("HelloUPIICSA!!! ");
    print("Yo soy " + nombre+" mi edad es "+edad+" mi estatura es: "+estatura);
    print("El valor de la variable a es: "+a);
    //Imprimir con el println
    println("El valor de la variable b es: "+b);
    println("El valor de la variable c es: "+c);

    //
    val miVehiculo = Vehiculo();
    miVehiculo.color = "Verde"
    miVehiculo.maeca = "Ford"
    miVehiculo.modelo = "Focus"
    miVehiculo.placas = "REM-4123"

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encendedor()
    println("El coche esta prendido? ${miVehiculo.encendido}")


    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El coche esta prendido? ${miVehiculo.gasolina}")
    */
    val mario = Mario1();

    for (i in 0..5){
        if (mario.isAlive){
            mario.collision("Gommba")
            println("Te quedan ${mario.getLives()}")
        }
    }
/*
    val koopa = Koopa();
    koopa.collision("Weapon")

 */


    /*
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    viajeMonterrey.reserve(4)
    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
    viajeBajaMonterrey.reserve(4)



     */
    val vehicle = Vehicle();
}