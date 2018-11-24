
package com.example.helderrocha.routesail.models;


import com.squareup.moshi.Json;

public class CreatedByAdmin {

    @Json(name= "userId")

    private String userId;
    @Json(name= "loginEmail")

    private String loginEmail;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

}
