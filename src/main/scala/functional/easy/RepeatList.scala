package org.saylor.hackerrank
package functional.easy

object RepeatList extends App{
  val list: List[Int] = List(1,2,3,4)
  val repeater: RepeatList = new RepeatList
  val result: List[Int] = repeater.f(4,list)
  val result2: List[Int] = repeater.f2(4,list)
  print("1: "); println(result.mkString(", "))
  print("2: "); println(result2.mkString(", "))
}

class RepeatList {

  def f(n: Int, list: List[Int]): List[Int] =
    list.flatMap(List.fill(n)(_))

  def f2(n: Int, list: List[Int]): List[Int] =
    list.flatMap(e => List.fill(n)(e))
}
