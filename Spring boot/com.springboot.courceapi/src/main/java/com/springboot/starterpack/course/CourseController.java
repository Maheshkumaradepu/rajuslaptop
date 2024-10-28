package com.springboot.starterpack.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.starterpack.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/topics/{topicid}/courses")
	public List<Course> getAllCourse(@PathVariable String topicid) {
		return courseService.getAllCourse(topicid);
	}

	@GetMapping("/topics/{topicid}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@PostMapping("/topics/{topicid}/course")
	public void addCourse(@RequestBody Course course, @PathVariable String topicid) {
		course.setTopic(new Topic(topicid, "", ""));
		courseService.addCourse(course);
	}

	@PutMapping("/topics/{topicid}/course/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicid, @PathVariable String id) {
		course.setTopic(new Topic(topicid, "", ""));
		courseService.updateCourse(course);
	}

	@DeleteMapping("/topics/{topicid}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
