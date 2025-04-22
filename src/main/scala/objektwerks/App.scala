package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val store = Store()

  @main
  def help(): Unit =
    commands()

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)

  private def commands(): Unit =
    println("Commands:")
    println("1. w")