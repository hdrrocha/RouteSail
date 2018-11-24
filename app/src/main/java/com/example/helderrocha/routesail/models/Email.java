
package com.example.helderrocha.routesail.models;


import com.squareup.moshi.Json;

public class Email {

    @Json(name= "email")
    private String email;

    @Json(name= "type")
    private String type;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
