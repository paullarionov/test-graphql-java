plugins {
    id("java")
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:15.1.0")
    implementation("com.graphql-java-kickstart:graphql-java-tools:13.1.1")
    implementation("com.graphql-java:graphql-java:21.3")

}

tasks.test {
    useJUnitPlatform()
}