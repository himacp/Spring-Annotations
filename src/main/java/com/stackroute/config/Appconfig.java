//package com.stackroute.config;
//
//import com.stackroute.domain.Actor;
//import com.stackroute.domain.Movie;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Appconfig
//{
//    @Bean("actor")
//    public Actor getActorBean1()
//    {
//        Actor actor=new Actor("Hima","female",22);
//        return actor;
//    }
//
//    @Bean("actor")
//    public Actor getActorBean2()
//    {
//        Actor actor=new Actor("Prabha","female",45);
//        return actor;
//    }
//
//    @Bean("actor")
//    public Actor getActorBean3()
//    {
//        Actor actor=new Actor("Pujitha","female",23);
//        return actor;
//    }
//    @Bean("movie1")
//    public Movie getMovieBean1()
//    {
//        return new Movie(getActorBean1());
//    }
//    @Bean("movie2")
//    public Movie getMovieBean2()
//    {
//        return new Movie(getActorBean2());
//    }
//    @Bean("movie3")
//    public Movie getMovieBea31()
//    {
//        return new Movie(getActorBean3());
//    }
//}


package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class Appconfig{
}
