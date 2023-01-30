public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int taxx;
    int mesai;
    int bonuss;
    int now = 2021;
    int raise;


    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if (salary<=1000){
            taxx= 0;
        }
        if (salary>1000){
            taxx = salary *3/100;
        }
        return taxx;
    }
    double bonus(){
        if (workHours>40){
            mesai = workHours -40;
            bonuss = mesai * 30;
        }else{
            bonuss = 0;
        }
        return bonuss;
    }
    double raiseSalary(){
        if (now-hireYear<10){
            raise = salary*5/100;
        }
        if (now-hireYear>=10 && now-hireYear<20){
            raise = salary/10;
        }
        if (now-hireYear<19){
            raise = salary*15/100;
        }
        return raise;
    }
    double total(){
        double total = this.salary - tax() + bonus();
        return total;
    }
    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Baş. Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslarla Maaş : " + total());
        double allTotal = total() + raiseSalary();
        System.out.println("Toplam Maaş : " + allTotal);
        return null;
    }
}
