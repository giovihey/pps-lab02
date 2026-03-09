package it.unibo.pps.u02

object Task7 extends App:

  private def power(base: Double, exponent: Int): Double = exponent match
    case 0 => 1
    case _ => base * power(base, exponent - 1)

  println((power(2, 3), power(5, 2))) // (8.0, 25.0)

  private def powerTail(base: Double, exponent: Int): Double =

    @annotation.tailrec
    def _power(base: Double, exponent: Int, acc: Double): Double = exponent match
        case 0 => acc
        case _ => _power(base, exponent - 1, base * acc)
        _power(base, exponent, 1)

  println((power(2, 3), power(5, 2))) // (8.0, 25.0)