package ua.ithillel.ui.homework20;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String faile = "user.dat";
        UserDataSaver.saveUserData(faile);
        UserDataReader read =new UserDataReader();
      try {
          read.readUserData(faile);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

    }
}
