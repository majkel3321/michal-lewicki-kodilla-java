package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculate implements Statistics {

    Statistics statistics;

    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    public Calculate(Statistics statistics){

        this.statistics = statistics;
       // averagePostsPerUser = (double)statistics.postsCount()/(double)statistics.usersNames().size();
    }



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

        if(postsCount() == 0 || usersNames().size() == 0){
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }
        else {

            averagePostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
            averageCommentsPerUser = (double)statistics.commentsCount() / (double)statistics.usersNames().size();
            averageCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        }
   }




}
