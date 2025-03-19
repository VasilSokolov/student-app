package com.example.demo.student_app;

import com.example.demo.student_app.model.Reminder;
import com.example.demo.student_app.model.Task;
import com.example.demo.student_app.repository.ReminderRepo;
import com.example.demo.student_app.repository.TaskRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}


//	@Bean
//	public ApplicationRunner applicationRunner(TaskRepo taskRepo){
//		return args -> {
//			System.out.println("========= Insert ========");
//			Task task = new Task();
//			task.setTitle("Task One");
//
//			taskRepo.save(task);
//			System.out.println("========= Update ========");
//
//			task.setTitle("Task Two");
//			Thread.sleep(2 * 1000);
//			taskRepo.save(task);
//		};
//	}
//
//	@Bean
//	public ApplicationRunner applicationRunner(ReminderRepo remainderRepo){
//		return args -> {
//			System.out.println("========= Insert ========");
//			Reminder reminder = new Reminder();
//			reminder.setTitle("Reminder One");
//
//
//			remainderRepo.save(reminder);
//			System.out.println("========= Update ========");
//
//			reminder.setTitle("Reminder Two");
//			Thread.sleep(2 * 1000);
//			remainderRepo.save(reminder);
//		};
//	}
}
