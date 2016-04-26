package com.demospring.processing.hackerrank.mathematics;

import java.util.Iterator;

public class FibonacciSequence implements Iterator<Integer>, Iterable<Integer> {

    private final Integer max;
    private Integer previous;
    private Integer current;

    public FibonacciSequence(int max) {
        this.previous = -1;
        this.current = 1;
        this.max = max;
    }

    @Override
    public Integer next() {
        Integer next = previous + current;
        previous = current;
        current = next;
        return next;
    }

    @Override
    public boolean hasNext() {
        return current <= max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    public static void main(String[] args) {
        final int LIMIT = 4_000_000;
        final FibonacciSequence sequence = new FibonacciSequence(LIMIT);
        Integer sum = 0;

        for (Integer value : sequence) {
            if (value % 2 == 0) {
                sum += value;
            }
        }

        System.out.println("Sum using finite Iterable = " + sum);
    }
}
