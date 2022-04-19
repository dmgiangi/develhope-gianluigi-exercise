package it.develhope.gianluigi.static1;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge (Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        Random random = new Random();

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int stringLength = 4;

        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer +
                employee.getName() +
                employee.getSurname() +
                buffer;
    }

    public void showBadgeDetails(){
        System.out.printf(
                "%n*** Badges detail ***%n" +
                        "Total Badges: %d%n***%n" +
                        "%s%n" +
                        "Badge id: %s%n" +
                        "***%n%n",
                totalNumberOfEmployees, employee.getEmployeeDetails(), badgeIdCode
        );
    }
}
