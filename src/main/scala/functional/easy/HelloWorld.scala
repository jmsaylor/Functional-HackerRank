package org.saylor.hackerrank
package functional.easy

object HelloWorld extends App {
  val hw: HelloWorld = new HelloWorld
  hw.f()
}

class HelloWorld {
  def f(): Unit = println("Hello World")
}
