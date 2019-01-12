package com.stephensir.geoquiz;

public class Question {
    // Members
    private String question;
    private boolean answer;

    // Constructor
    public Question(String _q, boolean _a) {
        question = _q;
        answer = _a;
    }
    // Setter and Getter
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String _q) {
        question = _q;
    }
    public boolean getAnswer() {
        return answer;
    }
    public void setAnswer(boolean _a) {
        answer = _a;
    }

}

