package springdemo;

public class RandomCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public RandomCoach() {
        System.out.println("inside RandomCoach no args constructor");
    }

    public String getDailyWorkout() {
        return "something random";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("inside RandomCoach setFortuneService");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
