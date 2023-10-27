package com.serenitydojo;
public class Dog {
    public String Name;
    public String FavoriteToy;
    public int Age;
    public Dog(String Name, String FavoriteToy, int Age) {
        this.Name = Name;
        this.FavoriteToy=FavoriteToy;
        this.Age=Age;
    }
    public void setName(){
        this.Name= Name;
    }
    public String getName(){
        return Name;
    }
    public void setFavoriteToy(){
     this.FavoriteToy=FavoriteToy;
    }
    public String getFavoriteToy(){
        return FavoriteToy;
    }
    public void setAge(){
    }
    public int getAge(){
        return Age;
    }

}
