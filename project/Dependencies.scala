import sbt._
object Dependencies {

  object V {
    val kindProjector: String = "0.13.2"
    val newType               = "0.4.4"
    val catsEffect            = "3.4.4"
    val cats                  = "2.9.0"
    val refined               = "0.10.1"

  }

  object CompilerPlugins {
    val kindProjector = compilerPlugin("org.typelevel" %% "kind-projector" % V.kindProjector cross CrossVersion.full)

  }

  object Libraries {
    val refined = "eu.timepit" %% "refined" % V.refined

    val newType    = "io.estatico"   %% "newtype"     % V.newType
    val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect
    val cats       = "org.typelevel" %% "cats-core"   % V.cats


  }
}
