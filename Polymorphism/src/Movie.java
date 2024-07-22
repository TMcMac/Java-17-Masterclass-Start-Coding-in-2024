public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        // THis line will allow the subcalsses to get their own class name to specify genre
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'H' -> new Horror(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Character introduction",
                "Conflict/Setback for protagonist",
                "Hero rises to the challenge");
    }
}


class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Silly premise",
                "Goofs and Slap Stick",
                "Happy ending");
    }
}

class Horror extends Movie{
    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Seemingly normal",
                "Tension builds to scary",
                "All or most characters don't make it");
    }
}
