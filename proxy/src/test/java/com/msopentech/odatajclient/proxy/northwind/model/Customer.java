/*
 * Copyright 2013 MS OpenTech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.msopentech.odatajclient.proxy.northwind.model;

import com.msopentech.odatajclient.proxy.api.EntityType;
import com.msopentech.odatajclient.proxy.api.Key;
import com.msopentech.odatajclient.proxy.api.NavigationProperty;
import com.msopentech.odatajclient.proxy.api.Property;
import java.io.Serializable;
import java.util.List;

@EntityType("Customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -2579667626547045122L;

    @Key
    @Property(name = "CustomerID", type = "Edm.String", nullable = false)
    private String customerID;

    @Property(name = "CompanyName", type = "Edm.String", nullable = false)
    private String companyName;

    @Property(name = "ContactName", type = "Edm.String", nullable = true)
    private String contactName;

    @Property(name = "ContactTitle", type = "Edm.String", nullable = true)
    private String contactTitle;

    @Property(name = "Address", type = "Edm.String", nullable = true)
    private String address;

    @Property(name = "City", type = "Edm.String", nullable = true)
    private String city;

    @Property(name = "Region", type = "Edm.String", nullable = true)
    private String region;

    @Property(name = "PostalCode", type = "Edm.String", nullable = true)
    private String postalCode;

    @Property(name = "Country", type = "Edm.String", nullable = true)
    private String country;

    @Property(name = "Phone", type = "Edm.String", nullable = true)
    private String phone;

    @Property(name = "Fax", type = "Edm.String", nullable = true)
    private String fax;

    @NavigationProperty(name = "Orders", relationship = "NorthwindModel.FK_Orders_Customers",
            fromRole = "Customers", toRole = "Orders")
    private List<Order> orders;

    @NavigationProperty(name = "CustomerDemographics", relationship = "NorthwindModel.CustomerCustomerDemo",
            fromRole = "Customers", toRole = "CustomerDemographics")
    private List<CustomerDemographic> customerDemographics;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<CustomerDemographic> getCustomerDemographics() {
        return customerDemographics;
    }

    public void setCustomerDemographics(List<CustomerDemographic> customerDemographics) {
        this.customerDemographics = customerDemographics;
    }
}