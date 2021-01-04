package com.viraj.sample.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bag")
public class Bag {

    @Id
    @Column(name = "Bag_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long BagId;

    @Column(name = "Bag_weight")
    private long bagweight;

    @Column(name = "Bag_DESCRIPTION")
    private String bagDescription;

    @Column(name = "Bag_check")
    private String bagCheck;

    public Bag() {
    }

    public Bag(long bagweight, String bagDescription,String bagCheck) {
        this.bagweight = bagweight;
        this.bagDescription = bagDescription;
        this.bagCheck = bagCheck ; 
    }

    public long getbagweight() {
        return bagweight;
    }

    public void setbagweight(long x) {
        this.bagweight = x;
    }

    public String getbagDescription() {
        return bagDescription;
    }

    public void setbagDescription(String bagDescription) {
        this.bagDescription = bagDescription;
    }


    public String getbagCheck() {
        return bagCheck;
    }

    public void setgetbagCheck(String bagCheck) {
        this.bagCheck = bagCheck;
    }


    @Override
    public String toString() {
        return "Bag{" +
                "bagId=" + BagId +
                ", bagweight='" + bagweight + '\'' +
                ", bagDescription='" + bagDescription + '\'' +
                ", bagCheck='" + bagCheck + '\'' +
                '}';
    }
}
