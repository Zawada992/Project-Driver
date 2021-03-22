package pl.driver.driver.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Advice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String attachedFile;
    private LocalDate dateOfPublic;
    private LocalTime timeOfPublic;

    @OneToMany
    private List<Question> questions;

}
