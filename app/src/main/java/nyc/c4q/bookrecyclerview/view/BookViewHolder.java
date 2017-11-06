package nyc.c4q.bookrecyclerview.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nyc.c4q.bookrecyclerview.model.Book;
import nyc.c4q.bookrecyclerview.R;



/**
 * Created by amirahoxendine on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView bookCover;
    private TextView bookTitle;
    private TextView bookAuthor;
    private TextView publishingYear;


    public BookViewHolder(View itemView) {
        super(itemView);
        bookCover = (ImageView) itemView.findViewById(R.id.bookcover_imageview);
        bookTitle = (TextView) itemView.findViewById(R.id.book_title_textview);
        bookAuthor = (TextView) itemView.findViewById(R.id.book_author_textview);
        publishingYear = (TextView) itemView.findViewById(R.id.publishing_year_textview);
    }

    public void onBind(Book book){
        bookCover.setImageResource(book.getBookCover());
        bookTitle.setText(book.getBookTitle());
        bookAuthor.setText(book.getBookAuthor());
        publishingYear.setText(book.getPublishingYear());
    }
}
