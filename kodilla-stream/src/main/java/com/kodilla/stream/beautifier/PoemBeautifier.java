package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){
        String line = poemDecorator.decorate(text);
        System.out.println("Original text: " + text +"\nText after decoration : " + line + "\n");
    }

}
