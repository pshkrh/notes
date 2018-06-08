package com.pshkrh.notes.Model;

import java.util.ArrayList;
import java.util.List;

public class Note {
    public String title,description,date;

    public Note(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static ArrayList<Note> createNotesList() {
        ArrayList<Note> notes = new ArrayList<Note>();
        return notes;
    }
}
