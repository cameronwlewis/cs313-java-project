package com.cs313.cameron;

import com.cs313.cameron.model.Formatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

/**
 * Where the main application is directed and run.
 */
@SpringBootApplication
public class TubeHappyFinalApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TubeHappyFinalApplication.class, args);
        Formatter formatter = new Formatter();
        List<String> text = Arrays.asList("i like turtles", "baby girl, I like your moves", "hey big boy");

        formatter.uclassify_Formatter(text, text.size());
	}
}
