package com.mrhi.hellokotlin

// 코틀린언어 기초문법 [ 코틀린 연습 사이트 : https://try.kotlinlang.org ]

//문법적 주요 특징!!
// A. 문장을 끝을 나타내는 ; 을 사용하지 않는다. 써도 됨. 즉, 옵션임
// B. 변수를 만들때 자료형을 사용하지 않고 var 키워드를 사용함. 단, 자료형은 존재함. 자동형변환 안됨.
// C. 코틀린은 "함수형언어"다. 쉽게말하면.. 함수를 객체처럼 변수에 저장하고 파라미터로 넘겨주는 등의 작업이 가능함.[객체지향프로그래밍 언어가 아님!]

//1. 프로그램의 시작함수인 main()함수가 반드시 있어야 함.
//2. 함수를 정의할 때 리턴타입위치에 'fun'키워드(function의 약자) 사용
fun main(){
    //3. 화면출력 : print(), println()함수
    println("Hello Kotlin")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5+3)
    // ;이 없기에 한줄에 2개의 명령을 사용하면 ERROR
    //println(10)println(10)//ERROR

    //4. 자료형과 변수
    //4.1 기본자료형 : Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any [ 코틀린은 모든 자료형이 참조형 자료형임..즉, 모든 변수가 객체임]
    // -Boolean, String, Any, Char은 Number Type이 아님!!

    //4.2 변수선언 문법 [ var키워드 사용]
    //var a // ERROR : ;이 없어서 변수만들때 값을 초기화 하지 않으면 에러!!
    var a= 10
    var b= 10.5
    var c= 3.14f
    var d= true
    var e= 'A'
    var f="Hello"
    //주의!! 변수선언시에 자료형 표기가 없지만 값을 대입할 때 자료형이 추정되기에 값이 대입될 때 변수의 자료형이 결정 됨.
    //변수이므로 값의 변경 가능함.
    a=20
    b=20.5
    println(a)
    println(b)
    println()

    //자료형이 다른 값을 넣으면 에러!!
    //a= 3.14 //ERROR
    //b= 50 //ERROR [ 자동형변환 안됨 ]

    //명시적 형변환하는 방법
    //a= (Int)3.14  //이런문법 없음
    a= 3.14.toInt()
    b= 50.toDouble()
    println(a)
    println(b)
    println()

    //자료형을 명시적으로 표기하면서 변수 선언하기
    var a2: Int = 100
    var b2: Double = 3.14
    var c2: Boolean //명시적으로 자료형을 표기하면 변수선언할 때 초기화 안해도 됨.
    println(a2)
    println(b2)
    //println(c2)//ERROR

    //정수값 표기의 특이한 점[실행활할 때 숫자의 3자리마라 ,구분 하듯이...]
    var a3= 5_000_000

    //** 화면 출력의 format 만들기
    println("Hello" + "Kotlin") //문자열 결합

    //Number타입과 String의 자동형변환이 안됨
    //println(10 + "Hello") //ERROR
    //위의 작업을 하고 싶다면..
    println( 10.toString() + "Hello")

    //특이한 점! String을 먼저 작성하면 형변환됨
    println("Hello"+ 10)

    //2개의 변수값을 덧셈하여 출력하기
    var num1= 10
    var num2= 30
    //println( num1 +" + " + num2 + " = " + (num1+num2) )//Java에서는 이렇게..
    println("" + num1 +" + " + num2 + " = " + (num1+num2) )
    println( num1.toString() +" + " + num2.toString() + " = " + (num1+num2) )

    //위 2방법모두 실수의 여지가 많음...
    println( " $num1 + $num2 = ${num1+num2} " )
    //이렇게 $변수명을 사용하는 것을 [문자열 템플릿]이라고 부름

    //즉,,
    var name = "sam"
    var age= 20
    println("이름 : $name \n나이 : $age")

    //Any타입 [Java의 Object클래스와 비슷]
    var v: Any
    v= 10
    println(v)

    v= 3.14
    println(v)

    v= "Hello"
    println(v)
    println()

    //변수에 값 대입할 때 체크!!
    // null값 대입에 관하여.....
    var n= null
    println(n)

    // 자료형을 명시하면 기본적으로 null을 저장할 수 없음.
    //var n2: Int= null //error
    //var s: String= null //error

    //null값을 가질 수있는 변수라고 표시할 수 있음.
    var n3: Int?= null
    var s2: String?= null
    println(n3)
    println(s2)
    println()

    //4.3 상수 만들기!! [val키워드 :value 약자]
    val m=10
    //m=20 //error

    //자료형이 명시되어 있으면 다음줄에 값 대입 가능
    val m2: Int
    m2=100
    //m2=200 //error



    //5. 연산자의 특이한 점.
    //숫자타입들간의 연산은 자동형변환 됨
    println(10+3.14)

    //println(10+true) //error
    //println(10+'A')  //error

    //자료형을 체크해주는 연산자 is
    var n4= 10
    if( n4 is Int){
        println("n4변수는 Int형입니다.")
    }

    var s3: String= "Hello"
    if( s3 is String) println("s3는 String변수")
    if ( s3 is String?) println("s3는 String변수")

    // !is 도 있음.
    if( s3 !is String) println("String타입이 아닙니다.")

    // 다른 자료형은 is연산자로 체크할 수 없음
    //if( n4 is String ) {} //ERROR

    // is연산자는 Any타입에 대한 식별로 사용됨
    var obj: Any

    obj=10.5
    if( obj is Int) println(" ${obj}는 Int입니다.")
    if( obj is Double) println(" ${obj}는 Double입니다.")

    // Java의  instanceof연산자와 비슷하게 사용 가능함

    class Person{
        //코틀린은 멤버변수를 property[속성] 라고 부름
        var name="sam"
        var age:Int= 20
    }

    //Person클래스의 객체를 생성!!
    //Person p= new Person(); //java에서는....
    var p= Person() //코틀린에서의 객체 생성 [new키워드 없음]
    if( p is Person){
        println(p.name +"   "+ p.age)
    }

    //Any타입에 적용하는 경우가 많음
    obj= Person()
    if( obj is Person){
        println("이름: ${p.name} \n나이: ${p.age}")
    }


    //문자열 비교에 == 연산사 사용 가능[equals()와 같은 결과]
    var s4= "Hello"
    var s5= "Hello"
    if( s4 == s5 ) println("aaaa")
    if( s4.equals(s5) ) println("bbbb")




    //6. 제어문의 특이한 점!! [많이 다름!!]

    //6.1 if문과 삼항연산자의 결합
    //var str = (10>5)? "Hello" : "Nice" //이런 문법 없음
    var str= if(10>5) "Hello" else "Nice"
    println(str)

    //혹시 if나 else문에 여러줄의 코드가 있다면..
    //마지막 작성값이 변수에 대입됨
    str= if(10<5){
        "zzz"
        "aaaa"
    }else{
        "qqqq"
        println("ggggg")
        "bbbb"
    }
    println(str)
    //이런 특징때문에 코틀린에서는 if문을 제어문이라고
    //하지 않고 'if표현식' 이라고 부름
    println()


    //6.2 switch문법이 없음!!!
    //대신 when 이라는 문법이 존재함
    var h:Any? = null

    //switch(h){} //이런 문법이 없음

    h=10
    when(h){
        10-> println("aaa")
        20-> println("bbb")
        //자료형이 달라도 됨
        "Hello"-> println("Hello")
        true-> println("ccc")

        //switch의 default같은 역할
        else->{
            println("ddd")
            println("END")
        }
    }

    //when을 특정 범위로 제어할 수도 있음
    h= 85
    when(h){
        in 90..100 -> println("A학점입니다.")
        in 80 until 90 -> println("B학점입니다.")
        in 70 until 80 -> println("C학점입니다.")
        in 60 until 70 -> println("D학점입니다.")
        else -> println("E학점입니다.")
    }
    println()

    //when을 수식으로 제어할 수도 있음
    h= 85
    when(h){
        80+5 -> println("aaaa")
        else -> println("else")
    }
    println()

    h=85
    when{ //when옆에 ()가 없음!!!
        h>=90 && h<=100 -> println("A학점입니다.")
        h>=80 -> println("B학점입니다.")
        h>=70 -> println("C학점입니다.")
        h>=60 -> println("D학점입니다.")
        else -> println("F학점입니다.")
    }
    println()

    //when도 if문처럼 표현식이라서 변수에 저장 가능
    h=20
    var result= when(h){
        10->"Hello"
        20->"Nice"
        else->"BAD"
    }
    println(result)

    //when에 is키워드 사용도 가능!!
    when(h){
        is Int -> println("Int타입")
        is String -> println("String타입")
        else -> println("ELSE")
    }
    println()


    //6.3 반복문..중...for문이 완전 다름!!!
    //for(var i=0; i<10; i++){} //ERROR 이런 문법 없음

    //foreach문과 비슷한 문법만 있음
    for( i in 0..5){ // for문의 지역변수 i에 var키워드 사용불가
        println(i)
    }
    println()

    for( a in 0..5){ //지역변수이므로 위에서 사용한 변수명사용 가능함
        println(a)
    }
    println()

    //마지막 숫자를 빼고 반복하고자 한다면
    for( i in 3 until 10){
        println(i)
    }
    println()

    // 2씩 증가하고 싶다면..
    for( i in 0..10 step 2){
        println(i)
    }
    println()

    //값의 감소
    for( i in 10 downTo 0){
        println(i)
    }
    println()

    //값의 감소를 2씩...
    for( i in 10 downTo 0 step 2) println(i)
    println()



    //7. 배열!! Array //////////////////////
    //var arr= [10,20,30] //error
    var arr= arrayOf(10, 20, 30)
    println(arr[0])
    println(arr[1])
    println(arr[2])
    //println(arr[3]) //Exception발생

    //값 변경도 특별한 것은 없음
    arr[0]= 100
    println(arr[0])
    println()

    //특이한 점은 코틀린은 모든 변수가 객체이므로
    //당연히 배열도 객체임.
    //그렇기에 객체의 메소드와 멤버변수를 보유하고 있음

    //배열의 길이
    println("배열의 길이 : ${arr.size}")

    //모든 배열을 get(), set()메소드가 있음
    println( arr.get(0) )

    arr.set(1, 200)
    println( arr.get(1) )
    println()

    //반복문을 이용해서 배열의 값들 출력
    for( i in 0 until 3){ //0..3쓰면 에러남
        println( arr[i] )
    }
    println()

    //배열의 값들을 곧바로 이용하여 반복하기
    for( n in arr){ // n은 배열의 인덱스가 아님!!
        //n은 배열의 요소값임
        println(n)
    }
    println()

    //배열의 요소값이 아니라 인덱스값으로 반복하기
    for( i in arr.indices ){
        println(i)
    }
    println()

    //인덱스와 값이 모두 필요하다면?
    for( (i, v) in arr.withIndex() ){
        println(" [ $i 번째] : $v ")
    }
    println()


    //배열요소의 타입을 지정하지 않으면
    //각 요소들은 Any타입임.
    var arr2= arrayOf(10, "Hello", true)
    for( t in arr2){
        println(t)
    }
    println()

    //각 요소가 Any타입이므로 그 요소에
    //다른 자료형의 값을 넣어도 문제없음
    arr2[1]=20
    println(arr2[1])
    println()

    //개발자들은 자료형이 고정되어 있는것을
    //선호함..

    //그래서 Type을 지정한 배열생성이 가능함
    var arr3= arrayOf<Int>(10, 20, 30)

    //당연히 다른 자료형을 넣으면 에러
    //var arr4= arrayOf<Int>(10, "Hello", true)

    //<Int>표기법이 맘에 들지 않으면...
    var arr4= intArrayOf(1, 2, 3)

    //변수를 먼저 만들고 나중에 배열을 대입할 수 있음.
    var arr5: IntArray
    arr5= intArrayOf(10,20,30)
    //arr5= arrayOf<Int>(10, 20, 30) //error

    //## Boolean부터 Double까지는 xxxArrayOf()가 있음.


    //기본적으로 배열요소의 값들은 null로 초기화되어 시작될 수 없음
    //요소개수가 5개인 빈 배열을 만들고 싶다면..
    //요소값이 null로 시작되는 배열을 만들면 됨.
    var arr6= arrayOfNulls<Any>(5)
    for( e in arr6){
        println(e)
    }
    println()

    //arrayOf()는 고정크기의 배열을 만드는 것임
    //유동적 배열 - 즉, ArrayList 만들기
    var arrList= arrayListOf(10, "Hello", true)
    for(e in arrList){
        println(e)
    }
    println()

    //요소 추가 및 삭제 [자바와 같음]
    arrList.add(3.14)
    for(e in arrList) println(e)
    println()

    arrList.add(0,"Nice")
    for(e in arrList) println(e)
    println()

    //인덱스번호로 지우기
    arrList.removeAt(0)
    for(e in arrList) println(e)
    println()

    //요소값으로 지우기
    arrList.remove(3.14)
    for(e in arrList) println(e)
    println()


    //2차원 배열!!!
    val arrays= arrayOf( arrayOf(10,20,30), arrayOf("Hello", "Nice"), arrayOf(true, false, true))
    for( ar in arrays ){
        for( e in ar){
            print(e)
            print("   ")
        }
        println()
    }
    println()


    //8. 함수!!!!
    //8.1 함수 호출
    show()

    //8.2 매개변수 전달
    output(10, "Kotlin")
    output(10) //파라미터의 디폴트값 사용해보기

    //8.3 리턴있는 함수호출
    var x= sum(5, 3)
    println(x)
    println()

    //참고** 리턴이 없는 함수의 리턴을 받으면??
    var z= display()
    println(z)

}//main함수..


//8.1함수 [ 매개변수 X, 리턴타입 X]
//함수를 정의할 때 리턴타입의 위치에 fun 키워드 사용
fun show(){
    println("show function!!")
    println()
}

//8.2함수 [ 매개변수 O, 리턴타입 X]
fun output(a:Int, b:String="Hello"){ //파라미터에는 var키워드 사용안함, 반드시 자료형이 명시적으로...
    println(a)
    println(b)
    println()
}

//8.2함수 [ 매개변수 O, 리턴타입 O]
fun sum(a:Int, b:Int):Int{ //리턴타입의 위치가 함수()뒤에 :후에 작성
    return a+b
}


fun display(){
    println("display!!!")
}







