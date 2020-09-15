package teacher.lesson_7.lessoncode.domain;

import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class InsuredObject {

    private BigDecimal cadastralValue;
    private List<SubInsuredObject> subInsuredObjects;
    private List<InsuranceRisk> insuranceRisk;

    public InsuredObject(BigDecimal cadastralValue) {
        this.cadastralValue = cadastralValue;
        this.subInsuredObjects = new ArrayList<>();
        this.insuranceRisk = new ArrayList<>();
    }

    public List<InsuranceRisk> getInsuranceRisk() {
        return insuranceRisk;
    }

    public BigDecimal getCadastralValue() {
        return cadastralValue;
    }

    public List<SubInsuredObject> getSubInsuredObjects() {
        return subInsuredObjects;
    }

    public void addRisk(InsuranceRisk risk) {
        insuranceRisk.add(risk);
    }

    public void addSubObjects(SubInsuredObject subInsuredObject) {
        subInsuredObjects.add(subInsuredObject);
    }

    public abstract BigDecimal getRiskCoefficient(InsuranceRisk insuranceRisk);
}
