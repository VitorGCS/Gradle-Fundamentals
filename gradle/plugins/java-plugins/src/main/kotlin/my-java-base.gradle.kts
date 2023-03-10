import org.gradle.jvm.toolchain.JavaLanguageVersion

plugins{
    id("java")
    id("com.diffplug.spotless") // comunity plugins, ex. https://plugins.gradle.org/
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.withType<JavaCompile>().configureEach{
    options.encoding="UTF-8"
}

tasks.compileJava{

}

tasks.compileTestJava{

}

tasks.test {

}
