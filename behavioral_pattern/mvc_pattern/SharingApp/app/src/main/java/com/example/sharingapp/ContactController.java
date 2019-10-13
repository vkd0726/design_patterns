package com.example.sharingapp;

import android.database.Observable;

import java.util.Observer;

public class ContactController {
    private Contact contact;

    public ContactController(Contact contact){
        this.contact = contact;
    }

    public String getContactId(){
        return contact.getId();
    }

    public void setContactId(){
        contact.setId();
    }

    public void updateContactId(String id){
        contact.updateId(id);
    }

    public String getContactusername(){
        return contact.getUsername();
    }

    public void setContactUsername(String username){
        contact.setUsername(username);
    }

    public String getContactEmail(){
        return contact.getEmail();
    }

    public void setContactEmail(String email){
        contact.setEmail(email);
    }

    public void addContactObserver(Observer observer){
        contact.addObserver(observer);
    }

//    public void removeContactObserver(Observer observer){
//        contact.removeObserver(observer);
//    }
}
