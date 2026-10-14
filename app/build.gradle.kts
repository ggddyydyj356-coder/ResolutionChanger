plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.resolutionchanger"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.resolutionchanger"
        minSdk = 26
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
}
