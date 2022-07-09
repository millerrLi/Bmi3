package com.millerr.lib
fun main(){
    val p = Person()
    p.height = 1.7f
    p.weight = 99f
    println("你的體重為 ${p.getBmi()}")
}
class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello(){
        println("Hello Friend")
    }

    fun getBmi(): Float{
        val bmi = weight / (height * height)
        return bmi
    }
}