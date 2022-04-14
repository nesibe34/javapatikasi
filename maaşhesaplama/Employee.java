public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;
    double salaryBonusTax;
    double salaryTotal;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
        if (this.salary<1000){
          this.tax=0.0;
        }else{
            this.tax=this.salary*0.03;
        }
        System.out.println("Vergi         \t:"+this.tax);
    }
    void bonusCalc(){
        if (this.workHours<=40){
            this.bonus=0.0;
        }else{
            this.bonus=(workHours-40)*30;
        }
        System.out.println("Bonus         \t:"+this.bonus);
    }
    void printInfo(){
        System.out.println("Ad-Soyad      \t:"+this.name);
        System.out.println("Maaşı         \t:"+this.salary);
        System.out.println("Çalışma Saati \t:"+this.workHours);
        System.out.println("Başlangıç Yılı\t:"+this.hireYear);
        tax();
        bonusCalc();
        raiseSalary();
        salaryBonusTax=this.salary+this.bonus-this.tax;
        salaryTotal=salaryBonusTax+this.raise;
        System.out.println("Vergi ve bonuslar ile birlikte maaş\t:"+salaryBonusTax);
        System.out.println("Toplam maaş\t:"+salaryTotal);
    }
    void raiseSalary(){
        if (2021-this.hireYear<10){
            this.raise=this.salary*0.5;
        }else if(2021-this.hireYear>9 && 2021-this.hireYear<20){
            this.raise=this.salary*0.1;
        }else {
            this.raise=this.salary*0.15;
        }
        System.out.println("Maaş Artışı   \t:"+this.raise);
    }
}

