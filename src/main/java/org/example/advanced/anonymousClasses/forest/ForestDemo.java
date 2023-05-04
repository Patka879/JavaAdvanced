package org.example.advanced.anonymousClasses.forest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a Tree object with the display() method, this method is supposed to print a "plain tree".
 * Create a list of 100 trees and name it forest. Using an anonymous class, add one special tree that
 * will display "Magic Tree!". Add them to the coll ection (some list) and shuffle the collection with
 * the Collections.shuffle(List) method. Iterate through the "forest" and display all the trees using
 * the display() method :) One of them should show a particular behavior, find it.
 */
public class ForestDemo {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<Tree>();

        for(int i = 0; i < 100; i++) {
            forest.add(new Tree());
        }

        forest.add(new Tree() {
            @Override
            public void display() {
                    System.out.println("MAGIC TREE");
                };
        });

        Collections.shuffle(forest);
        for (Tree tree : forest) {
            tree.display();
        }
    }
}
