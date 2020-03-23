//<対象式> match {
//  (case <パターン> (if <ガード>)? '=>'
//    (<式> (;|<改行>))*
//  )+
//}

val taro = "Taro"
taro match {
    case "Taro" => "Male"
    case "Jiro" => "Male"
    case "Hanako" => "Female"
}

val one = 1
one match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"   // ワイルドカードパターン
}

"abc" match {
    case "abc" | "def" =>
        println("first")
        println("second")
}

// パターンマッチ
val lst = List("A", "B", "C")
lst match {
    case List("A", b, c) if b != "B" =>
        println("b = " + b)
        println("c = " + c)
    case _ =>
        println("nothing")
}

val lst = List(List("A"), List("B", "C"))
lst match {
    case List(a@List("A"), x) =>
        println(a)
        println(x)
    case _ => println("nothing")
}

// 中置パターン
val lst = List("A", "B", "C")
lst match{
    case "A"::b::c::_ =>
        println("b = " + b)
        println("c = " + c)
    case _ =>
        println("nothing")
}

// 型によるパターンマッチ
import java.util.Locale

val obj: AnyRef = "String Literal"
obj match {
    case v:java.lang.Integer =>
        println("Integer!")
    case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
}

for(x <- 1 to 1000){
    var str = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
    str match {
        case List(a, b, c, d, e) =>
            println((a,b,c,d,a))
    }
}