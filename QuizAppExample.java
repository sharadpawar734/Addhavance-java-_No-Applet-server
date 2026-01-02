import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizAppExample {
    private Frame frame;
    private Panel contentPanel;
    private CardLayout cardLayout;
    private int currentQuestionIndex = 0;

    private String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What gas do plants primarily absorb for photosynthesis?"
    };

    private String[][] options = {
            {"Paris", "Rome", "London"},
            {"Mars", "Jupiter", "Venus"},
            {"Carbon Dioxide", "Oxygen", "Nitrogen"}
    };

    public static void main(String[] args) {
        QuizAppExample example = new QuizAppExample();
        example.createAndShowUI();
    }

    public void createAndShowUI() {
        frame = new Frame("Quiz Application");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        contentPanel = new Panel();
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);

        for (int i = 0; i < questions.length; i++) {
            contentPanel.add(createQuestionPanel(i), "question" + i);
        }

        Button prevButton = new Button("Previous");
        Button nextButton = new Button("Next");

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPreviousQuestion();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showNextQuestion();
            }
        });

        Panel buttonPanel = new Panel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        showQuestion(0);
        frame.pack();
        frame.setVisible(true);
    }

    private Panel createQuestionPanel(int index) {
        Panel panel = new Panel(new GridLayout(4, 1));
        Label questionLabel = new Label(questions[index]);
        panel.add(questionLabel);

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        for (int i = 0; i < options[index].length; i++) {
            Checkbox checkbox = new Checkbox(options[index][i], false, checkboxGroup);
            panel.add(checkbox);
        }

        return panel;
    }

    private void showQuestion(int index) {
        cardLayout.show(contentPanel, "question" + index);
        currentQuestionIndex = index;
    }

    private void showNextQuestion() {
        if (currentQuestionIndex < questions.length - 1) {
            showQuestion(currentQuestionIndex + 1);
        }
    }

    private void showPreviousQuestion() {
        if (currentQuestionIndex > 0) {
            showQuestion(currentQuestionIndex - 1);
        }
    }
}