package com.examproctor;

public class ExamProctorMain {
	public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        // Setup correct answers
        exam.addCorrectAnswer(1, "A");
        exam.addCorrectAnswer(2, "B");
        exam.addCorrectAnswer(3, "C");

        // Student navigation
        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        // Review navigation
        exam.reviewLastQuestion();

        // Auto score calculation
        int score = exam.calculateScore();
        System.out.println("Final Score: " + score);
    }
}


