lazy val commonSettings = Seq(
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "io.monix"                   %% "monix"          % "3.0.0-RC2",
    "org.mockito"                % "mockito-core"    % "2.7.19" % Test,
    "org.scalatest"              %% "scalatest"      % "3.0.4" % Test,
    "org.slf4j"                  % "slf4j-api"       % "1.7.7",
    "com.typesafe.scala-logging" %% "scala-logging"  % "3.7.2",
    "ch.qos.logback"             % "logback-classic" % "1.2.3" % Test,
    "ch.qos.logback"             % "logback-core"    % "1.2.3" % Test
  ),
  scalafmtOnCompile := true
)

lazy val core = project
  .in(file("core"))
  .settings(commonSettings)
  .settings(
    name := "reactive-config-core"
  )

lazy val circe = project
  .in(file("circe"))
  .dependsOn(core)
  .settings(commonSettings)
  .settings(
    name := "reactive-config-circe",
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-parser"  % "0.10.0-M1",
      "io.circe" %% "circe-generic" % "0.9.3" % Test
    )
  )

lazy val typesafe = project
  .in(file("typesafe"))
  .dependsOn(core)
  .dependsOn(circe % "test->compile")
  .settings(commonSettings)
  .settings(
    name := "reactive-config-typesafe",
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.3.1",
      //    TODO monix-nio is more convenient for our purposes but it uses Monix v 3.0.0-M3 which is incompatible with 3.0.0-RC2
      //    TODO better-files used instead. One should use monix-nio in future
      "com.github.pathikrit" %% "better-files"  % "3.7.0",
      "io.circe"             %% "circe-parser"  % "0.10.0-M1" % Test,
      "io.circe"             %% "circe-generic" % "0.9.3" % Test
    )
  )

scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-Ywarn-unused:imports",
  "-Ypartial-unification",
  "-language:higherKinds",
  "-language:postfixOps"
)