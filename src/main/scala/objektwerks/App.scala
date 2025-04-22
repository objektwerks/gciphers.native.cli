package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val primes = Numbers.listPrimes(0 to 1000)
  val fibonaccis = Numbers.listFibonaccis(0 to 15)
  val store = Store()

  @main
  def help(): Unit =
    commands()

  @main
  def t( @arg text: String ): Unit =
    val encodings = Encodings.encode(text)
    println(encodings) // Iterate and print.

  @main
  def n( @arg int: Int ): Unit =
    val number = Number(int, primes, fibonaccis)
    println(number) // print.

  @main
  def d( @arg date: String ): Unit = ???

  @main
  def nt( @arg number: Int ): Unit = ???

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("1. t - text")
    println("2. n - number")
    println("3. d - date")
    println("4. nt - number to texts")