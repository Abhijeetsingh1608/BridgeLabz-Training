package com.examproctor;

import java.util.*;

public class ExamProctor {

    // Stack to track navigation (last visited question)
    Stack<Integer> navigationStack = new Stack<>();

    // HashMap to store answers (questionId -> answer)
    HashMap<Integer, String> answers = new HashMap<>();

    // HashMap for correct answers
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer a question
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Add correct answers (exam setup)
    public void addCorrectAnswer(int questionId, String correctAnswer) {
        correctAnswers.put(questionId, correctAnswer);
    }

    // Function to calculate score
    public int calculateScore() {
        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (answers.containsKey(qid)) {
                if (answers.get(qid).equals(correctAnswers.get(qid))) {
                    score++;
                }
            }
        }
        return score;
    }

    // Review last visited question
    public void reviewLastQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No navigation history");
            return;
        }
        System.out.println("Last visited question: " + navigationStack.peek());
    }
}
