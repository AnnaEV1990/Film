import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {


    @Test
    public void testFindAll() {
        Film film = new Film();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек невидимка";
        String movie6 = "Тролли мировой тур";
        String movie7 = "Номер один";

        film.add(movie1);
        film.add(movie2);
        film.add(movie3);
        film.add(movie4);
        film.add(movie5);
        film.add(movie6);
        film.add(movie7);
        String[] actual = film.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLast1() {
        Film film = new Film();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек невидимка";
        String movie6 = "Тролли мировой тур";
        String movie7 = "Номер один";

        film.add(movie1);
        film.add(movie2);
        film.add(movie3);
        film.add(movie4);
        film.add(movie5);
        film.add(movie6);
        film.add(movie7);
        String[] actual = film.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testLast2() {
        Film film = new Film(12);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек невидимка";
        String movie6 = "Тролли мировой тур";
        String movie7 = "Номер один";

        film.add(movie1);
        film.add(movie2);
        film.add(movie3);
        film.add(movie4);
        film.add(movie5);
        film.add(movie6);
        film.add(movie7);
        String[] actual = film.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testLast3() {
        Film film = new Film();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек невидимка";
        String movie6 = "Тролли мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Гарри Поттер";
        String movie9 = "Лунтик";

        film.add(movie1);
        film.add(movie2);
        film.add(movie3);
        film.add(movie4);
        film.add(movie5);
        film.add(movie6);
        film.add(movie7);
        film.add(movie8);
        film.add(movie9);
        String[] actual = film.findLast();
        String[] expected = {movie9, movie8, movie7, movie6, movie5};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testLast4() {
        Film film = new Film(6);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек невидимка";
        String movie6 = "Тролли мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Гарри Поттер";
        String movie9 = "Лунтик";

        film.add(movie1);
        film.add(movie2);
        film.add(movie3);
        film.add(movie4);
        film.add(movie5);
        film.add(movie6);
        film.add(movie7);
        film.add(movie8);
        film.add(movie9);
        String[] actual = film.findLast();
        String[] expected = {movie9, movie8, movie7, movie6, movie5, movie4};
        Assertions.assertArrayEquals(expected, actual);

    }
}
