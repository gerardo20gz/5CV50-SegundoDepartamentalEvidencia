package class1

class Koopa(name: String, strength: Int) : Enemy("Koopa", 2) {
    override fun collision(collier: String){
        super.collision(collider)
        println("Usando la collision de la clase Enemy")
    }
}