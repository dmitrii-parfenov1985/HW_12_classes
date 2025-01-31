public class Main {


    public static void main(String[] args) {

        Book book = new Book("Мартин Тден", "Джек Лондон", 1909);
        System.out.println("book.title = " + book.getTitle());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());
        book.setYearOfPublication(2025);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        Author author = new Author("Джек", "Лондон");
        System.out.println("author.firstName = " + author.getFirstName());
        System.out.println("author.lastName = " + author.getLastName());
    }
}