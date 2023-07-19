package com.zieta.javaassignmentthree;

public class EnumDemo {
    enum Language {
        JAVA("Object-Oriented Programming Language", 1995),
        PYTHON("High-level Programming Language", 1989),
        JAVASCRIPT("High-level, Interpreted Programming Language", 1995),
        CSHARP("Object-Oriented Programming Language", 2000);

        private String description;
        private int year;

        Language(String description, int year) {
            this.description = description;
            this.year = year;
        }

        public String getDescription() {
            return description;
        }

        public int getYear() {
            return year;
        }
    }

    public static void main(String[] args) {
        System.out.println("Languages:");
        for (Language language : Language.values()) {
            System.out.println(language + " (" + language.getDescription() + ", " + language.getYear() + ")");
        }

        Language javaLanguage = Language.valueOf("JAVA");
        System.out.println("\nValue of JAVA language: " + javaLanguage);
        System.out.println("Ordinal value of PYTHON language: " + Language.PYTHON.ordinal());
    }
}
