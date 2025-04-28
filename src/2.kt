fun main() {
    val nums = mutableListOf<Int>()
    nums.addAll(listOf(8, 21, 5, 90, 11, 0))
    nums.add(0, 90)
    nums.removeAt(4)
    nums.add(-35)
    for (i in nums){
        print("$i ")
    }
}