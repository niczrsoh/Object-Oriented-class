package ProblemSolving;

public enum  Seat {
    F(60,"First"), B(50,"Business"), E(45, "Economy");
    private int allowWeight;
    private String seatClass;
    private Seat(int allowWeight, String seatClass) {
        this.allowWeight = allowWeight;
        this.seatClass = seatClass;
    }
    public int getAllowWeight() {
        return allowWeight;
    }
    public String getSeatClass() {
        return seatClass;
    }
    
}
