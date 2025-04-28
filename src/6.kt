fun main() {
    val nums = arrayOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)
    val sr = nums.sum()/nums.size
    for(i in nums){
        if(i>sr){
            print("$i ")
        }
    }
}