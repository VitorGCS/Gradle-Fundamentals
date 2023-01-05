plugins {
    //java-library
    id("java-library")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}