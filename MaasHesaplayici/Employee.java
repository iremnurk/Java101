public class Employee {
    String name;  //Çalışanın adı ve soyadı
    double salary;  // Çalışanın maaşı
    int workHours;  // Haftalık çalışma saati
    int hireYear;   // İşe başlangıç yılı



    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            int totalBonus=(this.workHours - 40) * 30;
            return totalBonus;
        } else {
            return 0;
        }
    }

     double raiseSalary() {
        int year=2021;
        int workTime = year - this.hireYear;
        double yearsRaise=0.0;
        if (workTime < 10) {
            yearsRaise=this.salary * 0.05;
            return yearsRaise;
        } else if (workTime > 9 && workTime < 20) {
            yearsRaise=this.salary * 0.10;
            return yearsRaise;
        }
        else {
            yearsRaise= this.salary * 0.15;
            return yearsRaise;
        }
    }

    public void toStrings () {
        System.out.println("----------------------------------------");
        System.out.println("Adi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Baslangic Yili: "+this.hireYear);
        System.out.println("Vergi Miktari: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Zammi : " + raiseSalary());
        System.out.println("Bonus ve Vergi ile Maas Miktari: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maas: " + (this.salary + raiseSalary()));
    }
    }

