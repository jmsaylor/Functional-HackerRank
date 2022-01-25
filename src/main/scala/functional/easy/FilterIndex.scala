package org.saylor.hackerrank
package functional.easy


object FilterIndex extends App {
  val arr: List[Int] = List(3,2,3,4,3,6,3,8,3)
  val filter: FilterIndex = new FilterIndex
  println(filter.f(arr).mkString(", "))
}

class FilterIndex {
  def f(arr: List[Int]): List[Int] = arr.view.zipWithIndex.filter(_._2 % 2 == 1).map(_._1).toList
}
