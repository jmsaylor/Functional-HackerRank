package org.saylor.hackerrank
package functional.easy

object Count extends App {
  val list = List(1,2,3)
  val count: Count = new Count
  println(count.f3(list))
}

class Count {
  def f(arr:List[Int]):Int = arr.fold(0)((z,a) => z + 1)

  def f2(arr:List[Int]):Int = arr.count(x => true)
  def f3(arr: List[Int]): Int = arr.count(x => x % 2 == 0)
}
