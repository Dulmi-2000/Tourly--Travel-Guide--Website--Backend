package com.example.tourly.model;


import jakarta.persistence.*;

@Entity
public class Destination {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String description1;
    private  String description2;
    private  String description3;
    private  String description4;
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
    private  String ltopic1;
    private  String list1;
    private  String ltopic2;
    private  String list2;
    private  String ltopic3;
    private  String list3;
    private  String ltopic4;
    private  String list4;
    private  String ltopic5;
    private  String list5;
    private  String ltopic6;
    private  String list6;
    private  String ltopic7;
    private  String list7;
    private  String ltopic8;
    private  String list8;
    private  String ltopic9;
    private  String list9;
    private  String ltopic10;
    private  String list10;
    private  String date;
    private  String datedes1;
    private  String datedes2;
    private  String datedes3;
    private  String datedes4;
    private String otherDetails;  //like weather
    private String loctype;

    public String getLtopic1() {
        return ltopic1;
    }

    public void setLtopic1(String ltopic1) {
        this.ltopic1 = ltopic1;
    }

    public String getLtopic2() {
        return ltopic2;
    }

    public void setLtopic2(String ltopic2) {
        this.ltopic2 = ltopic2;
    }

    public String getLtopic3() {
        return ltopic3;
    }

    public void setLtopic3(String ltopic3) {
        this.ltopic3 = ltopic3;
    }

    public String getLtopic4() {
        return ltopic4;
    }

    public void setLtopic4(String ltopic4) {
        this.ltopic4 = ltopic4;
    }

    public String getLtopic5() {
        return ltopic5;
    }

    public void setLtopic5(String ltopic5) {
        this.ltopic5 = ltopic5;
    }

    public String getLtopic6() {
        return ltopic6;
    }

    public void setLtopic6(String ltopic6) {
        this.ltopic6 = ltopic6;
    }

    public String getLtopic7() {
        return ltopic7;
    }

    public void setLtopic7(String ltopic7) {
        this.ltopic7 = ltopic7;
    }

    public String getLtopic8() {
        return ltopic8;
    }

    public void setLtopic8(String ltopic8) {
        this.ltopic8 = ltopic8;
    }

    public String getLtopic9() {
        return ltopic9;
    }

    public void setLtopic9(String ltopic9) {
        this.ltopic9 = ltopic9;
    }

    public String getLtopic10() {
        return ltopic10;
    }

    public void setLtopic10(String ltopic10) {
        this.ltopic10 = ltopic10;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getList1() {
        return list1;
    }

    public void setList1(String list1) {
        this.list1 = list1;
    }

    public String getDatedes4() {
        return datedes4;
    }

    public void setDatedes4(String datedes4) {
        this.datedes4 = datedes4;
    }

    public String getList2() {
        return list2;
    }

    public void setList2(String list2) {
        this.list2 = list2;
    }

    public String getList3() {
        return list3;
    }

    public void setList3(String list3) {
        this.list3 = list3;
    }

    public String getList4() {
        return list4;
    }

    public void setList4(String list4) {
        this.list4 = list4;
    }

    public String getList5() {
        return list5;
    }

    public void setList5(String list5) {
        this.list5 = list5;
    }

    public String getList6() {
        return list6;
    }

    public void setList6(String list6) {
        this.list6 = list6;
    }

    public String getList7() {
        return list7;
    }

    public void setList7(String list7) {
        this.list7 = list7;
    }

    public String getList8() {
        return list8;
    }

    public void setList8(String list8) {
        this.list8 = list8;
    }

    public String getList9() {
        return list9;
    }

    public void setList9(String list9) {
        this.list9 = list9;
    }

    public String getList10() {
        return list10;
    }

    public void setList10(String list10) {
        this.list10 = list10;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDatedes1() {
        return datedes1;
    }

    public void setDatedes1(String datedes1) {
        this.datedes1 = datedes1;
    }

    public String getDatedes2() {
        return datedes2;
    }

    public void setDatedes2(String datedes2) {
        this.datedes2 = datedes2;
    }

    public String getDatedes3() {
        return datedes3;
    }

    public void setDatedes3(String datedes3) {
        this.datedes3 = datedes3;
    }

    public String getLoctype() {
        return loctype;
    }

    public void setLoctype(String loctype) {
        this.loctype = loctype;
    }
}

