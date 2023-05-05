package org.example.advanced.streams.streamChallange;

import java.time.LocalDate;
import java.util.Random;

public class MyPerson extends Person {
    Random random = new Random();

    public MyPerson(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {
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
        return 0;
    }
}
