enablePlugins(ScalaNativePlugin)

name := "gciphers.native.cli"
organization := "objektwerks"
version := "1.0.0"
scalaVersion := �3.7.0-RC3�
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %%% "mainargs" % "0.7.6",
    "com.lihaoyi" %% "os-lib" % "0.11.5-M5",
    "com.softwaremill.ox" %% "core" % "0.5.13",
    "com.lihaoyi" %% "upickle" % "4.1.0",
    "org.ekrich" %%% "sjavatime" % "1.3.0",
    "com.outr" %%% "scribe" % "3.16.1",
    "com.outr" %%% "scribe-file" % "3.16.0",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}