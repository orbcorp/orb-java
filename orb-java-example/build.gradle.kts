plugins {
    id("orb.kotlin")
    id("java")
    application
}

dependencies {
    implementation(project(":orb-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.withorb.api.example.Main"
}