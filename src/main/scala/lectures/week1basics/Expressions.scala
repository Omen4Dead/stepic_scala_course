package lectures.week1basics

object Expressions extends App{
  val aVal = 1 + 2 * 3
  println(aVal)

  val aCond = false
  val ifExpr = if (aCond) "TruE" else "FalSe"
  println(ifExpr)

  val someVal: Unit = println("I just want to print")
  println(someVal)
}
