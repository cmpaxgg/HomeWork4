package com.gmail.cmpaxgg;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group groupOne = new Group();

		try {
			groupOne.addStudent(new Student("Sergey", "Philipov", 21, true, "biology", 1));
			groupOne.addStudent(new Student("Andrey", "Kabanov", 22, true, "biology", 2));
			groupOne.addStudent(new Student("Alexey", "Krasnov", 17, true, "biology", 3));
			groupOne.addStudent(new Student("Nikolay", "Bronzoviy", 22, true, "phisics", 4));
			groupOne.addStudent(new Student("Grisha", "Kamyaniy", 18, true, "phisics", 5));
			groupOne.addStudent(new Student("Elena", "Lomanosova", 21, false, "phisics", 1));
			groupOne.addStudent(new Student("Vyacheslav", "Cherednyk", 24, true, "phisics", 2));
			groupOne.addStudent(new Student("Larisa", "Ivanova", 17, false, "geography", 1));
			groupOne.addStudent(new Student("Nadegda", "Galchina", 21, false, "geography", 3));
			groupOne.addStudent(new Student("Petr", "Velikiy", 25, true, "geography", 5));
			groupOne.addStudent(new Student("Vyacheslav", "Zaycev", 21, true, "geography", 2));
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(groupOne);
			groupOne.sortStudentAge();
			System.out.println(groupOne);
			groupOne.sortStudentLastname();
			System.out.println(groupOne);

		}

		try {
			groupOne.interactiveAddStudent();
		} catch (MyException e) {
			JOptionPane.showMessageDialog(null, (e.getMessage()));
		}
		Student[] arrayStudent = groupOne.getSpecnaz();

        for (Student student : arrayStudent) {
            System.out.println(student);
	}
}
}