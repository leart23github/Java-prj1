public class Mediateka {
    public static void main(String[] args) {

        MusicCD music1 = new MusicCD("CD", "Ed Sheeran - South of the Border", "Ed Sheeran", "South of the Border",
                "11", "00:03:24");
        VideoDVD video1 = new VideoDVD("DVD", "Interstellar", "Christopher Nolan", "2574", "2:50:00");
        EBook ebook1 = new EBook("EBook", "Effective Java", "Joshua Bloch", "109", "414");

        Media[] medias = {
                music1,
                video1,
                ebook1
        };

        for (int i = 0; i < medias.length; i++) {
            System.out.println(medias[i].toString());
        }

    }
}
