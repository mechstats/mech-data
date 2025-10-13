plugins {
    kotlin("jvm")
    application
}

tasks.register<Zip>("createZip") {
    archiveFileName.set("mech-data.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))

    from("./latest/")
}

tasks.findByName("build")?.dependsOn("createZip")