plugins {
    id("orb.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":orb-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :orb-java-example:run` to run `Main`
    // Use `./gradlew :orb-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.withorb.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
