package iitu.edu.wmelonback.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

/**
 * @author Ulan
 * @date 9/6/2022
 */

@Entity
@Table(name = "melon", schema = "products")
public class Melon {

    @Id
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "color")
    private String color;

    @Column(name = "location")
    private String location;

    @Column(name = "count")
    private Integer count;

    @Column(name = "image")
    private String image;

    @Column(name = "planting_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MMdd")
    private Date plantingDate;

    @Column(name = "maturation_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MMdd")
    private Date maturationDate;

    public Melon() {
    }

    public Melon(Long id, String type, String color, String location, Integer count, String image, Date plantingDate, Date maturationDate) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.location = location;
        this.count = count;
        this.image = image;
        this.plantingDate = plantingDate;
        this.maturationDate = maturationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(Date plantingDate) {
        this.plantingDate = plantingDate;
    }

    public Date getMaturationDate() {
        return maturationDate;
    }

    public void setMaturationDate(Date maturationDate) {
        this.maturationDate = maturationDate;
    }
}
