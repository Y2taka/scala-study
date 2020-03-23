// for '(' (<ジェネレータ>;)+ ')' '<本体>' 
// <ジェネレータ> = x <- <式>
for(x <- 1 to 5; y <- 1 until 5){
    println("x = " + x + " y = " + y)
}

for(x <- 1 to 5; y <- 1 until 5 if x != y){
    println("x = " + x + " y = " + y)
}

for(e <- List("A","B","C","B","D","E")) println(e)

for(e <- List("A","B","C","B","D","E")) yield {
    "Pre" + e
}

for(x <- 1 to 1000; y <- 1 to 1000; z <- 1 to 1000 if z*z == x*x + y*y){
    println((x, y, z))
}