package controller;

import entiry.Book;
import service.BookService;
import view.BookAdmin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

/**
 * BookController表示层
 *
 * 对数据库的访问通过业务逻辑层的方法调用来实现
 */
public class BookController extends BookAdmin {


    @Override
    public void deleteBook() {
        String id=delIdText.getText();
        boolean deleteSuccess=bookService.deleteBook(id);
        if(deleteSuccess){
            queryAll();
        }else{
            JOptionPane.showMessageDialog(this,"图书不存在！");
        }
    }
	
	
    public void deleteaaaBook() {
        String id=delIdText.getText();
        boolean deleteSuccess=bookService.deleteBook(id);
        if(deleteSuccess){
            queryAll();
        }else{
            JOptionPane.showMessageDialog(this,"图书不存在！");
        }
    }
	
	
	
	
	
	
	


}
