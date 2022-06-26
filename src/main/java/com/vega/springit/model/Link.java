package com.vega.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Link {
    @Id
    @GeneratedValue
    private long  id;
    @NonNull
    private long title;
    @NonNull
    private long url;



}
