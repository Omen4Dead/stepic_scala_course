package exercises.week2oop

object ClassesOOPex {
  def main(args: Array[String]): Unit = {
    class Instructor (val id: Int, name: String, surname: String) {
      def fullName(): String = {
        s"${this.name.capitalize} ${this.surname.capitalize}"
      }
    }

    class Cource (courseID: Int, title: String, releaseYear: String, instructor: Instructor) {
      val instructorID : Int = instructor.id
      def getId: Int = {
        (this.courseID.toString :++ this.instructorID.toString).toInt
      }
    }

    val instructor = new Instructor(1, "nick", "aLl")
    val course = new Cource(4, "ABCD", "2012", instructor)
    println(instructor.fullName())
    println(course.getId())
  }
}
