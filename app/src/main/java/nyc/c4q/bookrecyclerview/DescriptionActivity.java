package nyc.c4q.bookrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    Bundle bookBundle;
    private ImageView bookCover;
    private TextView bookTitle;
    private TextView bookAuthor;
    private TextView publishingYear;
    private TextView bookDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        bookBundle = getIntent().getExtras();
        bookCover = (ImageView) findViewById(R.id.bookcover_imageview);
        bookCover.setImageResource(bookBundle.getInt("bookCover"));
        bookTitle = (TextView) findViewById(R.id.book_title_textview);
        bookTitle.setText(bookBundle.getString("bookTitle"));

    }
}
