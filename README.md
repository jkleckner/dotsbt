dotsbt: Plugins for sbt-extras
==================

This set of [sbt](https://github.com/sbt/sbt "sbt home") files adds plugins
to projects without having to modify each of them individually.
Originally, I created it so that I could add the
[Eclipse plugin](https://github.com/typesafehub/sbteclipse "eclipse plugin")
to projects without having to manage a personal branch and quickly generate an
Eclipse project to browse the source, since [Scala](http://www.scala-lang.org/)
is very difficult to read without an IDE.

`Sbt` does provide a global mechanism to place common definitions into `~/.sbt`,
but if you have projects that require different and incompatible versions of these,
you would have to change them each time you switch projects.  This is part of the
motivation for why [Paul Philips](https://github.com/paulp) created a
[wrapper sbt script](https://github.com/paulp/sbt-extras "rebel cut")
to discover the sbt version from the project and to create a consistent execution environment.
It creates version-specific subdirectories of `~/.sbt` with the release number of `sbt`
and selects those at build time.

As a result, you need to create copies of the plugin files for each
version of sbt used in your projects.

This set of files is an attempt to find consistent versions of those plugins.

The result hopefully can reduce the project churn as different developers
modify the tooling for their favorite IDE or analysis tool of the week.

In order for this to work with older versions of sbt specified in a project,
you need to use the updated version that contains
[pull #68](https://github.com/paulp/sbt-extras/pull/68 "pull #68")
from [yyuu](https://github.com/yyuu "yyuu") that
[restores downlods](https://github.com/yyuu/sbt-extras "sbt-extras")
of older launcher versions.

This is a quick hack and not all combinations have been tested and may not be correct.
Please submit fixes.

## Installation

Clone this repo and put it into `~/.sbt`.

Remove unnecessary tooling from your projects.

Do not remove tooling that is necessary for build systems...

## List of Plugins

* Eclipse plugin:   [sbteclipse](https://github.com/typesafehub/sbteclipse "sbteclipse")
* Idea plugin:      [sbt-idea](https://github.com/mpeltonen/sbt-idea "sbt-idea")
* Dependency graph: [sbt-dependency-graph](https://github.com/jrudolph/sbt-dependency-graph "sbt-dependency-graph")
* Sbt release:      [sbt-release](https://github.com/sbt/sbt-release "sbt-release")
* Sbt updates:      [sbt-updates](https://github.com/rtimush/sbt-updates "sbt-updates"):
Note that it is possible to check for updates to plugins as well as per this [comment](https://github.com/rtimush/sbt-updates/issues/10#issuecomment-28617595 "plugin updates").

