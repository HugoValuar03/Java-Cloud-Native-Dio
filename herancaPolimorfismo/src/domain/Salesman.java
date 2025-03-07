package domain;

public non-sealed class Salesman extends Employee{

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code,
                    String nome,
                    String address,
                    int age,
                    double salary,
                    double percentPerSold,
                    double soldAmount) {
        super(code, nome, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold / 100);
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public String getCode(){
        return "SL" + this.code;
    }



    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
