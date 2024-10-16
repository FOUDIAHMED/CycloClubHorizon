package ahmed.foudi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

//    @OneToMany(mappedBy = "competition")
//    private List<GeneralResult> generalResults;

    @OneToMany(mappedBy = "competition")
    private List<Stage> stages;

    public Competition() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

//    public List<GeneralResult> getGeneralResults() {
//        return generalResults;
//    }

//    public void setGeneralResults(List<GeneralResult> generalResults) {
//        this.generalResults = generalResults;
//    }
//
//    public List<Stage> getStages() {
//        return stages;
//    }
//
//    public void setStages(List<Stage> stages) {
//        this.stages = stages;
//    }
}