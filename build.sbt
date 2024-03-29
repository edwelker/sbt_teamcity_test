name := "hello"

version := ".1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
"org.scalatest" %% "scalatest" % "1.9.1" % "test",
"junit" % "junit" % "4.11" % "test",
"com.novocode" % "junit-interface" % "0.9" % "test->default",
"org.mockito" % "mockito-core" % "1.9.5"
)
