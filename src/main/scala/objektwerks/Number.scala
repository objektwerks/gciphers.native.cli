package objektwerks

import Numbers.*

object Number:
  def apply(number: Int,
            primes: List[(Rank, Prime)],
            fibonaccis: List[(Rank, Fibonacci)]
            ): Number =
    Number(number,
           findPrimeRank(primes, number),
           findFibonacciRank(fibonaccis, number),
           isStar(number),
           isTriangular(number),
           listFactors(number))

final case class Number(number: Int,
                        primeRank: Int,
                        fibonacciRank: Int,
                        isStar: Boolean,
                        isTriangular: Boolean,
                        factors: List[Int]) derives CanEqual