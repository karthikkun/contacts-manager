package org.vishal.contactsmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "city")
    private String city;

    @Column(name = "postalCode")
    private String postalCode;

    public Address() {
    }

    public Address(String uuid, String city, String postalCode) {
        this.uuid = uuid;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "uuid='" + uuid + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
