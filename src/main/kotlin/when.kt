fun main(){
   val student="Aman"

    val result = when(student){
        "Aman" -> "Student is Aman"
        "Deepak" -> "Student is Deepak"
        "Sidhant" -> "Student is Sidhant"
        else -> "Student is Danish"
    }
println(result)
}