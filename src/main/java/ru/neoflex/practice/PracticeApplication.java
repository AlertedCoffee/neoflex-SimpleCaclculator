package ru.neoflex.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.practice.controller.CalcController;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeApplication.class, args);
		int sum = CalcController.plus(5, 5);
		System.out.println(sum);
		System.out.print(CalcController.minus(sum, 5));
	}

}
