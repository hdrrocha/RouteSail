
package com.example.helderrocha.routesail.models;

import java.util.List;
import com.squareup.moshi.Json;

public class LoggedInUser {
    
    @Json( name = "id")
    private String id;
    
    @Json( name = "loginEmail")
    private String loginEmail;
    
    @Json( name = "firstName")
    private String firstName;
    
    @Json( name = "lastName")
    private String lastName;
    
    @Json( name = "displayName")
    private String displayName;
    
    @Json( name = "nickName")
    private String nickName;
    
    @Json( name = "title")
    private String title;
    
    @Json( name = "jobTitle")
    private String jobTitle;
    
    @Json( name = "emails")
    private List<Email> emails = null;
    
    @Json( name = "phoneNumbers")
    private List<PhoneNumber> phoneNumbers = null;
    
    @Json( name = "country")
    private String country;
    
    @Json( name = "language")
    private String language;
    
    @Json( name = "timezone")
    private String timezone;
    
    @Json( name = "jid_im")
    private String jidIm;
    
    @Json( name = "jid_tel")
    private String jidTel;
    
    @Json( name = "jid_password")
    private String jidPassword;
    
    @Json( name = "roles")
    private List<String> roles = null;
    
    @Json( name = "adminType")
    private String adminType;
    
    @Json( name = "companyId")
    private String companyId;
    
    @Json( name = "companyName")
    private String companyName;
    
    @Json( name = "isInDefaultCompany")
    private boolean isInDefaultCompany;
    
    @Json( name = "organisationId")
    private Object organisationId;
    
    @Json( name = "siteId")
    private Object siteId;
    
    @Json( name = "isActive")
    private boolean isActive;
    
    @Json( name = "isInitialized")
    private boolean isInitialized;
    
    @Json( name = "initializationDate")
    private String initializationDate;
    
    @Json( name = "activationDate")
    private String activationDate;
    
    @Json( name = "creationDate")
    private String creationDate;
    
    @Json( name = "lastUpdateDate")
    private String lastUpdateDate;
    
    @Json( name = "lastAvatarUpdateDate")
    private String lastAvatarUpdateDate;
    
    @Json( name = "createdBySelfRegister")
    private boolean createdBySelfRegister;
    @Json( name = "createdByAdmin")
  
    private CreatedByAdmin createdByAdmin;
    @Json( name = "invitedBy")
  
    private InvitedBy invitedBy;
    @Json( name = "firstLoginDate")
  
    private String firstLoginDate;
    @Json( name = "lastLoginDate")
  
    private String lastLoginDate;
    @Json( name = "loggedSince")
  
    private String loggedSince;
    @Json( name = "isTerminated")
  
    private boolean isTerminated;
    @Json( name = "guestMode")
  
    private boolean guestMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Json( name = "loginEmail")
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
