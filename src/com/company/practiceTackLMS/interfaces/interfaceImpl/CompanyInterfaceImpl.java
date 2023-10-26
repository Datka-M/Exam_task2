package com.company.practiceTackLMS.interfaces.interfaceImpl;

import com.company.practiceTackLMS.Company;
import com.company.practiceTackLMS.DataBase;
import com.company.practiceTackLMS.interfaces.CompanyInterface;
import com.company.practiceTackLMS.request.CompanyRequest;

import java.time.LocalDate;

public class CompanyInterfaceImpl implements CompanyInterface {

    @Override
    public Company addCompany(CompanyRequest request) {
        Company company = new Company(request.getName(), LocalDate.of(2020, 12, 12), "KG", LocalDate.now());
        return company;
    }

    @Override
    public Company updateCompanyName(DataBase dataBase, String oldName, String newName) {
        for (Company c : dataBase.getCompanies()) {
            if (c.getName().equals(oldName)) {
                c.setName(newName);
                return c;
            }
        }
        return null;
    }
}
