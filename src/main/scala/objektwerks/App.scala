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
  def t( @arg t: String ): Unit =
    val encodings = Encodings.encode(t)
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

    primes
    reversePrimes
    fibonacci
    squares
    reverseSquares
    trigonal
    reverseTrigonal
    singleReduction
    reverseSingleReduction
    keypad
    chaldean
    septenary
    satanic
    reverseSatanic

  @main
  def s( @arg t: String ): Unit =
    val encodings = Encodings.encode(t)
    println(encodings) // Iterate encodings and save nunber with text. Get existing number-text?

  @main
  def n( @arg n: Int ): Unit =
    val stats = Number(n, primes, fibonaccis)
    println(stats) // print number stats.

  @main 
  def d( @arg d: String ): Unit =
    val stats = LocalDate.parse(d) // "2025-01-01"
    println(stats) // print data stats.

  @main
  def nt( @arg n: Int ): Unit =
    val texts = store
      .listTexts()
      .find(texts => texts.number == n) match
        case Some(texts) => texts
        case None => Texts.empty
    println(texts) // print texts.

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("h")
    println("t --text")
    println("n --number")
    println("d --date")
    println("nt --number")