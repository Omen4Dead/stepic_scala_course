package lectures.week2oop

object ClassesOOP {
  def main(args: Array[String]): Unit = {
    class Student(id: Int, val name: String) {
      def getId(name: String, id: Int): String = {
        s"${this.name} has ID ${this.id} and $name has ID $id"
      }
    }
    val student = new Student(0, "Nick")
    println(student.name)
    println(student.getId("Nelli", 1))

    class Employee(val name: String, var salary: Double) {
      def this() = this("John", 0.0)
    }

    val employee = new Employee()
    println(s"${employee.name}'s salary is ${employee.salary}")
  }
}
