package com.c4c.oyfy.app.illust;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.domain.illust.IllustSearchService;

@Controller
public class IllustSearchController {
    @Autowired
    IllustSearchService illustSearchService;
    /**
     * イラスト検索画面表示
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(value = "illust", method = RequestMethod.GET)
    public String illust(IllustItemForm form, Model model) {

        BooksCreationDto booksForm = new BooksCreationDto();

        for (int i = 1; i <= 3; i++) {
            booksForm.addBook(new Book());
        }
        Book book = new Book();
        book.setId(1);
        book.setAuthor("q");
        book.setTitle("aaaa");

        List<Book> books = new ArrayList<>();
        books.add(book);
        model.addAttribute("form", booksForm);
//        model.addAttribute("books", books);

        IllustSearchForm illustSearchForm = IllustHelper.toForm(illustSearchService.findAllTag());
        model.addAttribute("illustSearchForm", illustSearchForm);
        // ここでイラストとってテーブルが必要だよね
        // タグが必要
        return "illust/illust";
    }

    /**
     * イラスト検索
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(path = "/illust", method = RequestMethod.POST)
    public String search(@ModelAttribute IllustSearchForm form, Model model){
        // 検索結果一覧画面表示
        return "searchResult";
    }
}
