import sbt._

/*
  "There's no earthly way of knowing / Which direction we are going! / There's no knowing where we're rowing, / Or which way they river's flowing! / Is it raining? Is it snowing? / Is a hurricane a-blowing? / Bah! Not a speck of light is showing, / So the danger must be growing, / Are the fires of hell a-blowing? / Is the grisly reaper mowing? / Yes! The danger must be growing, / For the rowers keep on rowing, / And they're certainly not showing / Any signs that they are slowing...
   */

class RyuProject(info: ProjectInfo) extends DefaultProject(info) with posterous.Publish {
  // databinder
  val databinderNet = "databinder.net repository" at "http://databinder.net/repo"
  def databind(p:String) = "net.databinder" %% "dispatch-%s".format(p) % "0.7.2"
  val ljs = databind("lift-json")
  val hjs = databind("http-json")
  val js = databind("json")
  val mime = databind("mime")
  
  // lift js
  val liftJson = "net.liftweb" % "lift-json" % "2.0-scala280-SNAPSHOT"

  
  // testing
  val snapshots = "Scala Tools Snapshots" at "http://www.scala-tools.org/repo-snapshots/"
  val specs = "org.scala-tools.testing" % "specs" % "1.6.2.1-SNAPSHOT" % "test"
}

