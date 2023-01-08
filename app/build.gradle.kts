plugins {
    // Adds functionality for packaging and running java applications
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}
/*
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}*/
