package com.udacity.multitierArch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shrub extends Plant{

    private Double height;
    private Double width;

}
