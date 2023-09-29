package homework;

/*
 *   Display students grades in a table
 */
public class SchoolGrades {
    public static void main(String[] args) {
        String border = "|---------------------|";
        char newLine = '\n';
        String ученик = "Ученик";
        String оценка = "Оценка";
        String иванчо = "Иванчо";
        byte иванчоОценка = 2;
        String ани = "Ани";
        byte аниОценка = 5;
        String марийка = "Марийка";
        byte марийкаОценка = 6;
        String пенчо = "Пенчо";
        byte пенчоОценка = 4;
        String бориславчо = "Бориславчо";
        byte бориславчоОценка = 5;

        System.out.printf(
             "%s"              + newLine +
             "| %-10s | %-7s|" + newLine +
             "%s"              + newLine +
             "| %-10s | %-7d|" + newLine +
             "| %-10s | %-7d|" + newLine +
             "| %-10s | %-7d|" + newLine +
             "| %-10s | %-7d|" + newLine +
             "| %-10s | %-7d|" + newLine +
             "%s",
             border, ученик, оценка, border, иванчо, иванчоОценка, ани, аниОценка, марийка, марийкаОценка, пенчо, пенчоОценка, бориславчо, бориславчоОценка, border
        );


//        System.out.println(Иванчо);

    }
}
