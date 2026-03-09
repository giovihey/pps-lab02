package it.unibo.pps.u02

import javax.sql.rowset.Predicate

object Task2 extends App:

  private val positive: Int => String =
    case x if x >= 0 => "pos"
    case _ => "neg"

  println(positive(1))
  println(positive(-2))

  private def positiveFun(value: Int): String = value match
    case n if n >= 0 => "pos"
    case _ => "neg"

  println(positiveFun(1))
  println(positiveFun(-2))

  private val emptyString: String => Boolean = _ == ""

  private val neg: (String => Boolean) => String => Boolean =
    f => i => i != ""

  private val notEmpty = neg(emptyString)

  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  print(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

  private def emptyFun(s: String): Boolean = s == ""
  private def negFun(f: String => Boolean)(i: String): Boolean =
    !f(i)

  private val notE: (String => Boolean) = i => negFun(emptyString)(i)

  println(notE("foo")) // true
  println(notE("")) // false
  print(notE("foo") && !notE("")) // true.. a comprehensive test



