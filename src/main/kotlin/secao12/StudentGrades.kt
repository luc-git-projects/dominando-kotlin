package secao12

fun main(){

    try{
        val grades = StudentGrades()
        val average = grades.add(-3.0)
            .add(5.5)
            .add(7.0)
            .average()
        println(average)
    }catch(e : RuntimeException){
        println("Error${e.message}")
        e.printStackTrace()
    }



}

class StudentGrades{
    private var sum = 0.0

    private var numberOfGrades = 0

    fun add(grade: Double) : StudentGrades{

//        if(grade !in 0.0 .. 10.0){
//            throw IllegalArgumentException("Invalid grade")
//        }

        require( grade in 0.0.. 10.0){"Grade $grade is not valid"}

        sum += grade
        numberOfGrades++
        return  this
    }

    fun average() : Double{
        return sum / numberOfGrades
    }
}