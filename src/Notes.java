import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    private String notesName;
    private String notesColor;


    public Notes() {

    }

    public String newText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши заметку");
        String[] notess = new String[]{""};
        for (int i = 0; i < notess.length; i++) {
            notess[i] += scanner.nextLine();
            System.out.println(Arrays.toString(notess));

        }

        return Arrays.toString(notess);

    }

    public Notes(String notesName, String notesColor) {
        this.notesName = notesName;
        this.notesColor = notesColor;
    }

    public String getNotesName() {
        return notesName;
    }

    public void setNotesName(String notesName) {
        this.notesName = notesName;
    }

    public String getNotesColor() {
        return notesColor;
    }

    public void setNotesColor(String notesColor) {
        this.notesColor = notesColor;
    }
}
