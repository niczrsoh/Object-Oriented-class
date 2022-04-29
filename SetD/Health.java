// COMPILE & RUN THE CODE AT TRAVELLERTEST.JAVA
package SetD;

public enum Health {
    CASE1("BAD COUGH","DENY BOARDING"), CASE2("HIGH FEVER","DENY BOARDING"), CASE3("MILD SYMPTOM","STANDBY"), CASE4("NO SYMPTOM", "PERMIT BOARDING");
    private String condition;
    private String board;
    Health(){}
    Health(String condition, String board){
        this.condition = condition;
        this.board = board;
    }
    String getCondition(){return condition;}
    String getBoard(){return board;}
}
