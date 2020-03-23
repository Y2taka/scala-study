// if '('<条件式>')' <then式> (else <else式>)?
// REPLで実行
var age: Int = 5
var isSchoolStarted: Boolean = false

if( 1 <= age && age <= 6 && !isSchoolStarted){
    println("幼児です")
} else {
    println("幼児ではありません")
}