package person_information;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class person_information {


    public static void main(String[] args) throws IOException {

        char sex;
        int age, num = 0;
        String surname, name, patronymic;

            while (num < 10) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите номер: ");
            num = Integer.parseInt(br.readLine());
            if (num < 10) {
                System.out.println("Введите фамилию: ");
                surname = br.readLine();
                System.out.println("Введите имя: ");
                name = br.readLine();
                System.out.println("Введите отчество: ");
                patronymic = br.readLine();
                System.out.println("Введите возраст(лет): ");
                age = Integer.parseInt(br.readLine());
                System.out.println("Введите пол(M/Ж): ");
                sex = (char) br.read();
                System.out.printf("№: %d, Имя: %s, Фамилия: %s, Отчество: %s, Вохраст(лет): %d, Пол: %c\n", num, surname, name, patronymic, age, sex);
            }
            else
                System.out.println("Конец программы");
            }

    }


}
