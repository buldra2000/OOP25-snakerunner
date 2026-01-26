plugins {
    java
    application
}

repositories {
    mavenCentral()
}

application {
    val main: String? by project
    //mainClass.set(main ?: "snakerunner.audio.AudioTest")
    mainClass.set(main ?: "snakerunner.core.Main")
}

sourceSets {
    val main by getting {
        java {
            setSrcDirs(listOf("src/main/java"))
        }
        resources {
            setSrcDirs(listOf("src/main/resources"))
        }
    }
}
