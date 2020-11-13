package lesson4;

public class Worker {
     private String fio;
     private String position;
     private String  phone;
     private int salary;
     private int age;

//   Worker() {
//       System.out.println("New employee hired");
//    }

    Worker(String fio, String position, String phone, int salary, int age) {
        //this();
       this.fio = fio;
       this.position = position;
       this.phone = phone;
        this.salary = salary;
        this.age = age;
   }
    public String getFio() {
        return fio;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
}


