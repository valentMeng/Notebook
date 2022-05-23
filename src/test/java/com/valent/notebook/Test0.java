package com.valent.notebook;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test0 {
    @Test
    void func0() {
        List<String> stringList = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        List<Integer> collect = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        Book book1 = new Book("Black", 20);
        Book book2 = new Book("White", 30);
        Book book3 = new Book("Yellow", 15);
        List<Book> bookShelf = Lists.newArrayList(book1, book2, book3);
        bookShelf.stream().map(e -> e.name).forEach(System.out::println);
    }


    @Test
    void func1() {
        System.out.println(unboxNPE(1));
        System.out.println(unboxNPE(null));


    }

    private int unboxNPE(Integer number) {
        return number;
    }




    private class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private class Book{
        private String name;
        private Integer price;

        public Book(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(name, book.name) && Objects.equals(price, book.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }
    }
}
