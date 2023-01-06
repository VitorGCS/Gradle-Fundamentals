pluginManagement {
    repositories.gradlePluginPortal()
/*    repositories.mavenCentral()
    repositories.google()
    repositories.maven("http://my.location/repo"){
        credentials.username = "..."
        credentials.password = "..."
    }
 */
    includeBuild("gradle/plugins")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
/*    repositories.google()
    repositories.maven("http://my.location/repo") {
        credentials.username = "..."
        credentials.password = "..."
    }

    includeBuild("../my-other-project")*/
}

rootProject.name = "My Gradle project"

include("app")
include("business-logic")
include("data-model")