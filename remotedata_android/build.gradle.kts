plugins {
    id("com.android.library")
    id("kotlin-android")
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

    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}
