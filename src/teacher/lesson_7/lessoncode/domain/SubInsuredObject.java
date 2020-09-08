package teacher.lesson_7.lessoncode.domain;

import teacher.lesson_7.lessoncode.domain.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SubInsuredObject {

    private String name;
    private BigDecimal price;
    private List<InsuranceRisk> insuranceRisks;

    public SubInsuredObject(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.insuranceRisks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<InsuranceRisk> getInsuranceRisks() {
        return insuranceRisks;
    }

    public void addRisk(InsuranceRisk risk) {
        insuranceRisks.add(risk);
    }
}
