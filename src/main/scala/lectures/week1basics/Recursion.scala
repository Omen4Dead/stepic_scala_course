package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App{
  var i = 0
  while (i < 3) {
    println("Hello")
    i += 1
  }
  println("\n--------------------------")
  def factorial(n: Int): Long = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(25))

  println("\n--------------------------")
  def factorial2(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого считаем факториал ${n - 1}")
      var res = n * factorial2(n - 1)
      println(s"Вычислили факториал $n")
      res
    }
  }
  factorial2(3)

  println("\n--------------------------")
  def factorialWithTailRecursion(n: Int): Long = {
    @tailrec
    def loop(x: Long, accumulator: Long = 1): Long = {
      println(s"$x $accumulator")
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }
    loop(n)
  }
  println(factorialWithTailRecursion(10))

  println("\n--------------------------")
  def repeatWord(word: String, n: Int) : String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      println(s"$i $acc")
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }
    loop(n)
  }

  println(repeatWord("hello", 5))
}
