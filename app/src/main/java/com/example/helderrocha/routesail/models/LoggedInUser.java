
package com.example.helderrocha.routesail.models;

import java.util.List;
import com.squareup.moshi.Json;

public class LoggedInUser {
    
    @Json( name = "id")
    public String id;
    
    @Json( name = "loginEmail")
    public String loginEmail;
    
    @Json( name = "firstName")
    public String firstName;
    
    @Json( name = "lastName")
    public String lastName;
    
    @Json( name = "displayName")
    public String displayName;
    
    @Json( name = "nickName")
    public String nickName;
    
    @Json( name = "title")
    public String title;
    
    @Json( name = "jobTitle")
    public String jobTitle;
    
    @Json( name = "emails")
    public List<Email> emails = null;
    
    @Json( name = "phoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;
    
    @Json( name = "country")
    public String country;
    
    @Json( name = "language")
    public String language;
    
    @Json( name = "timezone")
    public String timezone;
    
    @Json( name = "jid_im")
    public String jidIm;
    
    @Json( name = "jid_tel")
    public String jidTel;
    
    @Json( name = "jid_password")
    public String jidPassword;
    
    @Json( name = "roles")
    public List<String> roles = null;
    
    @Json( name = "adminType")
    public String adminType;
    
    @Json( name = "companyId")
    public String companyId;
    
    @Json( name = "companyName")
    public String companyName;
    
    @Json( name = "isInDefaultCompany")
    public boolean isInDefaultCompany;
    
    @Json( name = "organisationId")
    public Object organisationId;
    
    @Json( name = "siteId")
    public Object siteId;
    
    @Json( name = "isActive")
    public boolean isActive;
    
    @Json( name = "isInitialized")
    public boolean isInitialized;
    
    @Json( name = "initializationDate")
    public String initializationDate;
    
    @Json( name = "activationDate")
    public String activationDate;
    
    @Json( name = "creationDate")
    public String creationDate;
    
    @Json( name = "lastUpdateDate")
    public String lastUpdateDate;
    
    @Json( name = "lastAvatarUpdateDate")
    public String lastAvatarUpdateDate;
    
    @Json( name = "createdBySelfRegister")
    public boolean createdBySelfRegister;
    @Json( name = "createdByAdmin")
  
    public CreatedByAdmin createdByAdmin;
    @Json( name = "invitedBy")
  
    public InvitedBy invitedBy;
    @Json( name = "firstLoginDate")
  
    public String firstLoginDate;
    @Json( name = "lastLoginDate")
  
    public String lastLoginDate;
    @Json( name = "loggedSince")
  
    public String loggedSince;
    @Json( name = "isTerminated")
  
    public boolean isTerminated;
    @Json( name = "guestMode")
  
    public boolean guestMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @Json( name = "loginEmail")
    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getJidIm() {
        return jidIm;
    }

    public void setJidIm(String jidIm) {
        this.jidIm = jidIm;
    }

    public String getJidTel() {
        return jidTel;
    }

    public void setJidTel(String jidTel) {
        this.jidTel = jidTel;
    }

    public String getJidPassword() {
        return jidPassword;
    }

    public void setJidPassword(String jidPassword) {
        this.jidPassword = jidPassword;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isIsInDefaultCompany() {
        return isInDefaultCompany;
    }

    public void setIsInDefaultCompany(boolean isInDefaultCompany) {
        this.isInDefaultCompany = isInDefaultCompany;
    }

    public Object getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Object organisationId) {
        this.organisationId = organisationId;
    }

    public Object getSiteId() {
        return siteId;
    }

    public void setSiteId(Object siteId) {
        this.siteId = siteId;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsInitialized() {
        return isInitialized;
    }

    public void setIsInitialized(boolean isInitialized) {
        this.isInitialized = isInitialized;
    }

    public String getInitializationDate() {
        return initializationDate;
    }

    public void setInitializationDate(String initializationDate) {
        this.initializationDate = initializationDate;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastAvatarUpdateDate() {
        return lastAvatarUpdateDate;
    }

    public void setLastAvatarUpdateDate(String lastAvatarUpdateDate) {
        this.lastAvatarUpdateDate = lastAvatarUpdateDate;
    }

    public boolean isCreatedBySelfRegister() {
        return createdBySelfRegister;
    }

    public void setCreatedBySelfRegister(boolean createdBySelfRegister) {
        this.createdBySelfRegister = createdBySelfRegister;
    }

    public CreatedByAdmin getCreatedByAdmin() {
        return createdByAdmin;
    }

    public void setCreatedByAdmin(CreatedByAdmin createdByAdmin) {
        this.createdByAdmin = createdByAdmin;
    }

    public InvitedBy getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(InvitedBy invitedBy) {
        this.invitedBy = invitedBy;
    }

    public String getFirstLoginDate() {
        return firstLoginDate;
    }

    public void setFirstLoginDate(String firstLoginDate) {
        this.firstLoginDate = firstLoginDate;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLoggedSince() {
        return loggedSince;
    }

    public void setLoggedSince(String loggedSince) {
        this.loggedSince = loggedSince;
    }

    public boolean isIsTerminated() {
        return isTerminated;
    }

    public void setIsTerminated(boolean isTerminated) {
        this.isTerminated = isTerminated;
    }

    public boolean isGuestMode() {
        return guestMode;
    }

    public void setGuestMode(boolean guestMode) {
        this.guestMode = guestMode;
    }

}
