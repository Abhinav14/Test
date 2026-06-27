package designpattern.creational.builder;

public class Song {
    private final String title;
    private final String singerName;
    private final String movieName;

    private Song(Builder builder){
        this.title = builder.title;
        this.singerName = builder.singerName;
        this.movieName = builder.movieName;
    }

    public static class Builder{
       private String title;
       private String singerName;
       private String movieName;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setSingerName(String singerName) {
            this.singerName = singerName;
            return this;
        }

        public Builder setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        public Song build(){
            return new Song(this);
        }
    }

    @Override
    public String toString() {
        return "Song{" +
                "Title='" + title + '\'' +
                ", Singer Name='" + singerName + '\'' +
                ", Movie Name='" + movieName + '\'' +
                '}';
    }
}
