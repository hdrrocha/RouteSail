
package com.example.helderrocha.routesail.models;


import com.squareup.moshi.Json;

public class User {

   @Json(name= "token")
    private String token;

   @Json(name= "loggedInUser")
    private LoggedInUser loggedInUser;

   @Json(name= "loggedInApplication")
    private LoggedInApplication loggedInApplication;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoggedInUser getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(LoggedInUser loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public LoggedInApplication getLoggedInApplication() {
        return loggedInApplication;
    }

    public void setLoggedInApplication(LoggedInApplication loggedInApplication) {
        this.loggedInApplication = loggedInApplication;
    }

}
