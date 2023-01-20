import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentsAndBooks {

    public static void main(String[] args) {
        List<Integer> listOfMark = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 4));
        StudentsAndBooks studentsAndBooks = new StudentsAndBooks();
        System.out.println(studentsAndBooks.getStudentGradesMinusMinAndMax(listOfMark));
        studentsAndBooks.getListOfBook();
    }

    public double getStudentGradesMinusMinAndMax(List<Integer> tabOFMark) {
        int min = 7;
        int max = 0;
        for (int i = 0; i < tabOFMark.size(); i++) {
            if (tabOFMark.get(i) < min) {
                min = tabOFMark.get(i);
            }
            if (tabOFMark.get(i) > max) {
                max = tabOFMark.get(i);
            }
        }
        double sum = 0;
        for (Integer mark : tabOFMark) {
            sum = sum + mark;
        }
        return (sum - max - min) / (tabOFMark.size() - 2);
    }

    public void getListOfBook() {
        List<String> lotr = new LinkedList<>();
        lotr.add(0, "Pieciu Armii");
        lotr.add(1, "Hobbit");
        lotr.add(2, "Pierscien");

        List<String> gargamel = new LinkedList<>();
        gargamel.add(0, "Gargamel");
        gargamel.add(1, "Smerfy");

        HashMap<Integer, List> rokWydania = new HashMap<>();

        rokWydania.put(2011, lotr);
        rokWydania.put(1991, gargamel);

        for (Map.Entry<Integer, List> book : rokWydania.entrySet()) {
            if (book.getKey() > 2000) {
                System.out.println(book.getValue());
            }
        }
    }
}

