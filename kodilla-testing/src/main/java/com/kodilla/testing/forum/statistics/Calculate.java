package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculate implements Statistics {

    List<String> usersNames = new ArrayList<>();
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


   public List<String> usersNames(){

       return usersNames;
   }

   public int postsCount(){

       return postsCount;
   }

   public int commentsCount(){

       return commentsCount;
   }


  public void calculateAdvStatistics(Statistics statistics){


       usersNames = statistics.usersNames();
       postsCount = statistics.postsCount();
       commentsCount = statistics.commentsCount();

      if (postsCount() > 0 ){
          averageCommentsPerPost = (double)statistics.commentsCount()/(double)statistics.postsCount();
      }

      else{
          averageCommentsPerPost = 0;
      }

      if (statistics.usersNames().size() > 0){
          averagePostsPerUser = (double)statistics.postsCount()/(double)statistics.usersNames().size();
          averageCommentsPerUser = (double)statistics.commentsCount()/(double)statistics.usersNames().size();
      }

      else{
          averageCommentsPerUser = 0;
          averagePostsPerUser = 0;
      }

  }




}
