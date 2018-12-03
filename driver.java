import java.time.LocalDate;

class Driver {
    String name;
    String surname;
    LocalDate birthday;
    DriverLicense driverLicense;

    public Driver() {
    }

    public Driver(String name, String surname, LocalDate birthday, DriverLicense driverLicense) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.driverLicense = driverLicense;
    }

    public String toString() {
        return "name:" + name + " surname:" + surname + " birthday:" +
                birthday.toString() + "\ndriverLicense:" + driverLicense.toString();
    }
}

class DriverLicense {
    String category;
    LocalDate issued;
    LocalDate expiredAt;

    public DriverLicense(String category, LocalDate issued, LocalDate expiredAt) {
        this.category = category;
        this.issued = issued;
        this.expiredAt = expiredAt;
    }

    public String toString() {
        return "category:" + category + " issued:" + issued.toString() + " expiredAt:" + expiredAt.toString();
    }
}

class Example {
    public static void main(String[] args) {
        //Пример создания написанных объектов

        //Так как объект driver зависит от driverLicense создадим первым driverLicense
        DriverLicense driverLicense = new DriverLicense("A,B",
                LocalDate.of(2018, 11, 01),
                LocalDate.of(2028, 11, 01));

        //Обращаю внимание что в конструтор driver мы передаем созданный строкой выше объект driverLicense
        Driver driver = new Driver("John", "Wayne", LocalDate.of(1980, 1, 30), driverLicense);

        //Выведем что получилось
        System.out.println(driver.toString());
    }
}
