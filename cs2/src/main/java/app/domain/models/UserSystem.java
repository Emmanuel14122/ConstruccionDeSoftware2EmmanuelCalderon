package app.domain.models;

import java.sql.Date;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public abstract class UserSystem {

    private int Id_User;
    private String Id_Related;
    private String Full_Name;
    private String Id_Identification;
    private String Email;
    private String Phone;
    private Date birthDate;
    private String Address;
    private String System_Role;
    private String User_Status;

}
