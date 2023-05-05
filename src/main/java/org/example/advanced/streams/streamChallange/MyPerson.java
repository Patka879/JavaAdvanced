package org.example.advanced.streams.streamChallange;

import java.time.LocalDate;
import java.util.Random;

public class MyPerson extends Person {

    public MyPerson(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {
        Random random = new Random();
        int randomInt = random.nextInt(1, 101);
        return randomInt;
    }

    @Override
    public LocalDate getRandomBirthDate() {
        int randomNumberOfYears = getRandomCash();
        LocalDate currentDate = LocalDate.now();
        LocalDate randomBirthDate = currentDate.minusYears(randomNumberOfYears);
        return randomBirthDate;
    }

    @Override
    public int getAge() {
        LocalDate birthDate = getRandomBirthDate();
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int birthMonth = birthDate.getMonthValue();

        if (birthMonth > currentMonth ||
                (birthMonth == currentMonth && birthDate.getDayOfMonth() > currentDate.getDayOfMonth())) {
            age--;
        }

        return age;
    }
}
