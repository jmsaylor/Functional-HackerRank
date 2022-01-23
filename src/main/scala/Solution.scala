package org.saylor.hackerrank

object Solution {

  def main(args: Array[String]): Unit = {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}