import sbt.*

object Dependencies {
  private val ironVersion = "2.2.1"
  private val tikaVersion = "2.9.0"
  private val zioVersion = "2.0.18"

  val iron: List[ModuleID] = List(
    "io.github.iltotore" %% "iron" % ironVersion
  )

  val tika: List[ModuleID] = List(
    "org.apache.tika" % "tika-core" % tikaVersion,
    "org.apache.tika" % "tika-parsers" % tikaVersion
  )

  val zio: List[ModuleID] = List(
    "dev.zio" %% "zio" % zioVersion
  )
}
