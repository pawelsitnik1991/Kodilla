package SimpleTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AvgOfStudentsMarks {
    YoungStudent youngStudent1 = new YoungStudent("Pawel", "Sitnik", "12131231233");
    YoungStudent youngStudent2 = new YoungStudent("Kamil", "Waus", "12131231233");
    YoungStudent youngStudent3 = new YoungStudent("Genek", "Lenek", "12131231233");

    public static void main(String[] args) {

        List<Integer>studentMarks1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer>studentMarks2 = new ArrayList<>(Arrays.asList(1,5,3,4,5,6));
        List<Integer>studentMarks3 = new ArrayList<>(Arrays.asList(1,5,3,4,5,1));
        AvgOfStudentsMarks avgOfStudentsMarks = new AvgOfStudentsMarks();
        Map<YoungStudent, List<Integer>> student = new HashMap<>();
        student.put(avgOfStudentsMarks.youngStudent1, studentMarks1);
        student.put(avgOfStudentsMarks.youngStudent2, studentMarks2);
        student.put(avgOfStudentsMarks.youngStudent3, studentMarks3);

        System.out.println(avgOfStudentsMarks.youngStudent1.hashCode());
        System.out.println(avgOfStudentsMarks.youngStudent2.hashCode());
        System.out.println(avgOfStudentsMarks.youngStudent3.hashCode());
        for (Map.Entry<YoungStudent, List<Integer>> marksOfStudents: student.entrySet()) {
            double sum = 0;
            for (int i = 0; i < marksOfStudents.getValue().size(); i++) {
                sum = sum + marksOfStudents.getValue().get(i);
            }
            System.out.println(marksOfStudents.getKey()+" ma średnią ocen : "+sum/marksOfStudents.getValue().size());
        }

    }
}

class YoungStudent{
    private String firstName;
    private String lastName;
    private String peselId;

    public YoungStudent(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        YoungStudent e = (YoungStudent) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, peselId);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + peselId + ")";
    }

}
