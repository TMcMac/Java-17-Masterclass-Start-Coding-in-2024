public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Student s = new Student("S92400" + i,
                    switch(i) {
                        case 1 -> "Tim";
                        case 2 -> "John";
                        case 3 -> "Mary";
                        case 4 -> "Lisa";
                        case 5 -> "Laura";
                        default -> "Anonymous";
                    },
                    "5/1/1987,",
                    "Java Masterclass");
            System.out.println(s);
        }
        System.out.println("\n");
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92500" + i,
                    switch(i) {
                        case 1 -> "Mike";
                        case 2 -> "Bob";
                        case 3 -> "Susan";
                        case 4 -> "Teddy";
                        case 5 -> "Ricky";
                        default -> "Anonymous";
                    },
                    "6/1/1987,",
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("SRG001","Greg", "12/31/90", "Java on Coursera");
        LPAStudent lpaStudent = new LPAStudent("SRG002","Becky", "12/31/90", "Java on Coursera");

        // When accessing attributes, pojo or javabeans use getters
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        // Records us lower camel case with just the attribute name
        System.out.println(lpaStudent.name() + " is taking " + lpaStudent.classList());
    }

    // Records are meant to be immutible so they do not have setters, if you need to change data on an instance better to use Pojo or JavaBeans

}
