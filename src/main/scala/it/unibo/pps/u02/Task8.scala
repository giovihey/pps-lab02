package it.unibo.pps.u02

object Task8 extends App:

  private def helper(remainingPart: Int, current: Int): Int =
    current * 10 + remainingPart % 10

  private def reverseNumber(n: Int): Int =
    @annotation.tailrec
    def _reverseNum(n: Int, acc: Int): Int = n match
      case 0 => acc
      case _ => _reverseNum(n / 10, helper(n, acc))
    _reverseNum(n, 0)


  println(reverseNumber(12345)) // 54321

  enum Expr:
    case Literal(value: Int)
    case Sum(left: Expr, right: Expr)
    case Multiply(left: Expr, right: Expr)

    def evaluate(expr: Expr): Int = expr match
      case Literal(value) => value
      case Sum(l, r) => evaluate(l) + evaluate(r)
      case Multiply(l, r) => evaluate(l) * evaluate(r)

    def show(expr: Expr): String = expr match
      case Literal(value) => value.toString
      case Sum(l, r) => s"(${show(l)} + ${show(r)})"
      case Multiply(l, r) => s"(${show(l)} * ${show(r)})"

  private val five = Expr.Literal(5)
  private val sum = Expr.Sum(five, Expr.Literal(3))
  private val prod = Expr.Multiply(Expr.Literal(3), Expr.Literal(2))

  println(five.show(five)) // 5
  println(sum.show(sum)) // (5 + 3)
  println(prod.show(prod)) // (3 * 2)
  println(prod.evaluate(prod)) // 6
