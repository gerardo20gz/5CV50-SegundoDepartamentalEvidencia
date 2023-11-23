import java.util.*
import kotlin.concurrent.schedule
class Mario1(var  vidas: Int = 3){

    init{
        println("It's a me! Mario")
    }
    private var state = "small"
        set(value){
            val before = field
            field = value
            println("tu estado ahora es $field")
            if (value == "Star"){
                Timer("SettingUp", false).schedule(100000){
                    field  =  before
                    println("tu estado ahora es $field")
                }
            }
            field = value
        }

    private var lives = 5
        set(value){
           if(field == 1){
               field = 0
               gameOver()
           }
           else if(field==0){
                println("Necesitas volver a Jugar");
            }
            else{
                field = value
            }

        }
    val isAlive: Boolean
        get(){
            return lives>=1
        }
   /* private fun die(){
        lives--
        println("Ha perdido una vida")
    }
*/
     public fun collision(collisionObj: String){
        when(collisionObj){
            "Gommba"-> lives--
            "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            "Star" -> state = "Star"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }
    fun getLives(): String{
        return "$lives vidas"
    }

    private fun gameOver(){
        println("JUEGO TERMINADO")
    }

}