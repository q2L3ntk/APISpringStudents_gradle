package ru.students.springstudents_gradle.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.students.springstudents_gradle.model.Student

@RestController
@RequestMapping("/api/v1/students")
class StudentController {
    @GetMapping
    fun findAllStudent(): List<Student> {
        return listOf(
            Student().setFirstName("John").setEmail("john@gmail.com").setAge(41),
            Student().setFirstName("Freddy").setEmail("freddy@gmail.com").setAge(36),
            Student().setFirstName("Anna").setEmail("anna@yandex.ru").setAge(28)
        )
    }
}