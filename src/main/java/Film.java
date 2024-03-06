public class Film {
    private String[] movies = new String[0];
    private int limit;

    public Film() {
        this.limit = 5;
    }

    public Film(int limit) {
        this.limit = limit;
    }

    public void add(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenght;
        if (limit < movies.length) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }
        String[] result = new String[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
