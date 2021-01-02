package com.mubeendroid.austcsecgpacalculator.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Information {

    /*
        This class contains all the information.
        The first parameter of the map is subject name and the second parameter is credit number of that subject.
        Call methods according to year and semester to get corresponding data.
     */

    public Map<String, Double> get11Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("English Foundation I", 2.0);
        map.put("Differential and Integral Calculus", 3.0);
        map.put("Physics I", 3.0);
        map.put("Physics I Lab", 1.0);
        map.put("Computer Fundamental", 3.0);
        map.put("Computer Application Lab", 1.0);

        return map;
    }

    public Map<String, Double> get12Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("English Foundation II", 2.0);
        map.put("Coordinate Geometry & Vector Analysis", 3.0);
        map.put("Electrical Circuits", 3.0);
        map.put("Electrical Circuits Lab", 1.0);
        map.put("Structured Programming Language", 3.0);
        map.put("Structured Programming Language Lab", 1.5);

        return map;
    }
    public Map<String, Double> get13Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Differential Equations and Special Functions", 3.0);
        map.put("Discrete Mathematics", 3.0);
        map.put("Object Oriented Programming\t", 3.0);
        map.put("Object Oriented Programming Lab", 1.5);
        map.put("Software Development Lab I", 1.0);

        return map;
    }

    public Map<String, Double> get21Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Linear Algebra and Complex Variables", 3.0);
        map.put("Data Structures", 3.0);
        map.put("Data Structures Lab", 1.5);
        map.put("Object Oriented Design and Design Patterns", 3.0);
        map.put("Object Oriented Design and Design Patterns Lab", 1.5);

        return map;
    }

    public Map<String, Double> get22Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Bangladesh Culture & Heritage Studies", 2.0);
        map.put("Software Engineering", 3.0);
        map.put("Electronic Devices and Circuits", 3.0);
        map.put("Electronic Devices and Circuits Lab", 1.0);
        map.put("Algorithms", 3.0);
        map.put("Algorithms Lab", 1.5);

        return map;
    }
    public Map<String, Double> get23Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Basic Statistics and Probability", 3.0);
        map.put("Digital Logic Design", 3.0);
        map.put("Digital Logic Design Lab", 1.0);
        map.put("Computer Networks", 3.0);
        map.put("Computer Networks Lab", 1.0);
        map.put("Software Development Lab II", 1.0);

        return map;
    }
    public Map<String, Double> get31Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Industrial Management and Accountancy", 2.0);
        map.put("Numerical Method", 3.0);
        map.put("Numerical Method Lab", 1.0);
        map.put("Database Management System", 3.0);
        map.put("Database Management System Lab", 1.5);
        map.put("Communication Engineering", 3.0);

        return map;
    }

    public Map<String, Double> get32Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Cyber and Intellectual Property Laws", 2.0);
        map.put("Theory of Computation and Compiler Design", 3.0);
        map.put("Computer Architecture", 3.0);
        map.put("Computer Architecture Lab", 1.0);
        map.put("E-Commerce and Web Programming", 3.0);
        map.put("E-Commerce and Web Programming Lab", 1.0);
        return map;
    }
    public Map<String, Double> get33Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Economics", 2.0);
        map.put("Operating System and System Programming", 3.0);
        map.put("Operating System and System Programming Lab", 1.0);
        map.put("Microprocessor and Assembly Language", 3.0);
        map.put("Microprocessor and Assembly Language Lab", 1.0);
        map.put("Software Development Lab III", 1.0);

        return map;
    }

    public Map<String, Double> get41Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("System Analysis and Design", 3.0);
        map.put("Artificial Intelligence", 3.0);
        map.put("Artificial Intelligence Lab", 1.0);
        map.put("Digital Signal Processing", 3.0);
        map.put("Digital Signal Processing Lab", 1.0);
        map.put("Project or Thesis with Seminar Part I", 1.0);

        return map;
    }

    public Map<String, Double> get42Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Computer Graphics", 3.0);
        map.put("Computer Graphics Lab", 1.0);
        map.put("Digital Image Processing", 3.0);
        map.put("Digital Image Processing Lab", 1.0);
        map.put("Theory: Should be selected from Table-I", 3.0);
        map.put("Lab course based on Option-I (T)", 1.0);
        map.put("Project or Thesis with Seminar Part II", 1.0);

        return map;
    }
    public Map<String, Double> get43Data() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Cryptography and Network Security", 3.0);
        map.put("Cryptography and Network Security Lab", 1.0);
        map.put("Theory: Should be selected from Table-II", 3.0);
        map.put("Lab course based on Option-II (T)", 1.0);
        map.put("Theory: Should be selected from Table-II", 3.0);
        map.put("Lab course based on Option-III (T)", 1.0);
        map.put("Project or Thesis with Seminar Part III", 1.0);
        return map;
    }
}
