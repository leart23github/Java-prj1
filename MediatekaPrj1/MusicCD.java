public class MusicCD extends Media {

    public MusicCD(String ty, String n, String a, String t, String sz, String d) {
        setType(ty);
        setName(n);
        setArtist(a);
        setTitle(t);
        setSize(sz);
        setDuration(d);
    }

    public String toString() {
        return "Type: " + getType() + "\nName: " + getName() + "\nArtist: " + getArtist() + "\nTitle: " + getTitle()
                + "\nSize in mb: "
                + getSize() + "\nDuratin: "
                + getDuration() + "\n";
    }

}
