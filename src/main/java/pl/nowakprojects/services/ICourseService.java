package pl.nowakprojects.services;

import pl.nowakprojects.model.Course;

import java.util.List;

/**
 * Created by Mateusz on 08.04.2017.
 */


public interface ICourseService {
    List<Course> getAllCourses(String id);
    Course getCourse(String id);
    void addCourse(Course course);
    void updateCourse(String id, Course course);
    void deleteCourse(String id);
}
