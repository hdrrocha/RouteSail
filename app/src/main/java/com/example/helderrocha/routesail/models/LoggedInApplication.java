
package com.example.helderrocha.routesail.models;

import com.squareup.moshi.Json;

public class LoggedInApplication {

   @Json(name= "id")

    private String id;
   @Json(name= "name")

    private String name;
   @Json(name= "type")

    private String type;
   @Json(name= "activity")

    private String activity;
   @Json(name= "ownerId")
    private String ownerId;
   @Json(name= "ownerEmail")
    private String ownerEmail;
   @Json(name= "dateOfCreation")
    private String dateOfCreation;
   @Json(name= "env")
    private String env;
   @Json(name= "state")
    private String state;
   @Json(name= "platform")
    private String platform;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
