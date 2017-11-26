package email.service.constants;

import java.util.ArrayList;
import java.util.List;

public abstract class Constants {
    private static final List<String> SUBJECTS = new ArrayList<String>();
    private static final List<String> CONTENTS = new ArrayList<String>();
    public static final String MY_MAIL = "iliyanlesev@gmail.com";
    public static final int HOUR_IN_MS = 3600000;
    private static boolean addedUsers = false;
    private static boolean addedSubjects = false;
    private static boolean addedContents = false;

    public static List<String> getSubjects() {
        addSubject();
        return SUBJECTS;
    }

    private static void addSubject() {
        if(!addedSubjects) {
            SUBJECTS.add("Проект - СА 2017");
            SUBJECTS.add("Проект по СА");
            SUBJECTS.add("Проект по Софтуерни архитектури");
            SUBJECTS.add("Софтуерни архитектури - проект");
            addedSubjects = true;
        }
    }

    public static List<String> getContents() {
        addContents();
        return CONTENTS;
    }

    private static void addContents() {
        if(!addedContents) {
            CONTENTS.add("Здравейте доц. Биров,\n" +
                    "\n" +
                    "Бяхте казали, че ще ни изпратите тема за проект по Софтуерни Архитектури. Кога можем да я очакваме? " +
                    "Екипът ни се състои от:\n" +
                    "1. Александра Матева - 81197(лидер);\n" +
                    "2. Илиян Лесев - 81190\n;" +
                    "3. Виктория Атанасова - 81206;\n" +
                    "4. Дарин Тодоров - 81100. \n" +
                    "Благодаря предварително.\n" +
                    "\n" +
                    "С уважение,\n" +
                    "Илиян Лесев");
            CONTENTS.add("Здравейте доц. Биров, \n" +
                    "\n" +
                    "Пиша ви във връзка с проектите по Софтуерни Архитектури. На срещата, която имаме с вас" +
                    " бяхте казали, че ще ни пратите тема за проект. Такава тема все още нямаме, нито шаблон. " +
                    "Моля пратете ни, тъй като презентациите наближават скоро. " +
                    "Екипът ни се състои от:\n" +
                    "1. Александра Матева - 81197(лидер);\n" +
                    "2. Илиян Лесев - 81190;\n" +
                    "3. Виктория Атанасова - 81206;\n" +
                    "4. Дарин Тодоров - 81100. \n" +
                    "Благодаря Ви предварително.\n" +
                    "\n" +
                    "С уважение,\n" +
                    "Илиян Лесев"
            );
            CONTENTS.add("Здравейте доц. Биров, \n" +
                    "\n" +
                    "Възможно ли е да ни пратите тема по Софтуерни архитектури, тъй като все още нямаме такава, " +
                    "а презентацията на проектите наближава?" +
                    "Екипът ни се състои от:\n" +
                    "1. Александра Матева - 81197(лидер);\n" +
                    "2. Илиян Лесев - 81190;\n" +
                    "3. Виктория Атанасова - 81206;\n" +
                    "4. Дарин Тодоров - 81100. \n" +
                    "\n" +
                    "С уважение,\n" +
                    "Илиян Лесев"
            );
            addedContents = true;
        }
    }
}
