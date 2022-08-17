package com.mohsen.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String body;

    // link
    @ManyToOne
    private Link link;

    public Comment(@NonNull String body, Link link) {
        this.body = body;
        this.link = link;
    }
}
