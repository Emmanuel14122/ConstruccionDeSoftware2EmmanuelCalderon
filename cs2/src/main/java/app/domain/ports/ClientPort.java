package app.domain.ports;

import java.util.List;
import java.util.Optional;


import app.domain.models.CompanyClient;
import app.domain.models.NaturalPersonClient;

public interface ClientPort {

    Optional<NaturalPersonClient> findNaturalPersonByDocument(String identification);

    List<NaturalPersonClient> findAllNaturalPersons();


    Optional<CompanyClient> findCompanyByNit(String nit);

    List<CompanyClient> findAllCompanies();


    boolean existsNaturalPersonByDocument(String identification);

    boolean existsCompanyByNit(String nit);

    boolean existsByEmail(String email);


    void saveNaturalPerson(NaturalPersonClient client);

    void updateNaturalPerson(NaturalPersonClient client);

    void deleteNaturalPersonByDocument(String identification);


    void saveCompany(CompanyClient company);

    void updateCompany(CompanyClient company);

    void deleteCompanyByNit(String nit);
}
