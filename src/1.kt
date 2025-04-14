import kotlin.math.abs

fun main() {
    val x = (1..9).random()
    var y = (1..9).random()
    while (x==y){
        y = (1..9).random()
    }
    val nums = arrayOfNulls<Int>(abs(x-y)+1)
    for (i in (minOf(x, y)..maxOf(x, y))){
        nums[abs(minOf(x, y) - i)] = i
    }
    println("${minOf(x,y)}..${maxOf(x,y)}")
    for (i in 0..nums.lastIndex){
        print("${nums[i]} ")
    }
}