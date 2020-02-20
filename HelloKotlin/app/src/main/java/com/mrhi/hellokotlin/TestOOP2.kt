package com.mrhi.hellokotlin

fun main(){

    //First를 상속한 Second객체 생성
    var s= Second()
    s.a= 10
    s.b= 20
    s.show() //오버라이드가 된 메소드가 호출

    //상속 마무리 연습 [Person <- Student <- AlbaStudent]
    var p= Person("sam", 20)
    p.show()
    println()

    val stu= Student("robin", 25, "android")
    stu.show()
    println()

    val alba= AlbaStudent("hong", 24, "kotlin", "pc manager")
    alba.show()
    println()


    val t= Teacher("Lee", 50, "mobile optimization")
    t.show()
    println()





}

//부모용 클래스 : 상속을 해주는 클래스는 반드시 open키워드가 있어야함]
open class First{
    var a:Int= 10

    //자식에게 오버라이드가 되게 하려면 이메소드 앞에 opne키워드가
    //있어야 함.
    open fun show(){
        println("a : $a")
    }
}

//First를 상속받는 클래스 [상속문법 - 클래스명 뒤에 :후에 부모클래스명() 작성 ]
class Second : First(){
    var b:Int= 20

    //상속받은 show()메소드를 override 하기!!
    //오버라이드 메소드는 반드시 override 키워드 추가
    override fun show(){
        //println("a : $a")
        super.show()
        println("b : $b")
        println()
    }
}


