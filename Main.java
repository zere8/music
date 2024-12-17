//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Song {
            private String title;
            private String genre;
            private String artist;

            public Song(String title, String genre, String artist) {
                this.title = title;
                this.genre = genre;
                this.artist = artist;
            }

            public String getSong() {
                return "Song: " + title + ", Genre: " + genre + ", Artist: " + artist;
            }
        }

        class Artist {
            private String name;
            private String genre;
            private String songs;

            public Artist(String name, String genre, String songs) {
                this.name = name;
                this.genre = genre;
                this.songs = songs;
            }

            public String getArtist() {
                return "Artist: " + name + ", Genre: " + genre + ", Songs: " + songs;
            }
        }

        class Playlist {
            private String name;
            private String songs;

            public Playlist(String name, String songs) {
                this.name = name;
                this.songs = songs;
            }

            public String getPlaylist() {
                return "Playlist: " + name + ", Songs: " + songs;
            }
        }

                Song song = new Song("Wildflower", "Pop", "Billie Eilish");
                Artist artist = new Artist("Billie Eilish", "Pop", "Wildflower");
                Playlist playlist = new Playlist("Hit Me Hard and Soft", "Chiciro, Skinny");

                System.out.println(song.getSong());
                System.out.println(artist.getArtist());
                System.out.println(playlist.getPlaylist());
            }
        }



