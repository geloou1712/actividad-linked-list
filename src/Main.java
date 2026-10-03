public class Main {
    public static void main(String[] args) {
        // Lista de libros
        SinglyLinkedList<Book> books = new SinglyLinkedList<>();
        books.insertLast(new Book("Clean Code", "Robert C. Martin"));
        books.insertLast(new Book("Effective Java", "Joshua Bloch"));
        books.insertFirst(new Book("Refactoring", "Martin Fowler"));
        books.traverse();
        System.out.println("Existe Clean Code: " + books.contains(new Book("Clean Code", "Robert C. Martin")));
        books.remove(new Book("Clean Code", "Robert C. Martin"));
        books.traverse();

        SinglyLinkedList<String> names = new SinglyLinkedList<>();

        names.insertLast("Ana");
        names.insertLast("Luis");
        names.insertLast("Marta");

        System.out.println("Nombres antes de borrar:");
        names.traverse();

        names.remove("Ana");

        System.out.println("Nombres después de borrar:");
        names.traverse();
    }
}