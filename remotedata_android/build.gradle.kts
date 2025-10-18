plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("de.mannodermaus.android-junit5")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin(Dependencies.kotlin, Version.kotlin))

    // assertion
    testImplementation(TestDependencies.kluent)

    // Junit5
    testImplementation(TestDependencies.junitJupiter)
    testRuntimeOnly(TestDependencies.junitEngine)

    // Robolectric
    testImplementation(TestDependencies.junit4)
    testImplementation(TestDependencies.roboletric)

    //spek2
    testImplementation(TestDependencies.spek)
    testRuntimeOnly(TestDependencies.spekRunner)
}

android {
    compileSdkVersion(AndroidConfig.compileSdkVersion)

    namespace = "com.mercari.remotedata.android"
    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
