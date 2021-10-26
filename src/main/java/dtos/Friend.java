package dtos;

import lombok.Data;

import java.util.List;

@Data
public class Friend {

    private String firstname;
    private String lastname;
    private String id;
    private String age;
    private List<Address> Address;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}