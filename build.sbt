organization := "FP"

name := "Exercises"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.6.4" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")
