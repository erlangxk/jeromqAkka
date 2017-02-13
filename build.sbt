lazy val root = (project in file(".")).settings(
	name := "jeromqAkka",
	version := "0.1",
	scalaVersion := "2.11.8"
)

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-Ywarn-dead-code","-Ywarn-unused-import")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.17",
  "org.zeromq" % "jeromq" % "0.3.6"
)