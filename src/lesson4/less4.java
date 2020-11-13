package lesson4;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class less4 {

    public static void main( String[] args ) {

        Worker work3 = new Worker("Petrov", "Accountant", "+79880000111", 10000, 48);
        System.out.println("FIO: " + work3.getFio() +"\nPosition: " + work3.getPosition());
        System.out.println();


    Worker[] workArray = new Worker[5];
    workArray[0] = new Worker("Smirnov Anton", "Director", "+79880000000", 200000, 38);
    workArray[1] = new Worker("Nikitina Vasilisa", "Senior engineer", "+79881111111", 210000, 31);
    workArray[2] = new Worker("Petrov Ivan", "Accountant", "+79880000111", 210000, 48);
    workArray[3] = new Worker("Vasiliev Victor", "Courier", "+79888125211", 25000, 19);
    workArray[4] = new Worker("Smirnov Anton", "Manager", "+79880022220", 60000, 41);

for (int i = 0; i < workArray.length; i++) {
    if (workArray[i].getAge() > 40) {
        System.out.println("FIO: " + workArray[i].getFio() +"  Position: " + workArray[i].getPosition() +
                "  Phone: " + workArray[i].getPhone() + "  Salary: " + workArray[i].getSalary() + "  Age: " + workArray[i].getAge());
        System.out.println();    }
}
}
}
