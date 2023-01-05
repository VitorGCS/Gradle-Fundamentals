plugins {
    // Adds functionality for packaging and running java applications
    id("application")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}