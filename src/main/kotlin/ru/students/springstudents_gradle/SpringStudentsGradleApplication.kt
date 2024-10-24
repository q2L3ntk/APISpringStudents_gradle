package ru.students.springstudents_gradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringstudentsGradleApplication

fun main(args: Array<String>) {
	runApplication<SpringstudentsGradleApplication>(*args)
}
