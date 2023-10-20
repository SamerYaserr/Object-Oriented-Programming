public enum WeekDays {
    MONDAY("Working day"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY("Day off"), SATURDAY, SUNDAY;

    private String status;

    WeekDays ( String status ){
        this.status = status;
    }

    WeekDays(){}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
