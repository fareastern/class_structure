public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор", "Достоевский", 5);
        Book book1 = new Book("Идиот", 2020, author1, 555);

        System.out.println("О КНИГЕ: "+book1);
        System.out.println("В книге более 500 страниц? " + book1.isBig());
        System.out.println("Есть ли в книге слово \"Идиот\"? " + book1.matches("Идиот"));
        System.out.println("Стоимость книги: "+book1.estimatePrice()+" руб.");
    }
}