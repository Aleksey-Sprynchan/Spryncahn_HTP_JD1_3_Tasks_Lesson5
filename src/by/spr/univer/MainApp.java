package by.spr.univer;

public class MainApp {

	// Задание 1

	// Создать класс Group (учебная группа) и класс Student (студент). В группе
	// может учиться от 5 до 15 студентов.
	// В классе Group реализовать следующие методы:
	// • подсчитать средний возраст студентов в группе;
	// • посчитать количество студентов, зачисленных в группу в 2015 году;
	// • найти год, в который в учебную группу было зачислено самое большое
	// количество студентов. На экран вывести год и количество зачисленных
	// студентов;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Student student = null;
		student = new Student();

		student.age = 21;
		student.name = "Igor";
		student.surname = "Blinov";
		student.enterYear = 2014;

		Student student2 = null;
		student2 = new Student();

		student2.age = 20;
		student2.name = "Anna";
		student2.surname = "Ivaniva";
		student2.enterYear = 2015;

		Student student3 = null;
		student3 = new Student();

		student3.age = 20;
		student3.name = "Alex";
		student3.surname = "Egorov";
		student3.enterYear = 2014;

		Student student4 = null;
		student4 = new Student();

		student4.age = 21;
		student4.name = "Maria";
		student4.surname = "Grib";
		student4.enterYear = 2014;

		Student student5 = null;
		student5 = new Student();

		student5.age = 19;
		student5.name = "Victor";
		student5.surname = "Sidorov";
		student5.enterYear = 2017;

		Student student6 = null;
		student6 = new Student();

		student6.age = 24;
		student6.name = "Olga";
		student6.surname = "Ptichkina";
		student6.enterYear = 2014;

		Student student7 = null;
		student7 = new Student(); // student7 это студент " по умолчанию" , т.е. с теми данными которые исходно
									// инициализированы в классе Student

		Student student8 = null;
		student8 = new Student();

		student8.age = 22;
		student8.name = "Sergey";
		student8.surname = "Griboedov";
		student8.enterYear = 2015;

		Student student9 = null;
		student9 = new Student();

		student9.age = 20;
		student9.name = "Anton";
		student9.surname = "Sokolkin";
		student9.enterYear = 2016;

		Student student10 = null;
		student10 = new Student();

		student10.age = 21;
		student10.name = "Roman";
		student10.surname = "Abramovich";
		student10.enterYear = 2014;

		Group group = new Group();
		group.number = 1;
		group.students = new Student[10];
		group.students[0] = student;
		group.students[1] = student2;
		group.students[2] = student3;
		group.students[3] = student4;
		group.students[4] = student5;
		group.students[5] = student6;
		group.students[6] = student7;
		group.students[7] = student8;
		group.students[8] = student9;
		group.students[9] = student10;

		group.greetNewStudent();
		System.out.println("AvgAge = " + group.calculateAvgAge());

		System.out.println("Number of students entered in 2015 = " + group.numOfStudentin2015());

		group.yearOfMaxEnter();

		System.out.println();

	}

}
