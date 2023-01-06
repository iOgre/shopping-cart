import Dependencies._

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

ThisBuild / organization := "dev.iogre"
ThisBuild / organizationName := "iogre"

resolvers ++= Resolver.sonatypeOssRepos("snapshots")

lazy val root = (project in file("."))
  .settings(
    name := "shopping-cart",
    scalacOptions ++= List("-Ymacro-annotations"),
    libraryDependencies ++= Seq(
      CompilerPlugins.kindProjector,
      Libraries.newType,
      Libraries.refined,
      Libraries.catsEffect,
      Libraries.cats
    )
  )
