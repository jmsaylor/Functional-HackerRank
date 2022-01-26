package org.saylor.hackerrank
package functional.easy

object SumOdds extends App{
  val arr: List[Int] = List(3,2,2,3)
  val so: SumOdds = new SumOdds
  println(so.f2(arr))
}

class SumOdds {
  def f(arr:List[Int]):Int = arr.filter(_ % 2 == 1).sum

  def f2(arr:List[Int]):Int = arr.filter(a => a % 2 == 1).foldLeft(0)((z,a) => z + a)
}
