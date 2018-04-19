package controllers;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.books.create;
import views.html.books.index;
import javax.inject.Inject;
import java.util.Set;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;

    //Shows all books to user
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //Creates a book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookFrom));
    }

    //Saves book
    public Result save(){
        return TODO;
    }

    //Edits a book
    public Result edit(Integer id){
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    //Displays single book
    public Result show(Integer id){
        return TODO;
    }

}
