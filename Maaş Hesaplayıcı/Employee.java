public class Employee {

    /*
    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı
     */
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tosString();
        // önce toplam maas hesaplayip ardindan vergileri hesaplayacagiz
        // hizmet yili zammi
        double dummy = raiseSalary();
        this.salary += dummy;
        System.out.println("Maas Artisi: " + dummy);
        // bonus calisma saati miktari
        dummy = bonus();
        this.salary += dummy;
        System.out.println("Bonus: " + dummy);
        // vergi kesintisi
        dummy = tax();
        this.salary -= dummy;
        System.out.println("Vergi: " + dummy);
        System.out.println("Net Maas: " + this.salary);
    }

    public double tax(){
        double taxAmount;
        if ( this.salary <= 1000 ){
            taxAmount = 0;
        }else {
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }
    public double bonus(){
        double bonusSalary = 0;
        if ( this.workHours > 40 ){
            bonusSalary = (this.workHours - 40) * 30;
        }
        return bonusSalary;
    }

    public double raiseSalary(){
        if ( (2022 - this.hireYear) > 19 ){
            return this.salary * 0.15;
        }else if ( (2022 - this.hireYear) > 9 ){
            return this.salary * 0.10;
        }else {
            return this.salary * 0.05;
        }
    }

    /*
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.

    ###########################################################################################



    Adı : kemal
    Maaşı : 2000.0
    Çalışma Saati : 45
    Başlangıç Yılı : 1985
    Vergi : 60.0
    Bonus : 150.0
    Maaş Artışı : 300.0
    Vergi ve Bonuslar ile birlikte maaş : 2090.0
    Toplam Maaş : 2300.0
     */


    public void tosString(){
        System.out.println("Adi: " + this.name);
        System.out.println("Baslangic yili: " + this.hireYear);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Maasi: " + this.salary);
    }


    // nitelikler private olduğu için getter ve setter methodları tanimladık
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
