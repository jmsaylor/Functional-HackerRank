package org.saylor.hackerrank
package functional.easy

object MapAbsolute extends App {
  val list = List(-1,2,-3)
  val abs = new MapAbsolute
  println(abs.f3(list))
}

class MapAbsolute {
  def f(arr:List[Int]):List[Int] = arr.map(x => if x < 0 then -x else x)

  def f2(arr: List[Int]):List[Int] = arr.map(math.abs)

  def f3(arr: List[Int]): List[Int] = arr map math.abs
}
