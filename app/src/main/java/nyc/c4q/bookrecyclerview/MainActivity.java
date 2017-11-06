package nyc.c4q.bookrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.bookrecyclerview.controller.BookAdapter;
import nyc.c4q.bookrecyclerview.model.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView puppyRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);

        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book(R.drawable.firenexttime,"Fire Next Time", "James Baldwin", "1968"));
        booksList.add(new Book(R.drawable.mobydick, "Moby Dick", "Herman Mellville", "1968"));
        booksList.add(new Book(R.drawable.kafka,"Metamorphosis", "Franz Kafka", "1968"));
        booksList.add(new Book(R.drawable.firenexttime,"Fire Next Time", "James Baldwin", "1968"));
        booksList.add(new Book(R.drawable.mobydick, "Moby Dick", "Herman Mellville", "1968"));
        booksList.add(new Book(R.drawable.kafka,"Metamorphosis", "Franz Kafka", "1968"));


        BookAdapter bookAdapter = new BookAdapter(booksList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        puppyRecyclerView.setAdapter(bookAdapter);
        puppyRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
