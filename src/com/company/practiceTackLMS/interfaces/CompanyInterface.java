package com.company.practiceTackLMS.interfaces;

import com.company.practiceTackLMS.Company;
import com.company.practiceTackLMS.DataBase;
import com.company.practiceTackLMS.request.CompanyRequest;

public interface CompanyInterface {

    Company addCompany(CompanyRequest request);

    Company updateCompanyName(DataBase dataBase, String oldName, String newName);
}
