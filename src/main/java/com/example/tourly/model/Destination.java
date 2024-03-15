package com.example.tourly.model;


import jakarta.persistence.*;

@Entity
public class Destination {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String description;
    private String imageLink;
    private String imageLink1;
    private String imageLink2;
    private String imageLink3;
    private String imageLink4;
    private String imageLink5;
    @Column(unique = true)
    private String locationName;
    private String district;
    private String mapLink;
    private String otherDetails;  //like weather



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setDescription(String description) {

        this.description = description;
    }
    public String getDescription() {

        return description;
    }
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public void setLocationName(String locationName){

        this.locationName=locationName;

    }
    public String getLocationName() {
        return locationName;
    }


    public String getMapLink() {

        return mapLink;
    }

    public void setMapLink(String mapLink) {

        this.mapLink = mapLink;
    }


    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getImageLink1() {
        return imageLink1;
    }

    public void setImageLink1(String imageLink1) {
        this.imageLink1 = imageLink1;
    }

    public String getImageLink2() {
        return imageLink2;
    }

    public void setImageLink2(String imageLink2) {
        this.imageLink2 = imageLink2;
    }

    public String getImageLink3() {
        return imageLink3;
    }

    public void setImageLink3(String imageLink3) {
        this.imageLink3 = imageLink3;
    }

    public String getImageLink4() {
        return imageLink4;
    }

    public void setImageLink4(String imageLink4) {
        this.imageLink4 = imageLink4;
    }

    public String getImageLink5() {
        return imageLink5;
    }

    public void setImageLink5(String imageLink5) {
        this.imageLink5 = imageLink5;
    }
}

