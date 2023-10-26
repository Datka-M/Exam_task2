package com.company.practiceTackLMS.interfaces;

import com.company.practiceTackLMS.Course;
import com.company.practiceTackLMS.DataBase;

public interface CourseInterface {

    Course addCourseToCompany(DataBase dataBase, String companyName, Course course);

    Course updateCourseName(String courseName);

    void deleteCourse(String courseName);
}
