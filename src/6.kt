fun main() {
    val nums = arrayOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)
    var sr = nums.sum()/nums.size
    for(i in 0..nums.lastIndex){
        if(nums[i]>sr){
            print("${nums[i]} ")
        }
    }
}