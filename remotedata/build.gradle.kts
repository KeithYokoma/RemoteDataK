plugins {
    kotlin("jvm")

    id("org.junit.platform.gradle.plugin")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin(Dependencies.kotlin, Version.kotlin))

    // assertion
    testImplementation(TestDependencies.kluent)

    //spek2
    testImplementation(TestDependencies.spek)
    testRuntimeOnly(TestDependencies.spekRunner)
}
