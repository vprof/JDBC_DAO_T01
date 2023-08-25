import Music.*;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("Best Hits");

        Song song1 = new Song("Song 1", 180, "Pop");
        Song song2 = new Song("Song 2", 210, "Rock");
        Song song3 = new Song("Song 3", 420, "Classic");
        Song song4 = new Song("Song 4", 410, "Rap");
        Song song5 = new Song("Song 5", 315, "Rock");

        album.addComposition(song1);
        album.addComposition(song2);
        album.addComposition(song3);
        album.addComposition(song4);
        album.addComposition(song5);

        String totalDuration = album.calculateTotalDuration();
        System.out.println("Total Duration: " + totalDuration);

        // Перестановка композицій за стилем
        album.rearrangeByStyle("Rock");

        // Знайти композицію за діапазоном тривалості
        MusicComposition foundComposition = album.findCompositionByDuration(180, 200);
        if (foundComposition != null) {
            System.out.println("Found composition: " + foundComposition.getTitle());
        } else {
            System.out.println("No composition found in the specified duration range.");
        }
    }
}