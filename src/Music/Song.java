package Music;

public class Song extends MusicComposition{

    private String style;

    public Song(String title, int duration, String style) {
        super(title, duration);
        this.style = style;
    }

    @Override
    public String getStyle() {
        return style;
    }
}
