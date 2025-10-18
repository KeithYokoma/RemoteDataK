plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    kotlin("kapt")
}

android {
    compileSdkVersion(AndroidConfig.compileSdkVersion)

    namespace = "com.mercari.remotedata.android.sample"
    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)

        applicationId = "com.mercari.remotedata.android.sample"
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":remotedata_android"))
    implementation(kotlin(Dependencies.kotlin, Version.kotlin))
    implementation(Dependencies.rxjava)
    implementation(Dependencies.rxandroid)
    implementation(Dependencies.androidAppCompat)
    implementation(Dependencies.androidFragment)
    implementation(Dependencies.androidConstraintLayout)
    implementation(Dependencies.androidLifecycle)
    implementation(Dependencies.androidLiveData)
    implementation(Dependencies.androidSavedState)
    kapt(Dependencies.androidLifecycleCompiler)
    testImplementation(TestDependencies.junit4)
    testImplementation(TestDependencies.roboletric)
}
