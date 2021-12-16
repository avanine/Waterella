package com.waterella.mdbspringboot.model;

import org.springframework.data.annotation.Id;

public class ReadingTip {
    @Id
    private String name;
    private String category;
    private String description;

    public ReadingTip() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemDescription() {
        return description;
    }

    public void setItemDescription(String description) {
        this.description = description;
    }
}
