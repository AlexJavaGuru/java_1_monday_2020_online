package student_artur_martinenko.homework.lesson_9.level_5_middle.task_22_28;

import teacher.annotations.CodeReview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public static void readFromFileAndWriteToArray(File file, ArrayList<String> array) {
        String stringToWrite;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((stringToWrite = br.readLine()) != null) {
                array.add(stringToWrite.toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
