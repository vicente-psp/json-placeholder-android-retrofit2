package br.com.student.json_placeholder_android_retrofit2.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by bruno on 28/09/18.
 */

/**
 * @link https://stackoverflow.com/questions/44948858/lombok-builder-on-a-class-that-extends-another-class
 * @link https://blog.codecentric.de/en/2016/05/reducing-boilerplate-code-project-lombok/
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class User extends DefaultModel {

    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Builder
    public User(String name, String username, String email, Address address,
                String phone, String website, Company company, Integer id){
        super(id);
        this.username = username;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
}
