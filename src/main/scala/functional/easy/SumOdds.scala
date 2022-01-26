package org.saylor.hackerrank
package functional.easy

object SumOdds extends App{
  val so: SumOdds = new SumOdds
  val arr1: List[Int] = List(3,2,2,3)
  val arr2: List[Int] = List(11,25,18,-1,26,-20,-19,23,-24,-8)

  val arr = arr2
  println(so.util(arr))
  println(so.f(arr))
}

class SumOdds {

  def util(arr: List[Int]): List[Int] = arr.filter(a => (a ^ 1) != a + 1)

  def f(arr:List[Int]):Int = arr.filter(a => (a ^ 1) != a + 1).sum

  def f2(arr:List[Int]):Int = arr.filter(a => (a ^ 1) != a + 1).foldLeft(0)((z,a) => z + a)

}
