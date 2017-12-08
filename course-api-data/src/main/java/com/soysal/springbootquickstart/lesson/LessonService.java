package com.soysal.springbootquickstart.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	private LessonRepository lessonRepository;
	
	public List<Lesson> getAllLessons(String courseId) {
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findByCourseId(courseId)
		.forEach(lessons::add);
		return lessons;
	}
	
	public Lesson getLesson(String id) {
		return lessonRepository.findOne(id);
	}

	public void addLesson(Lesson course) {
		lessonRepository.save(course);
	}

	public void updateLesson(Lesson course) {
		lessonRepository.save(course);
	}

	public void deleteLesson(String id) {
		lessonRepository.delete(id);
	}

}
