package org.saylor.hackerrank
package functional.easy

import scala.annotation.tailrec

object Loop extends App {
  val loop: Loop = new Loop
  loop.f(10)
}

class Loop {

  def f(n: Int): Unit =
    @tailrec
    def loop(x: Int): Unit =
      println("RHello World")
      if x < n then loop(x + 1)
    loop(1)

}
