package fr.wildcodeschool.atelierdesignpatterns;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

class NewsSingleton extends Observable {

    private static NewsSingleton sInstance = null;
    private List<NewsModel> mNewsList = new ArrayList<>();

    private NewsSingleton() {}

    static NewsSingleton getInstance() {
        if (sInstance == null) {
            sInstance = new NewsSingleton();
        }
        return sInstance;
    }

    void loadNews() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference newsRef = database.getReference("news");
        newsRef.addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) {
                //
            }
            @Override public void onCancelled(DatabaseError databaseError) {}
        });
    }

    List<NewsModel> getNews() { return mNewsList; }
}