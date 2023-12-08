package org.example._Supplier;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionString.get());
    }
    static Supplier<String> getDBConnectionString= ()->"jdbc://localhost:500";

}
