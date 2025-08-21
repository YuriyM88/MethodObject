//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Кэтти", "Сьерра");
        Author author2 = new Author("Берт", "Бейтс");
        Author author3 = new Author("Кэтти", "Сьерра");

        Book book1 = new Book("Классы", author1, 2023);
        Book book2 = new Book("Объекты", author2, 2024);
        Book book3 = new Book("Классы", author1, 2023);
        Book book4 = new Book("Классы", author3, 2023);

        System.out.println("Название первой книги - " + book1.getTitle() + ", автор - " + book1.getAuthor() + " год - " + book1.getPublicationYear());
        System.out.println("Название второй книги - " + book2.getTitle() + ", автор - " + book2.getAuthor() + " год - " + book2.getPublicationYear());

        book2.setPublicationYear(2026);
        System.out.println("Обновленный год публикации второй книги: " + book2.getPublicationYear());


        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);
        System.out.println("Автор 1: " + author1);

        System.out.println("Автор1 equals Автор2: " + author1.equals(author2));
        System.out.println("Автор1 equals Автор2: " + author1.equals(author3));

        System.out.println("HashCode Автор1: " + author1.hashCode());
        System.out.println("HashCode Автор2: " + author2.hashCode());
        System.out.println("HashCode Автор3: " + author3.hashCode());
        System.out.println("HashCode Книга1: " + book1.hashCode());
        System.out.println("HashCode Книга2: " + book2.hashCode());
        System.out.println("HashCode Книга3: " + book3.hashCode());
        System.out.println("HashCode Книга4: " + book4.hashCode());
    }
}