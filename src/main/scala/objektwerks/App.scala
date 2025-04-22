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
    println(encodings) // Iterate and print encoding.

  @main
  def n( @arg number: Int ): Unit =
    val stats = Number(number, primes, fibonaccis)
    println(stats) // print number stats.

  @main 
  def d( @arg date: String ): Unit =
    val stats = LocalDate.parse(date) // "2025-01-01"
    println(stats) // print data stats.

  @main
  def nt( @arg number: Int ): Unit =
    val texts = store
      .listTexts()
      .find(texts => texts.number == number) match
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
    println("nt --numbertexts")