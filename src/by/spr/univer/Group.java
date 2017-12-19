package by.spr.univer;

public class Group {

	int number;
	Student students[];

	public void greetNewStudent() {
		System.out.println("Hello new student!");
		// student.enterYear = 1999;

	}

	public int calculateAvgAge() {
		int sum = 0, num = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				sum = sum + students[i].age;
				num++;
			}
		}
		int avgAge = sum / num;

		return avgAge;

	}

	public int numOfStudentin2015() {
		int numInYear2015 = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].enterYear == 2015) {
					numInYear2015++;
				}
			}

		}
		return numInYear2015;
	}

	public void yearOfMaxEnter() {

		int tempYear = 0;
		int countarrsize = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				countarrsize++;
			}
		}

		int[] countarr = new int[countarrsize];

		for (int i = 0; i < students.length; i++) {
			int count = 0;

			if (students[i] != null) {

				tempYear = students[i].enterYear;
				for (int j = 0; j < students.length; j++) {
					if (students[j] != null) {
						if (tempYear == students[j].enterYear) {
							count++;

						}
					}
				}
				// System.out.println("В " + tempYear + " году поступило " + count + "
				// студентов(-а)");
				countarr[i] = count;
			}

		}

		int maxcountarrelement = countarr[0];
		int maxElIndex = 0;
		for (int i = 1; i < countarr.length; i++) {

			if (maxcountarrelement < countarr[i]) {
				maxcountarrelement = countarr[i];
				maxElIndex = i;
			}
		}

		System.out.println("Max number of students entered in " + students[maxElIndex].enterYear + " ("
				+ maxcountarrelement + " people)");

	}

}
