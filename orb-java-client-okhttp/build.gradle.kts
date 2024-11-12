plugins {
    id("orb.kotlin")
    id("orb.publish")
}

dependencies {
    api(project(":orb-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
}
