package com.vega.springit.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    //link
    @ManyToOne
    @NotNull
    private Link link;


}
