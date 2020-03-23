// while '(' <条件式> ')' 本体式
// REPLで実行
def loopFrom0To9(): Unit = {
    var i = 0
    do {
        println(i)
        i = i + 1
    } while(i < 10)
}