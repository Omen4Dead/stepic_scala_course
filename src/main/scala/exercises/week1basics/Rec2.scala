package exercises.week1basics

import scala.annotation.tailrec

object Rec2 {
  def main(args: Array[String]): Unit = {
    val fArgs = Array(10, 1, 5)

    def aPower(x: Int, y: Int, n: Int): Unit = {
      @tailrec
      def loop(y: Int, n: Int, acc: Int): Int = {
        if (n <= 0) acc
        else {
          loop(y, n - 1, acc + y)
        }
      }
      val res = loop(y, n, x).toString
      print((s"$res " * res.length) ++ "the result")
    }

    aPower(fArgs(0), fArgs(1), fArgs(2))
  }
}
