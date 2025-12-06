package com.jspiders;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "audi")
public class Audi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//use Auto-Increment
    private Long id;
    @Column(name = "audi_name")
    private String name;

    @Column(name = "audi_seat_rows")
    private Integer seatRows;

    @Column(name = "audi_seat_columns")
    private Integer seatColumns;

    @OneToOne(cascade = CascadeType.ALL)//Type of Assc.
    @JoinColumn(name = "address_id")//Creates FK
    private AudiAddress audiAddress;

//    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)//Type of Assc.
//    @JoinColumn(name = "audi_id")//Creates FK
//    private List<Shows> shows=new ArrayList<>();
//
//    @OneToOne(cascade = CascadeType.ALL)//Type of Assc.
//    @JoinColumn(name = "audiProperty_id")//Creates FK
//    private AudiProperties audiProperties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(Integer seatRows) {
        this.seatRows = seatRows;
    }

    public Integer getSeatColumns() {
        return seatColumns;
    }

    public void setSeatColumns(Integer seatColumns) {
        this.seatColumns = seatColumns;
    }

    public AudiAddress getAudiAddress() {
        return audiAddress;
    }

    public void setAudiAddress(AudiAddress audiAddress) {
        this.audiAddress = audiAddress;
    }

//    public List<Shows> getShows() {
//        return shows;
//    }
//
//    public void setShows(List<Shows> shows) {
//        this.shows = shows;
//    }

    public String toString(){
        return this.id+" "+this.name+" "+this.seatRows+" "+this.seatColumns+" "+this.audiAddress.getId()+" "+this.audiAddress.getStreetName()+" "+
                this.audiAddress.getArea()+" "+this.audiAddress.getCity()+" "+this.audiAddress.getPinCode();
    }

//    public AudiProperties getAudiProperties() {
//        return audiProperties;
//    }
//
//    public void setAudiProperties(AudiProperties audiProperties) {
//        this.audiProperties = audiProperties;
//    }
}