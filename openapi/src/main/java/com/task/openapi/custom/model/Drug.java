package com.task.openapi.custom.model;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * Drug
 */

@Entity
@Table(name = "drug")
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID drugId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "national_drug_code", nullable = false)
    private Integer nationalDrugCode;

    @Column(name = "description", nullable = false)
    private String description;

    public Drug(String name, Integer nationalDrugCode, String description) {
        this.name = name;
        this.nationalDrugCode = nationalDrugCode;
        this.description = description;
    }

    public UUID getDrugId() {
        return drugId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNationalDrugCode() {
        return nationalDrugCode;
    }

    public void setNationalDrugCode(Integer nationalDrugCode) {
        this.nationalDrugCode = nationalDrugCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
