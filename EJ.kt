

class rectangulo(val base: Int, val altura: Int){


    init {
        require(base > 0){"La base debe de ser mayor a 0"}
        require(altura >0){"La altura debe de ser mayor a 0"}
    }


    fun calcularArea(): Int {
        return base * altura
    }


    fun calcularPerimetro(): Int {
        return 2 * (base + altura)
    }



    override fun toString(): String {
        val area = calcularArea()
        val perimetro = calcularPerimetro()
        return "El triángulo tiene un area de: ${area} y un perímetro de: ${perimetro}"
    }
}



fun main(){

    val operacion1 = rectangulo(12, 5)
    val operacion2 = rectangulo(3, 3)

    println(operacion1)
    println(operacion2)


}