package org.saylor.hackerrank
package functional.easy

object Fill extends App {
  val fill = new Fill
  println(fill.f3(4))
}

class Fill {
  def f(num:Int) : List[Int] = List.fill(num)(1)

  def f2(num: Int): List[Int] = List.tabulate(num)(_ + 1)

  def f3(num: Int): List[Int] = if num == 0 then List() else num::f3(num - 1)
}
