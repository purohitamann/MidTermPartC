/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author Aman Purohit , Feb'2023 (991669656)
 */
public class UserProfile 
{
    // comment before fetch + merge
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    private String Name; // name of user
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
    
    public UserProfile(){
        
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(int genre) {
        this.genre = this.genres[genre-1];
    }
    
    
    
    
    
}//end class
