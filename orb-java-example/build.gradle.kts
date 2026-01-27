plugins {
    id("orb.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":orb-java-core"))
    implementation(project(":orb-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :orb-java-example:run` to run `Main`
    // Use `./gradlew :orb-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.withorb.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
