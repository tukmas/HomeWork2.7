public class Mechanic<T extends Transport> {
    private String name;
    private String company;

    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }

    public void carryOutMaintenance(){
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " проводит техническое обслуживание автомобиля");
    }

    public void fixTheCar() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " производит починку автомобиля");
    }
}
