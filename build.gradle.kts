buildscript {

    repositories {
        google()
        maven("https://repo1.maven.org/maven2")
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath(kotlin(Classpath.kotlin, Version.kotlin))
        classpath(Classpath.android)
        classpath(Classpath.androidJunit5)
        classpath(Classpath.junitPlatform)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { setUrl(MavenUrl.spekDev) }
    }
}
