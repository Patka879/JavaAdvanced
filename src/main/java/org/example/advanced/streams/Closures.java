package org.example.advanced.streams;

public class Closures {
    public static void main(String[] args) {
        Counter counter = createCounter();
        System.out.println(counter.count());
    }

    // You can't modify any local variable from inside the anonymous classes or lambda expressions
    // You have to find way to avoid modifying variables:
    // -- avoid using lambda --
    // -- move variable to field --
    // -- use object that holds this value, so You don't need to change variable value (variable value is
    // reference to that object now)

    public static Counter createCounter() {
        IntegerHolder holder = new IntegerHolder();
        Counter counter = new Counter() {
            @Override
            public int count() {
                String text = "abcdefghijkl";
                for (char letter : text.toCharArray()) {
                    if (letter == 'o') {
                        holder.value++;
                    }
                }
                return holder.value;
            }
        };
        return counter;
    }

}

interface Counter {
    int count();
}

class IntegerHolder {
    int value = 0;
}
