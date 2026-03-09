package it.unibo.pps.u02

object Task4 extends App:

  val p1: Int => Int => Int => Boolean =
    x => y => z => x<=y && x == z

  println(p1(1)(2)(1)) // true
  println(p1(3)(2)(1)) // false

  val p2: (Int, Int, Int) => Boolean =
    (x, y, z) => x<=y && x == z

  println(p2(1, 2, 1)) // true
  println(p2(3, 2, 1)) // false

  private def p3(x: Int)(y: Int)(z: Int): Boolean =
    x<=y && x == z

  println(p3(1)(2)(1)) // true
  println(p3(3)(2)(1)) // false

  private def p4(x: Int, y: Int, z: Int): Boolean =
    x <= y && x == z

  println(p4(1, 2, 1)) // true
  println(p4(3, 2, 1)) // false