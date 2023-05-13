@file:Suppress("UnstableApiUsage")

// The project can successfully build by removing below line.
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "gradle-typesafe-accessors-bug"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

includeBuild("ATestModule") {
    dependencySubstitution {
        substitute(module("com.example:ATestModule")).using(project(":atestmodule"))
    }
}
