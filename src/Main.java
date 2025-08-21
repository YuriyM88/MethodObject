//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Кэтти", "Сьерра");
        Author author2 = new Author("Берт", "Бейтс");

        Book book1 = new Book("Классы", author1, 2023);
        Book book2 = new Book("Объекты", author2, 2024);

        System.out.println("Название первой книги - " + book1.getTitle() + ", автор - " + book1.getAuthor() + " год - " + book1.getPublicationYear());
        System.out.println("Название второй книги - " + book2.getTitle() + ", автор - " + book2.getAuthor() + " год - " + book2.getPublicationYear());

        book2.setPublicationYear(2026);
        System.out.println("Обновленный год публикации второй книги: " + book2.getPublicationYear());

    }
}