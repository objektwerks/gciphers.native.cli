package objektwerks

import mainargs.{main, arg, ParserForMethods}

object App:
  val store = Store()

  def main(args: Array[String]): Unit =
    if args.isEmpty then commands()
    else ParserForMethods(this).runOrExit(args)