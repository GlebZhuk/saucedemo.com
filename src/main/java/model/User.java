package model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name = "standard_user";
   private String password = "secret_sauce";
    //создает переменные в среде jenkins, но локально код не заработает
    //private String name =System.getenv("name");
    //private String password =System.getenv("password");
    //private String name=System.getProperty("name");
    //private String password=System.getProperty("password");

}
