package it.unibo.pps.u02

object Task5 extends App:

  private def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))

  println(compose(_ - 1, _ * 2)(5)) // 9