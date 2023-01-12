// plugins that only reconfigure existing plugins are typically called 'convention plugins'
plugins {
    id("application")
    id("my-java-base")
}

//java {
//    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
//}

tasks.register<Zip>("bundle"){
    group = "My Group"
    description = "package it all"

    from(tasks.jar)
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}