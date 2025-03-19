package com.example.demo.student_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Reminder {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
}
