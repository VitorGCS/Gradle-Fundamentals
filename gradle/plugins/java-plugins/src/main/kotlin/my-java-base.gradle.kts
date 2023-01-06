import org.gradle.jvm.toolchain.JavaLanguageVersion

plugins{
    id("java")
    id("com.diffplug.spotless") // comunity plugins, ex. https://plugins.gradle.org/
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}