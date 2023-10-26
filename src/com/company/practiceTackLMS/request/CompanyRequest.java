package com.company.practiceTackLMS.request;

import java.time.LocalDate;

public class CompanyRequest {

    private String name;
    private LocalDate foundedDate;
    private String locationCountry;
    private LocalDate registeredDate;

    public CompanyRequest(String name, LocalDate foundedDate, String locationCountry, LocalDate registeredDate) {
        this.name = name;
        this.foundedDate = foundedDate;
        this.locationCountry = locationCountry;
        this.registeredDate = registeredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(LocalDate foundedDate) {
        this.foundedDate = foundedDate;
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
}
