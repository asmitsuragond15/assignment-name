package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach {

    private final HappyFortuneService happyFortuneService;

   
    @Autowired
    public TennisCoach(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    public String getDailyWorkout() {
        return "Practice Serving....";
    }

    public String getDailyFortune() {
        return happyFortuneService.getFortune();
    }
}
