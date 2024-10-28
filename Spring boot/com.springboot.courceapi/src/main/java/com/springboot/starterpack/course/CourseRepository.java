package com.springboot.starterpack.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// public List<Course> findByTopicId(String topicId);

	public Iterable<Course> findByTopicId(String topicId);
}
