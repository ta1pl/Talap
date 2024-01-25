public class Employer extends Person{
    private int salary;
    private String position;

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    public Employer(){
        super();
    }

    public Employer(String name, String surname, String position, int salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }
    @Override
    public String ToString(){
        return "Employee " + super.ToString();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String GetPosition() {
        return position;
    }


    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
