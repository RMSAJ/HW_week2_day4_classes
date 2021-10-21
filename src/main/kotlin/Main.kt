
fun main(args: Array<String>) {

    var cors = Course()
    var prof= profissor()

}

class Course {
    var CourseName:String""
    var number_of_lectures = Int
    var students:String=""
    var professor:String=""
    // the idea in my mind doing list for each "coursName then when i add mor student to the cours1 i will check if the student mor than or equal 20 here i can't add student then else i will add a new student
    // i have many idea but i can't write it on the cod :(

}


class Students {

    var firstName = "Haya"
    var lastName = "saud"
    var courses:String=""

    public  fun fullName() // return “firstName lastName”
    {
        println("$firstName" , "$lastName")
    }

}

public class profissor {

    var firstName = "Haya"
    var lastName = "saud"
    var telephone = Int
    var courses :String=""

    public  fun fullName() // return “firstName lastName”
    {
        println("$firstName", "$lastName")
        println("telephone:","$telephone")
        println("Courses","$courses")
    }

}