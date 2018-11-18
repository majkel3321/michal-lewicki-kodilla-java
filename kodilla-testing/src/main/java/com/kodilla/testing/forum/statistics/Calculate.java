package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculate implements Statistics {

    Statistics statistics;

    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


   public List<String> usersNames(){

       return statistics.usersNames();
   }

   public int postsCount(){

       return statistics.postsCount();
   }

   public int commentsCount(){

       return statistics.commentsCount();
   }


  public void calculateAdvStatistics(Statistics statistics){

       this.statistics = statistics;

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
