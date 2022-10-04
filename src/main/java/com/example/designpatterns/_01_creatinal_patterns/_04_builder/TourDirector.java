package com.example.designpatterns._01_creatinal_patterns._04_builder;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan japanTrip() {
        return builder.title("일본 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 25))
                .whereToStay("리조트")
                .addPlan(0, "체크인")
                .addPlan(0, "식사")
                .getPlan();
    }

    public TourPlan seoulTrip() {
        return builder.title("서울")
                .startDate(LocalDate.of(2022, 10, 27))
                .getPlan();
    }
}
