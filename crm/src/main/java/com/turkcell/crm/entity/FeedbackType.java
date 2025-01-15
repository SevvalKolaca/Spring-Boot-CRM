package com.turkcell.crm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity // bir orm entitysi olduğunu belirtir yani bir tablo demek
@Table(name = "feedback_types")
public class FeedbackType {

    @Id // primary key olarak işaretledik
    @GeneratedValue(strategy = GenerationType.IDENTITY) // otomatik olarak oluştuulan id demek
    @Column(name="id") // tablodaki sütun adı ile  koddaki değişken aynıysa sütun adı belirtmeye gerek kalmaz
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "feedbackType")
    @JsonIgnore
    private List<Feedback> feedbacks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}
