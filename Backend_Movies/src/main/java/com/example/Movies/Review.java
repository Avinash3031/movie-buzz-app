package com.example.Movies;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
public class Review {

    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
