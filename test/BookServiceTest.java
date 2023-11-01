import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    // У вас есть класс BookService, который использует интерфейс BookRepository для получения информации
    // о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
    // используя Mockito для создания мок-объекта BookRepository
    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;
    private List<Book> fakeData = new ArrayList<>();


    @BeforeEach
    void testinit() {
        bookService = new BookService(bookRepository);
        fakeData.add(new Book("1","Преступление и наказание", "Достоевский"));
        fakeData.add(new Book("2","Вий", "Гоголь"));
    }

    @Test
    @DisplayName("test of searching all books in the book repository - method findAllBooks")
    void testBookServiceAll(){
        when(bookRepository.findAll()).thenReturn(fakeData);
        assertEquals(fakeData, bookService.findAllBooks());
    }

    @Test
    @DisplayName("test of searching the book by id - method findBookById")
    void testBookServiceId(){
        when(bookRepository.findById(anyString())).thenReturn(fakeData.get(1));
        assertEquals(fakeData.get(1), bookService.findBookById("2"));}

    }

