package com.kodilla.exception.index;

public class IndexExceptionRunner {
    public static void main(String[]args){

        VideoCollector videoCollector = new VideoCollector();



        if (videoCollector.getCollection().size() > 1) {

            String video = videoCollector.getCollection().get(0);
            String video1 = videoCollector.getCollection().get(1);

            System.out.println(video);
            System.out.println();
        }

    }
}
