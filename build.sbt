name := "scalania"

organization := "pl.japila"

version := "0.1.0-SNAPSHOT"

sbtVersion in Global := "0.13.0"

scalaVersion in Global := "2.10.3-RC1"

scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature")

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies in Global ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" %% "scalatest" % "1.9.2-SNAP2" % "test",
  "org.specs2" %% "specs2" % "2.1.1" % "test"
)

resolvers in Global ++= Seq(
	"snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
	"releases"  at "http://oss.sonatype.org/content/repositories/releases")
