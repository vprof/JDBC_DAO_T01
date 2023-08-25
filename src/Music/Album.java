package Music;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private List<MusicComposition> compositions;

    public Album(String title) {
        this.title = title;
        compositions = new ArrayList<>();
    }

    public void addComposition(MusicComposition composition) {
        compositions.add(composition);
    }

    public String calculateTotalDuration() {
        int totalDuration = 0;
        for (MusicComposition composition : compositions) {
            totalDuration += composition.getDuration();
        }

        int hours = totalDuration / 3600;
        int minutes = (totalDuration % 3600) / 60;
        int seconds = totalDuration % 60;

        return String.format("%d h %d min %d sec", hours, minutes, seconds);

    }

    public void rearrangeByStyle(String style) {
        List<MusicComposition> rearrangedCompositions = new ArrayList<>();
        for (MusicComposition composition : compositions) {
            if (composition.getStyle().equals(style)) {
                rearrangedCompositions.add(composition);
            }
        }
        for (MusicComposition composition : compositions) {
            if (!composition.getStyle().equals(style)) {
                rearrangedCompositions.add(composition);
            }
        }
        compositions = rearrangedCompositions;

        for (MusicComposition composition : compositions){
            System.out.println(composition.getTitle() + " " + composition.getStyle());
        }
    }

    public MusicComposition findCompositionByDuration(int minDuration, int maxDuration) {
        for (MusicComposition composition : compositions) {
            int duration = composition.getDuration();
            if (duration >= minDuration && duration <= maxDuration) {
                return composition;
            }
        }
        return null;
    }
}