
package com.example.helderrocha.routesail.models;

import com.squareup.moshi.Json;

public class InvitedBy {

    @Json(name= "invitationId")
    private String invitationId;

    @Json(name= "invitationDate")
    private String invitationDate;

    @Json(name= "userId")
    private String userId;

    @Json(name= "loginEmail")
    private String loginEmail;

    public String getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    public String getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(String invitationDate) {
        this.invitationDate = invitationDate;
    }

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
