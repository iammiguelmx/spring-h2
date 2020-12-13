package com.mx.macc.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="tasks")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Getter @Setter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private Integer status;

    @Getter @Setter
    @Column(name="creation_date")
    private Date creationDate;

}