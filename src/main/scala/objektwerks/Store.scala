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
    val cipherTextsAsJson = writeJson(texts)
    os.write.over(storePath / texts.fileProperty, cipherTextsAsJson)

  def listTextsFileNames(): List[Int] =
    os.list(storePath)
      .filter { path => path.baseName.nonEmpty }
      .map { path => path.baseName.toInt }
      .toList