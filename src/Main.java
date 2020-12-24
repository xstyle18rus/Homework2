public class Main {

    public static void main(String[] args) {
//	    System.out.println("Hello");
	    Employee[] employees = {
	            new Employee("Alex","driver","Alex@gg.com",+79379992, 44000, 43),
                new Employee("Nanak","driver","Nanak@gg.com",+79379993, 34000, 21),
                new Employee("Pavel","driver","Pavel@gg.com",+79379994, 40000, 27),
                new Employee("Alik","driver","Alik@gg.com",+79379995, 46000, 55),
                new Employee("Dima","driver","Dima@gg.com",+79379996, 46000, 61),
                new Employee("DaIIIa","secretary","DaIIIa@gg.com",+79379997, 30000, 31),
                new Employee("Evgenii","driver","Evgenii@gg.com",+79379998, 44000, 37),
                new Employee("Cava","driver","Cava@gg.com",+79379999, 40000, 25),
                new Employee("Kat","accountant","Kat@gg.com",+79379991, 35000, 55),
                new Employee("Bolondemort","driver","Bolondemort@gg.com",+99999999, 99999, 99),
        };

	    for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].Info());
            }
        }


    }
}
