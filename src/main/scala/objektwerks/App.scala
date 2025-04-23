package objektwerks

import mainargs.{main, arg, ParserForMethods}

import java.time.LocalDate

object App:
  val primes = Numbers.listPrimes(0 to 1000)
  val fibonaccis = Numbers.listFibonaccis(0 to 15)
  val store = Store()

  @main
  def h(): Unit =
    commands()

  @main
  def t( @arg text: String ): Unit =
    val encodings = Encodings.encode(text)
    println(s"text: ${encodings.text}")
    println(s"ordinal: ${encodings.ordinal}")
    println(s"reverse ordinal: ${encodings.reverseOrdinal}")
    println(s"reduction: ${encodings.reduction}")
    println(s"reverse reduction: ${encodings.reverseReduction}")
    println(s"standard: ${encodings.standard}")
    println(s"reverse standard: ${encodings.reverseStandard}")
    println(s"latin: ${encodings.latin}")
    println(s"sumerian: ${encodings.sumerian}")
    println(s"reverse sumerian: ${encodings.reverseSumerian}")
    println(s"primes: ${encodings.primes}")
    println(s"reverse primes: ${encodings.reversePrimes}")
    println(s"fibonacci: ${encodings.fibonacci}")
    println(s"squares: ${encodings.squares}")
    println(s"reverse squares: ${encodings.reverseSquares}")
    println(s"trigonal: ${encodings.trigonal}")
    println(s"reverse trigonal: ${encodings.reverseTrigonal}")
    println(s"single reduction: ${encodings.singleReduction}")
    println(s"reverse single reduction: ${encodings.reverseSingleReduction}")
    println(s"keypad: ${encodings.keypad}")
    println(s"chaldean: ${encodings.chaldean}")
    println(s"septenary: ${encodings.septenary}")
    println(s"satanic: ${encodings.satanic}")
    println(s"reverse satanic: ${encodings.reverseSatanic}")

  @main
  def s( @arg text: String ): Unit =
    val encodings = Encodings.encode(text)
    println(encodings) // TODO: Iterate encodings and save nunber with text. Get existing number-text?

  @main
  def n( @arg number: Int ): Unit =
    val stats = Number(number, primes, fibonaccis)
    println(s"number: ${stats.number}")
    println(s"prime rank: ${stats.primeRank}")
    println(s"fibonaci rank: ${stats.fibonacciRank}")
    println(s"is triangular: ${stats.isTriangular}")
    println(s"factors: ${stats.factors.mkString(",")}")

  @main 
  def d( @arg date: String ): Unit =
    val stats = LocalDate.parse(date) // "2025-01-01"
    println(stats) // TODO: Pxsrint data stats.

  @main
  def nt( @arg number: Int ): Unit =
    val texts = store
      .listTexts()
      .find(texts => texts.number == number) match
        case Some(texts) => texts
        case None => Texts.empty
    println(s"number: ${texts.number}")
    println(s"texts: ${texts.values}")

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("h")
    println("t --text text")
    println("s --text text")
    println("n --number 1")
    println("d --date 2025-01-01")
    println("nt --number 1")