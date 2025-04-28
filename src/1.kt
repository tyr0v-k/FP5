fun main() {
    val x = (1..9).random()
    var y = (1..9).random()
    while (x==y){
        y = (1..9).random()
    }
    val nums = mutableListOf<Int>()
    for (i in (minOf(x, y)..maxOf(x, y))){
        nums.add(i)
    }
    println("${minOf(x,y)}..${maxOf(x,y)}")
    for (i in nums){
        print("$i ")
    }
}