package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Application.properties")
public class Actor {
//    @Autowired
//
//    @Value("${actor.name}")
//    private String name;
//
//
//    @Value("${actor.gender}")
//    private String gender;
//
//
//    @Value("${actor.age}")
//    private int age;

   private String name;
   private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

 public int getAge() {
        return age;
  }

   public void setAge(int age) {
        this.age = age;
   }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
