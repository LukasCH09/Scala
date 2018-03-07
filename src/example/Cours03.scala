package example

object Cours03 {
  class Rational(n: Int, d: Int){
    def num: Int = n
    def den: Int = d

    def add(that: Rational) :Rational = {
      new Rational(num * that.den + that.num * den, den * that.den)
    }

    def minus(that: Rational): Rational = {
      new Rational(num * that.den - that.num * den, den * that.den)
    }

    def times(that: Rational): Rational = {
      new Rational(num*that.num, den*that.den)
    }

    def divided

    def equal(that: Rational): s= {
      num/den == that.num/that.den
    }

    def neg() ={
      new Rational(-num, den)
    }

    override def toString() = num + "/" + den
  }
}
