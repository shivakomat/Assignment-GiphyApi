name := "ClaraGIPHYLib"

version := "1.0"

lazy val `claragiphylib` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws, "org.skinny-framework" %% "skinny-http-client" % "2.3.7")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )
