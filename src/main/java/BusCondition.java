public enum BusCondition {

    Driving("운행"),
    Stop("차고지행");

    public String condition;

    BusCondition(String condition) {
        this.condition = condition;
    }
}
