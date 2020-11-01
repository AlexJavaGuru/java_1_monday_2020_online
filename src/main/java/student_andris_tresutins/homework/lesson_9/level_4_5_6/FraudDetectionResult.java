package student_andris_tresutins.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "уже столько уроков позади. Нельзя писать с таким плохим форматом =)")
 class FraudDetectionResult {


        private boolean fraud;
        private String ruleName;

        public FraudDetectionResult(boolean fraud, String ruleName){

            this.fraud = fraud;
            this.ruleName = ruleName;

        }

    public boolean getIsFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }



    }

