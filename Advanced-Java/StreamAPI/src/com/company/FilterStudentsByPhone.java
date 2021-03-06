package com.company;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class FilterStudentsByPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,String> student = new LinkedHashMap<>();

        while (true){
            String line = scanner.nextLine();
            if (line.equals("END")){
                break;
            }

            String[] name = line.split("\\s+");
            student.put(name[0]+" " +name[1],name[2]);
        }

        student.entrySet().stream()
                .filter(a -> a.getValue().startsWith("02") ||a.getValue().startsWith("+3592") )
                .forEach(a -> System.out.println(a.getKey()));
    }
}
