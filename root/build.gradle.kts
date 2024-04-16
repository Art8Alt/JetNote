plugins {
    alias(libs.plugins.cityzouitel.androidLibrary)
}

android {
    namespace = "city.zouitel.root"
}

dependencies {
    implementation(projects.domain)
}