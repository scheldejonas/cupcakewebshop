package com.cupcakes.webshop.model;

import com.cupcakes.webshop.web.Color;

import javax.persistence.*;

/**
 * Created by scheldejonas on 10/09/16.
 */
@Entity
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Color name;

    @Lob
    private byte[] image;
    private Color colorCode;

    public Topping() {
    }

    public Topping(Color name, byte[] image, Color colorCode) {
        this.name = name;
        this.image = image;
        this.colorCode = colorCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Color getName() {
        return name;
    }

    public void setName(Color name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Color getColorCode() {
        return colorCode;
    }

    public void setColorCode(Color colorCode) {
        this.colorCode = colorCode;
    }
}
