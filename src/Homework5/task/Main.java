class Person{
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Person(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(this.fullName);
        System.out.println(this.position);
        System.out.println(this.email);
        System.out.println(this.phone);
        System.out.println(this.salary);
        System.out.println(this.age);
    }
    public int getAge(){
        return this.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Mne len' Ivanov", "Enginigger", "aboba@mailbox.com", "88005553535", 60000, 420);
        persArray[2] = new Person("Ya Chechenec Menya", "Zvat'", "ALAN@mailbox.com", "89776180607", 100000, 228);
        persArray[3] = new Person("Dead Inside", "Long", "ZXC@mailbox.com", "89939930", 993000, 993);
        persArray[0] = new Person("Khazbik", "Inogda kaifuyu, inogda vot tak havayu", "ULTRAUBIVCA9000Mrost@mailbox.com", "89256160203", 600000000, 3);
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
