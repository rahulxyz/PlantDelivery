package com.udacity.multitierArch.entity;

import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@NamedQuery(
        name="Delivery.findByName",
        query="select d from Delivery d where d.recipientName= :name"
)

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String recipientName;

    @Type(type="yes_no")
    private Boolean completed;

    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plantList;

    public Delivery(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Plant> getPlants() {
        return plantList;
    }

    public void setPlants(List<Plant> plantList) {
        this.plantList = plantList;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
