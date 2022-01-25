package org.saylor.hackerrank
package functional.easy

object Reverse extends App{
  val arr: List[Int] = List(1, 2, 3)
  val reverse: Reverse = new Reverse
  println(reverse.f2(arr).mkString(", "))
}


class Reverse {
  def f(arr:List[Int]):List[Int] = arr.reverse

  def f2(arr:List[Int]):List[Int] = arr.foldLeft(List[Int]())((z,n) => n::z)
}
