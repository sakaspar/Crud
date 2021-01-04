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

    public Bag() {
    }

    public Bag(long bagweight, String bagDescription) {
        this.bagweight = bagweight;
        this.bagDescription = bagDescription;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + BagId +
                ", employeeName='" + bagweight + '\'' +
                ", employeeDescription='" + bagDescription + '\'' +
                '}';
    }
}
