fun main() {
    val nums = arrayOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    println("${if(nums.lastIndex!=0){nums.sorted()[1]}else{nums[0]}}")
}