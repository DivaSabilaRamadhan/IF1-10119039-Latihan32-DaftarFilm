/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan Daftar Film
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public String filmRating;
    public String filmDuration;
    
    public static void main(String[] args) {
        System.out.println("====Daftar Film Sedang Tayang====");
        System.out.println();
        
        // Menampilkan Film 1
        nowPlaying("Venom " , "Action, Horor, Scifi",8.5,120);
        System.out.println();
        
        // Menampilkan Film 2
        nowPlaying("Small Foot","Animation",9.0,96);
        System.out.println();
        
        // Menampilkan Film 3
        nowPlaying("Crazy Rich Asian","Comedy",7.8,119);
        System.out.println();
        
        // Menampilkan Film 4
        nowPlaying("Asih","Horor",6.0,100);
         System.out.println();
         
        
    }
    
    public static void nowPlaying(String filmName,String filmGenre, double filmRating, int filmDuration){
      System.out.println("Judul Film    : " + filmName);
      System.out.println("Genre Film    : " + filmGenre);
      System.out.println("Rating Film   : " + filmRating);
      System.out.println("Durasi Film   : " + filmDuration + " Menit ");
      
    }
    
}
