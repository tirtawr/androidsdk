package id.co.veritrans.sdk.models;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by chetan on 19/10/15.
 */
public class UserAddress implements Serializable {
    private String address;
    private String city;
    private String zipcode;
    private String country;
    private int addressType;

    public String getAddress() {
        return TextUtils.isEmpty(address) ? "" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return TextUtils.isEmpty(city) ? "" : city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return TextUtils.isEmpty(zipcode) ? "" : zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return TextUtils.isEmpty(country) ? "" : country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAddressType() {
        return addressType;
    }

    public void setAddressType(int addressType) {
        this.addressType = addressType;
    }
}
