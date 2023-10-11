package lectures.week1basics

object Functions extends App {
  def aPerson(name:String, surname: String): String = {
    s"$name $surname"
  }

  println(aPerson("John", "Smith"))

  def prPerson(name:String, surname:String): Unit = {
    println(s"$name and $surname")
  }

  prPerson("J", "S")

  val name = "J"
  val surname = "S"
  val valPerson: String = {
    s"$name and $surname"
  }
  println(valPerson)

  def aParameterlessFunction(): Unit = println("Function with no param")
  aParameterlessFunction()
  aParameterlessFunction

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }
  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  //def someFunc(): Int = 2 * someFunc() + 1
  //def callSomeFunc(x: Int, y: => Int) = println(x)
  //callSomeFunc(someFunc(), 1)
  def aCondition(): Boolean = if ( 1 < 2) true else false
  println(aCondition())

  def someFunc(x: Int, y: => Int): Int = {
    if (aCondition()) x * 2
    else 1
  }
  println(someFunc(3, 4))
}
