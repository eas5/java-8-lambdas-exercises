package com.insightfullogic.java8.exercises.chapter2;

import com.insightfullogic.java8.exercises.Exercises;

import javax.swing.text.DateFormatter;

import java.text.*;

import static java.lang.ThreadLocal.withInitial;

public class Question2 {

    public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

}
