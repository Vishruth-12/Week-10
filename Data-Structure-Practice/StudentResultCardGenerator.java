import java.util.Scanner;

public class StudentResultCardGenerator {
    static class Student {
        String name;
        int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        double average() {
            int sum = 0;
            for (int mark : marks) sum += mark;
            return (double) sum / marks.length;
        }

        char grade() {
            double avg = average();
            if (avg >= 75) return 'B';
            if (avg >= 60) return 'C';
            if (avg >= 40) return 'D';
            return 'F';
        }

        void printResult() {
            System.out.printf("%s: Average %.1f, Grade %c%n",
                    name.toUpperCase(), average(), grade());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = sc.nextInt();
        for (int i = 0; i < studentCount; i++) {
            String name = sc.next();
            int[] marks = new int[3];
            for (int j = 0; j < marks.length; j++) marks[j] = sc.nextInt();
            new Student(name, marks).printResult();
        }
        sc.close();
    }
}
