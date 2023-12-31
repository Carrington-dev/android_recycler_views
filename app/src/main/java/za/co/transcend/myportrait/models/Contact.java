package za.co.transcend.myportrait.models;

import android.graphics.drawable.Drawable;

public class Contact {
    private String name, country, date;
    private int callIcon, infoIcon;

    public Contact(String name, String country, String date, int callIcon, int infoIcon) {
        this.name = name;
        this.country = country;
        this.date = date;
        this.callIcon = callIcon;
        this.infoIcon = infoIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCallIcon() {
        return callIcon;
    }

    public void setCallIcon(int callIcon) {
        this.callIcon = callIcon;
    }

    public int getInfoIcon() {
        return infoIcon;
    }

    public void setInfoIcon(int infoIcon) {
        this.infoIcon = infoIcon;
    }
}
