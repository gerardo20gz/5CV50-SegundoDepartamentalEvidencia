package class1

open class Enemy(val name: String, val strength: Int): Any() {

    init {
        println("Iniciando subClase de $name")
    }

    protected var direction: String = "LEFT"

    protected fun changeDirection(){
        direction = if (direction=="RIGHT") "LEFT" else "RIGHT";
        println("$name va en una direccion $direction")
    }
    protected fun die(){
        println("$name ha Muerto")
    }
    open fun collision(collider: String ){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}