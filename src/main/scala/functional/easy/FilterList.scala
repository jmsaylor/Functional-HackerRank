package org.saylor.hackerrank
package functional.easy

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer


object FilterList extends App{
  val list: List[Int] = List(7, 3, 9, 1, 8, 9)
  val filter: FilterList = new FilterList
  println(filter.f(8, list).mkString(", "))
}

class FilterList {

  def f3(delim:Int,arr:List[Int]): List[Int] = arr.filter(_ < delim)

  def f(delim:Int,arr:List[Int]): List[Int] =
    arr.flatMap(e => if e < delim then Some(e) else None)
}
