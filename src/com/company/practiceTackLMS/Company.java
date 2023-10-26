package com.company.practiceTackLMS;

import java.time.LocalDate;

public class Company {

    private String name;
    private LocalDate foundedYear;
    private String locationCountry;
    private LocalDate registeredDate;
    private Course[] courses;
    private Instructor[] instructors;

    public Company(String name, LocalDate foundedYear, String locationCountry, LocalDate registeredDate) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.locationCountry = locationCountry;
        this.registeredDate = registeredDate;
    }

    public Company(String name, LocalDate foundedYear, String locationCountry, LocalDate registeredDate, Course[] courses, Instructor[] instructors) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.locationCountry = locationCountry;
        this.registeredDate = registeredDate;
        this.courses = courses;
        this.instructors = instructors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(LocalDate foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }
}
