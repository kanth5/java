package com.educative.interview.generics;

class RawTypeDemo {
    public static void main( String args[] ) {
        Printer<Integer> integerPrinter = new Printer<>(5);
        Printer printer = new Printer("my string");
        printer = integerPrinter;

        printer.changeItem("string item");
        printer.consolePrinter();

    }
}

class Printer<T> {

    T item;

    public Printer(T item) {
        this.item = item;
    }

    public void changeItem(T item) {
        this.item = item;
    }

    public void consolePrinter() {
        System.out.println(item.toString());
    }
}