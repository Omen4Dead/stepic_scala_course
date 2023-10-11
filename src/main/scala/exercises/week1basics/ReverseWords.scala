package exercises.week1basics

import scala.io.StdIn

object ReverseWords {
  def main(args: Array[String]): Unit = {
    val input : String = StdIn.readLine()
    println(input.split(raw"\s+").toList.reverse.mkString(" "))
  }
}
