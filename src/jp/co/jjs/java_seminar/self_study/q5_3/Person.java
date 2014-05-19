package jp.co.jjs.java_seminar.self_study.q5_3;

public class Person {

    private String name;
    private int year;
    private float inMoney;

    public Person(String name, int year, float inMoney) {
        this.name = name;
        this.year = year;
        this.inMoney = inMoney;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year
     *            セットする year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return inMoney
     */
    public float getInMoney() {
        return inMoney;
    }

    /**
     * @param inMoney
     *            セットする inMoney
     */
    public void setInMoney(float inMoney) {
        this.inMoney = inMoney;
    }

}
