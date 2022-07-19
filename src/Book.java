import java.util.Scanner;

public class Book {
    String name;
    String author;
    int year;
    int raiting;
    int increase = 0;
    String text=" ";
    String moreText=null;

    public Book(String name, String author, int year, int raiting, String text) {
        this.name = name;
        this.author = author;
        this.year = year;
        raiting = 3;
    }

    public void up(int raiting) {
        System.out.println ("Nazvanie knigi "+ name+", "+" Nazvanie avtora "+author+ ", "+ " God vipuska "+ year+", "+"reiting " +3+", "+ "Tekst knigi "+":"+text);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ocenite knigu ot 0 do 5 ili viberete avtomaticheskuyu ocenku, napisav (20)");
        raiting = scanner.nextInt();
        if (raiting <5){
            raiting++;}
        else {
            raiting--;
        }
        //if (increase==20) {
        //    increase=increase+1;}

        //    if (increase > 5) {
          //      increase=increase-1;

         //   } else if (0 < increase && increase < 5) {
            //    System.out.println("Vasha ocenka uchtena");
          //  } else {
           //     System.out.println("Reiting ne mozhet bit' men'she 0 i bol'she 5");
          //  }
        }

        public void append(String moreText){
                   // Scanner scanner = new Scanner(System.in);
            //System.out.println("Vvedite text knigi " + name);
           // moreText = scanner.nextLine();
            text += moreText;
            System.out.println("Nazvanie knigi "+ name+", "+" Nazvanie avtora "+author+ ", "+ " God vipuska "+ year+", "+"reiting " +3+", "+ "Tekst knigi "+":"+text);
        }
    }






