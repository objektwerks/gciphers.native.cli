name := "gciphers.native.cli
organization := "objektwerks"
version := "3.3.0"
scalaVersion := Ò3.7.0-RC3Ó
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "os-lib" % "0.11.5-M5",
    "com.softwaremill.ox" %% "core" % "0.5.13",
    "com.lihaoyi" %% "upickle" % "4.1.0",
    "com.typesafe" % "config" % "1.4.3",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
