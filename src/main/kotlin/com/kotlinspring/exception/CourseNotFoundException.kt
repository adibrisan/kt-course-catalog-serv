package com.kotlinspring.exception

class CourseNotFoundException(message: String) : RuntimeException(message)
// in java, it would look like

//public class CourseNotFoundException extends RuntimeException {
//    public CourseNotFoundException(String message) {
//        super(message);
//    }
//}
