package it.develhope.gianluigi.static1;

public class Employee {
    private String name;
    private String surname;
    private String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public Employee(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getEmployeeDetails() {
        return String.format(
                "%n*** Employee Details ***%n" +
                        "Complete name: %s %s %n" +
                        "Address: %s",
                name, surname, address
        );
    }
}
