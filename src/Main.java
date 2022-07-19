public class Main {
    public static void main (String [] args) {
        String name;
        String author;
        int year;
        int raiting;
        String text;
        String moreText="Jane podoshla k oknu";
        Book book=new Book("Jane Eyre", "Sharlott Bronte", 1847, 3, null);
        book.up(4);
        book.append ("Jane podoshla k oknu");
        System.out.println(book);

    }
}
