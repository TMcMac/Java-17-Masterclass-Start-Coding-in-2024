public class Main {
    public static void main(String[] args) {
        Movie startWars = new Adventure("Star Wars: A New Hope");
        startWars.watchMovie();
        System.out.println();
        Movie canadianBacon = new Comedy("Canadian Bacon");
        canadianBacon.watchMovie();
        System.out.println();
        // testing the factory method getMovie
        Movie blairWitch = Movie.getMovie("Horror","The Blair Witch Project");
        blairWitch.watchMovie();
    }
}
