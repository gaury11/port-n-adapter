import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	val kotlinVersion = "1.8.20"

	id("org.springframework.boot") version "3.0.5"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version kotlinVersion
	kotlin("kapt") version kotlinVersion
	kotlin("plugin.spring") version kotlinVersion
	kotlin("plugin.jpa") version kotlinVersion
	kotlin("plugin.allopen") version kotlinVersion
}

group = "com.soon.study"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("reflect"))
	implementation(kotlin("stdlib"))
	implementation(kotlin("stdlib-jdk8"))

	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	runtimeOnly("com.h2database:h2")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

allOpen {
	annotation("javax.persistence.Entity")
	annotation("javax.persistence.Embeddable")
	annotation("javax.persistence.MappedSuperclass")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
