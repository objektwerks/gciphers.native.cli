package objektwerks

import upickle.default.{read => readJson, write => writeJson}

final class Store:
  val storePath = os.home / ".gciphers" / "store"

  os.makeDir.all(storePath)

  def listTexts(): List[Texts] =
    os.list(storePath)
      .filter { path => path.baseName.nonEmpty }
      .map { path => readTexts(s"${path.baseName}.json") }
      .toList

  def readTexts(file: String): Texts =
    val textsAsJson = os.read(storePath / file)
    readJson[Texts](textsAsJson)

  def writeTexts(texts: Texts): Unit =
    val textsAsJson = writeJson(texts)
    os.write.over(storePath / texts.fileProperty, textsAsJson)

  def writeTexts(text: String, numbers: Int*): Unit =
    val list = os.list(storePath)
      .filter { path => path.baseName.nonEmpty }
      .map { path => path.baseName.toInt }
      .toList
    for(number <- numbers)
      if list.contains(number) then
        val texts = readTexts(s"$number.json")
        writeTexts( texts.copy(values = texts.values ++ Set(text)) )
      else writeTexts( Texts(number, Set(text)) )