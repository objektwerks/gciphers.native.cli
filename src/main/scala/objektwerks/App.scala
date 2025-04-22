package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val store = Store()

  @main
  def help(): Unit =
    commands()

  @main
  def t( @arg text: String ): Unit =
    val encodings = Encodings.encode(text)
    println(encodings) // Iterate and print.

  @main
  def n( @arg number: Int ): Unit = ???

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