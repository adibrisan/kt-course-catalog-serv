package com.kotlinspring.service

import com.kotlinspring.dto.CourseDTO
import com.kotlinspring.dto.InstructorDTO
import com.kotlinspring.entity.Instructor
import com.kotlinspring.repository.InstructorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class InstructorService(val instructorRepository: InstructorRepository) {
    fun createInstructor(instructorDTO: InstructorDTO): InstructorDTO {
        val instructorEntity = instructorDTO.let{
            Instructor(null,it.name)
        }

        instructorRepository.save(instructorEntity)

        return instructorEntity.let{
            InstructorDTO(it.id,it.name)
        }
    }

    fun findByInstructorId(instructorId: Int): Optional<Instructor> {
       return instructorRepository.findById(instructorId)
    }

}
