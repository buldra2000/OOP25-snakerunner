plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    //JUnit API
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
}

application {
    val main: String? by project
    mainClass.set(main ?: "snakerunner.core.Main")
}

/*
sourceSets {
    val main by getting {
        java {
            setSrcDirs(listOf("src/main/java"))
        }
        resources {
            setSrcDirs(listOf("src/main/resources"))
        }
    }

    val test by getting {
        java {
            setSrcDirs(listOf("src/test/java"))
        }
        resources {
            setSrcDirs(listOf("src/test/resources"))
        }
    }

}
*/

tasks.withType<Test> {
    useJUnitPlatform()
}

