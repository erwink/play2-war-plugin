// Comment to get more information during initialization
logLevel := Level.Warn

//resolvers += "Local Repository" at "http://localhost:8090/publish"

// Enable it for Play 2.0.3
resolvers += "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases"

resolvers += Resolver.file("Local Ivy Repository", file(Path.userHome.absolutePath+"/.ivy2/local"))(Resolver.ivyStylePatterns)

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.1-RC2"))

//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "0.9-SNAPSHOT")
