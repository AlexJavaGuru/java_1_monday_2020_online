package teacher.lesson_7.lessoncode.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

    private List<InsuredObject> insuredObjects = new ArrayList<>();

    public List<InsuredObject> getInsuredObjects() {
        return insuredObjects;
    }

    public void setInsuredObjects(List<InsuredObject> insuredObjects) {
        this.insuredObjects = insuredObjects;
    }

    public void addInsuredObjects(InsuredObject insuredObject) {
        insuredObjects.add(insuredObject);
    }
}
