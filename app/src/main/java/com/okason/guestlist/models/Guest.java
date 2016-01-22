package com.okason.guestlist.models;

/**
 * Created by Valentine on 12/31/2015.
 */
public class Guest {
    private String Name;
    private String PhoneNumber;
    private String EmailAddress;
    private boolean IsCheckedIn;
    private String ProfileImagePath;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public boolean isCheckedIn() {
        return IsCheckedIn;
    }

    public void setIsCheckedIn(boolean isCheckedIn) {
        IsCheckedIn = isCheckedIn;
    }

    public String getProfileImagePath() {
        return ProfileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        ProfileImagePath = profileImagePath;
    }
}
