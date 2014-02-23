// resolvers += Resolver.url("sbt-plugin-snapshots", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("sbt-plugin-snapshots", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.2")
