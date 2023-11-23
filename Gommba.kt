package class1

class Gommba(name: String, strength: Int) :
    Enemy("Gommba", 1){

        init {
            println("Iniciando subclase de $name")
        }
}