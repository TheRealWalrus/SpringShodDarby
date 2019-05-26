package springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run 5k";
    }

    public String getDailyFortune() {
        return "Just Do it: " + fortuneService.getFortune();
    }
}
