plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
}

android {
    compileSdkVersion(AndroidConfig.compileSdkVersion)

    defaultConfig {
        minSdkVersion(AndroidConfig.minSdkVersion)
        targetSdkVersion(AndroidConfig.targetSdkVersion)

        applicationId = "com.mercari.remotedata.android.sample"
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
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
