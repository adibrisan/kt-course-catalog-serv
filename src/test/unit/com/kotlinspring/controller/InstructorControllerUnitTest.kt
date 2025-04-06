package com.kotlinspring.controller

import com.kotlinspring.dto.InstructorDTO
import com.kotlinspring.service.InstructorService
import com.kotlinspring.util.instructorEntity
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.reactive.server.WebTestClient

@WebMvcTest(controllers = [InstructorController::class])
@AutoConfigureWebTestClient
class InstructorControllerUnitTest {

    @Autowired
    lateinit var webTestClient: WebTestClient

    @MockkBean
    lateinit var instructorServiceMockk: InstructorService

//    @Test
//    fun addInstructor() {
//        val instructorDTO = InstructorDTO(null, "John Doe")
//        every { instructorServiceMockk.createInstructor(any()) } returns instructorEntity(id = 1)
//
//        val savedInstructorDTO = webTestClient
//            .post()
//            .uri("/v1/instructors")
//            .bodyValue(instructorDTO)
//            .exchange()
//            .expectStatus().isCreated
//            .expectBody(InstructorDTO::class.java)
//            .returnResult()
//            .responseBody
//
//        Assertions.assertTrue {
//            savedInstructorDTO!!.id != null
//        }
//    }
}
