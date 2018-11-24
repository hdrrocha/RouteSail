
package com.example.helderrocha.routesail.models;


import com.squareup.moshi.Json;

public class PhoneNumber {

    @Json(name= "shortNumber")
    private String shortNumber;

    @Json(name= "pbxId")
    private String pbxId;

    @Json(name= "country")
    private Object systemId;
    
    @Json(name= "country")
    private String country;

    @Json(name= "number")
    private String number;
    @Json(name= "numberE164")

    private String numberE164;
    @Json(name= "phoneNumberId")

    private String phoneNumberId;
    @Json(name= "isMonitored")

    private boolean isMonitored;
    @Json(name= "isFromSystem")
    private boolean isFromSystem;
    @Json(name= "deviceType")

    private String deviceType;
    @Json(name= "type")

    private String type;

    public String getShortNumber() {
        return shortNumber;
    }

    public void setShortNumber(String shortNumber) {
        this.shortNumber = shortNumber;
    }

    public String getPbxId() {
        return pbxId;
    }

    public void setPbxId(String pbxId) {
        this.pbxId = pbxId;
    }

    public Object getSystemId() {
        return systemId;
    }

    public void setSystemId(Object systemId) {
        this.systemId = systemId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberE164() {
        return numberE164;
    }

    public void setNumberE164(String numberE164) {
        this.numberE164 = numberE164;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public boolean isIsMonitored() {
        return isMonitored;
    }

    public void setIsMonitored(boolean isMonitored) {
        this.isMonitored = isMonitored;
    }

    public boolean isIsFromSystem() {
        return isFromSystem;
    }

    public void setIsFromSystem(boolean isFromSystem) {
        this.isFromSystem = isFromSystem;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
