/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author purohiam
 */
public class TestUserprofile {
    public static void main(String[] args){
//        Create a class called TestUserprofile with main method  where a user wants to create a new profile.
//                The user will enter their name and choose their favourite Genre from a displayed list
//                of the possible Genres. The user will then see a message that their userProfile was created.
     Scanner scan = new Scanner(System.in);
     String input="";
     int genreInput=0;
     
     UserProfile userProfile = new UserProfile();
     System.out.println("Hi, Please enter a ID to create your User Profile: ");
     input = scan.nextLine();
     userProfile.setUserID(input);
     System.out.println("Hi, Please enter your Name: ");
     input = scan.nextLine();
     
     for (int i=0;i<4;i++){
        System.out.println("Enter "+(i+1)+" for "+userProfile.getGenres()[i]);
     }
     userProfile.getGenre();
     System.out.println("Hi, Please Choose your favorite genre: ");
     genreInput = scan.nextInt();
     
     
     userProfile.setName(input);
     userProfile.setGenre(genreInput);
     System.out.println("Your User Profile has been Created Successfully!");
      System.out.printf("User ID: %10s \nUser Name: %10s \nGnere: %15s \n" , userProfile.getUserID(),userProfile.getName(),userProfile.getGenre());
     
     

    }
}
