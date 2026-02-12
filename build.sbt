import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "gciphers.native.cli"
organization := "objektwerks"
version := "2.0.0"
scalaVersion := "3.8.2-RC1"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %%% "mainargs" % "0.7.6",
    "com.lihaoyi" %%% "os-lib" % "0.11.9-M5",
    "com.lihaoyi" %%% "upickle" % "4.4.2",
    "org.ekrich" %%% "sjavatime" % "1.4.0",
    "com.outr" %%% "scribe" % "3.17.0",
    "com.outr" %%% "scribe-file" % "3.17.0",
    "org.scalatest" %%% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
