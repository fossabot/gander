name := "Goose"

version := "2.1.22-SNAPSHOT"

organization := "com.gravity"

organizationHomepage := Some(url("http://gravity.com/"))

homepage := Some(url("https://github.com/GravityLabs/goose"))

description := "Html Content / Article Extractor in Scala"

licenses += "Apache2" -> url("http://www.apache.org/licenses/")

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  // Main dependencies
  "org.slf4j"                 % "slf4j-simple"    % "1.6.1",
  "org.jsoup"                 % "jsoup"           % "1.5.2",
  "commons-io"                % "commons-io"      % "2.0.1",
  "org.apache.httpcomponents" % "httpclient"      % "4.1.2",
  "commons-lang"              % "commons-lang"    % "2.6",
  // Testing dependencies
  "com.novocode"              % "junit-interface" % "0.9"   % Test,
  "org.slf4j"                 % "slf4j-log4j12"   % "1.6.1" % Test,
  // Build dependencies
  "org.slf4j"                 % "slf4j-api"       % "1.6.1" % Compile
)
