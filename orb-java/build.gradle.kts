plugins {
    id("orb.kotlin")
    id("orb.publish")
}

dependencies {
    api(project(":orb-java-client-okhttp"))
}
