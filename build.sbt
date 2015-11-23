enablePlugins(ScalaJSPlugin)

name := "scalajs-react-select-example"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += Resolver.sonatypeRepo("snapshots")


// create launcher file ( its search for object extends JSApp , make sure there is only one file)
persistLauncher := true

persistLauncher in Test := false

val scalaJSReactVersion = "0.10.1"

val scalaCssVersion = "0.3.1"

val reactJSVersion = "0.14.3"


libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % scalaJSReactVersion,
  "com.github.japgolly.scalajs-react" %%% "extra" % scalaJSReactVersion,
  "com.github.japgolly.scalacss" %%% "core" % scalaCssVersion,
  "com.github.japgolly.scalacss" %%% "ext-react" % scalaCssVersion,
  "com.payalabs" %%% "scalajs-react-bridge" % "0.2.0-SNAPSHOT"
)


// creates single js resource file for easy integration in html page
skip in packageJSDependencies := false



// copy  javascript files to js folder,that are generated using fastOptJS/fullOptJS

crossTarget in (Compile, fullOptJS) := file("js")

crossTarget in (Compile, fastOptJS) := file("js")

crossTarget in (Compile, packageJSDependencies) := file("js")

crossTarget in (Compile, packageScalaJSLauncher) := file("js")

crossTarget in (Compile, packageMinifiedJSDependencies) := file("js")

artifactPath in (Compile, fastOptJS) := ((crossTarget in (Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))



scalacOptions += "-feature"

