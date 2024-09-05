pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion apply false
    }
}

rootProject.name = "ot-mp-202408"

include("m1l1-first")
