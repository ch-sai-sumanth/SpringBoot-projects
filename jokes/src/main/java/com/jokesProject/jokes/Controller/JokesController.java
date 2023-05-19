package com.jokesProject.jokes.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JokesController {

    List<String> JokesList =new ArrayList<>();
    @GetMapping(value="/jokes")
   public String getJokes()
   {


       JokesList.add("What did the snail who was riding on the turtle's back say? Wheeeee!");
       JokesList.add("What do you call a lazy kangaroo? A pouch potato.");
       JokesList.add("What does a pig put on dry skin? Oinkment.");
       JokesList.add("What do you call it when a snowman throws a tantrum? A meltdown.");
       JokesList.add("My uncle named his dogs Timex and Rolex. They're his watch dogs.");

       //min+(int)(Math.ramdom() * ( max-min)+1
       int random=0+(int)( Math.random()*((JokesList.size()-0)+1));


       return JokesList.get(random);
   }

   @PostMapping(value="/jokes")
    public String setJoke(@RequestBody String randomJoke)
   {
       JokesList.add(randomJoke);
       return "Joke saved";
   }


}
