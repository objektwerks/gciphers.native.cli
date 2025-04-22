enablePlugins(ScalaNativePlugin)

"name := "gciphers.native.cli
organization := "objektwerks"
version := "1.0.0"
scalaVersion := �3.7.0-RC3�
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
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}