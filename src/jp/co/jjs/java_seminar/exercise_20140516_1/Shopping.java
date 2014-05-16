package jp.co.jjs.java_seminar.exercise_20140516_1;

public class Shopping extends Task {

    private int price;

    public Shopping(String task, int price) {
        super(task);
        this.price = price;
    }

    @Override
    public String getTask() {
        return super.getTask() + "(" + this.price + "円)";
    }

}
