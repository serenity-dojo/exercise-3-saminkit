package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog(){
        String Name= "Fido";
        String FavoriteToy = "Bone";
        int Age = 5;
        Dog Fido= new Dog("Fido","Bone",5);
        Assert.assertEquals(Fido.getName(),"Fido");
        Assert.assertEquals(Fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(Fido.getAge(),5);
        System.out.println(Fido.getName());
        System.out.println(Fido.getFavoriteToy());
        System.out.println(Fido.getAge());
    }
}
