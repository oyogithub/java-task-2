
//basic springboot application starter
package com.example.javatask4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //in class path scan these annotations are used
public class JavaTask4Application {
	public static void main(String[] args) {
	SpringApplication.run(JavaTask4Application.class, args);//static calss and static method which does config
	}

}
