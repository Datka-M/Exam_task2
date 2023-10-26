package com.company.practiceTackLMS;

public class DataBase {

    private Company[] companies;

    public DataBase(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
}
