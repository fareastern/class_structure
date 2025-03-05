public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    public Author author;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }
    public boolean matches(String word) {
        return title.contains(word) || author.fullName().contains(word);
    }
    public int estimatePrice(){
        return Math.max((int)Math.floor(3 * pages * Math.sqrt(author.rating)), 250);
    }

    public String toString(){
        return author.fullName()+" \""+ title +"\", "+ releaseYear+ ". "+pages+" с.";
    }
}