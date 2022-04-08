public class EBook extends Media {
    private String author;
    private String numberOfPages;

    public EBook(String ty, String n, String a, String sz, String np) {
        setType(ty);
        setName(n);
        setAuthor(a);
        setSize(sz);
        setNumberOfPages(np);
    }

    public String toString() {
        return "Type: " + getType() + "\nName: " + getName() + "\nAuthor: " + getAuthor() + "\nSize in mb: "
                + getSize() + "\nNumber of pages: "
                + getNumberOfPages() + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
