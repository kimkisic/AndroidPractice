package com.mrhi.hellokotlin

//주 생성자를 통해서 멤버변수 name, age에 곧바로 값이 대입되로록..
open class Person constructor(var name:String, var age:Int) {
    init {
        println("create Person instance")
    }

    open fun show(){
        println("name: $name  age: $age")
    }
}