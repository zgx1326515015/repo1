package com.itcast.domain;

/**
 * @Auther:bn
 * @Date:2019/11/2619:21
 */
public class Address {
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
