package exercises.week1basics

import scala.annotation.tailrec

object Recursion extends App {
  var power: BigInt = 2
  def poweroftwo_test(x: Int): BigInt = {
    if (x <= 1) power
    else {
      power *= 2
      poweroftwo_test(x - 1)
    }
  }
  def powerOfTwo(x: Int): BigInt = {
    @tailrec
    def loop(x: Int, acc: BigInt = 2): BigInt = {
      if (x <= 1) acc
      else loop(x - 1, acc * 2)
    }
    loop(x)
  }

  //poweroftwo_test(10)
  println(powerOfTwo(10))
}
