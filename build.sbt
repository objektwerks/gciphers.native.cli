import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "gciphers.native.cli"
organization := "objektwerks"
version := "2.0.0"
scalaVersion := "3.9.0-RC5"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %%% "mainargs" % "0.7.6",
    "com.lihaoyi" %%% "os-lib" % "0.11.9-M8",
    "com.lihaoyi" %%% "upickle" % "4.4.3",
    "org.ekrich" %%% "sjavatime" % "1.5.0",
    "com.outr" %%% "scribe" % "3.19.0",
    "com.outr" %%% "scribe-file" % "3.19.0",
    "org.scalatest" %%% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
