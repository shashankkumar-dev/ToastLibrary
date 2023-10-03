pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/vylhart/Analytics")
            credentials {
                username = "Shashank Kumar"
                password = "***"
            }
        }
    }
}

rootProject.name = "ToastLibrary"
include(":app")
include(":mylibrary")
