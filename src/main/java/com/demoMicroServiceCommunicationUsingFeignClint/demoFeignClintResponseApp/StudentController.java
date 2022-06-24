package com.demoMicroServiceCommunicationUsingFeignClint.demoFeignClintResponseApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/microService2")
@RestController
public class StudentController {
    @PostMapping("/student/save")
    public Student save(Student student)
    {
        student.setFirstName("PRIOBRATA");
        student.setLastName("MALIK");
        return student;
    }
}
