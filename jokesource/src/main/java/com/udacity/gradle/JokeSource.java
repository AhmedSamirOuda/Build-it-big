package com.udacity.gradle;

import java.util.Random;

public class JokeSource {

    String[] funnyJokes = {"Can a kangaroo jump higher than a house? Of course, a house doesn`t jump at all." +
            "\n" +
            "\n" +
            "   That`s FUNNY! :) :) ;)",


            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.\"" +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.\n" +
                    "\n" +
                    "The farmer says, \"Sure, go right ahead. And if my bull sees you, you`ll even catch the 4:11 one." +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            " Anton, do you think I`m a bad mother?\n" +
                    "\n" +
                    "My name is Paul." +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away." +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "Mother: \"How was school today, Patrick?\"\n" +
                    "\n" +
                    "Patrick: \"It was really great mum! Today we made explosives!\"\n" +
                    "\n" +
                    "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                    "\n" +
                    "Patrick: \"What school?\"" +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "\"Mom, where do tampons go?\"\n" +
                    "\n" +
                    "\"Where the babies come from, darling.\"\n" +
                    "\n" +
                    "\"In the stork?\"" +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "Some nice Chinese couple gave me a very good camera down by the Washington Monument." +
                    " I didn`t really understand what they were saying," +
                    " but it was very nice of them." +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)",


            "What do you get when you cross-breed a cow and a shark? \n" +
                    " \n" +
                    "I don`t know, but I wouldn't enjoy milking it." +
                    "\n" +
                    "\n" +
                    "That`s FUNNY! :) :) ;)"
    };

    public String getJoke() {
        Random generator = new Random();
        int jokeIndex = generator.nextInt(funnyJokes.length);
        String retrievedJoke = funnyJokes[jokeIndex];
        return retrievedJoke;

}
}




