fun main() {
    var nums = arrayListOf<Int>()
    nums = arrayListOf(8, 21, 5, 90, 11, 0)
    nums[0] = 90
    nums.removeAt(4)
    nums.add(-35)
    for (i in 0..nums.size-1){
        print("${nums[i]} ")
    }
}