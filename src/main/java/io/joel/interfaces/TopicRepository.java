package io.joel.interfaces;

import io.joel.models.Topic;

import java.util.List;

public interface TopicRepository {
    List<Topic> findAll();
    void add(String title, String description);
}
