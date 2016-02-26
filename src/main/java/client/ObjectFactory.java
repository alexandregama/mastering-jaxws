
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookQuantityByCode_QNAME = new QName("http://book.stock.jaxws.mastering.com/", "bookQuantityByCode");
    private final static QName _BooksFromItsCodeResponse_QNAME = new QName("http://book.stock.jaxws.mastering.com/", "booksFromItsCodeResponse");
    private final static QName _BookQuantityByCodeResponse_QNAME = new QName("http://book.stock.jaxws.mastering.com/", "bookQuantityByCodeResponse");
    private final static QName _BooksFromItsCode_QNAME = new QName("http://book.stock.jaxws.mastering.com/", "booksFromItsCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookQuantityByCode }
     * 
     */
    public BookQuantityByCode createBookQuantityByCode() {
        return new BookQuantityByCode();
    }

    /**
     * Create an instance of {@link BookQuantityByCodeResponse }
     * 
     */
    public BookQuantityByCodeResponse createBookQuantityByCodeResponse() {
        return new BookQuantityByCodeResponse();
    }

    /**
     * Create an instance of {@link BooksFromItsCode }
     * 
     */
    public BooksFromItsCode createBooksFromItsCode() {
        return new BooksFromItsCode();
    }

    /**
     * Create an instance of {@link BooksFromItsCodeResponse }
     * 
     */
    public BooksFromItsCodeResponse createBooksFromItsCodeResponse() {
        return new BooksFromItsCodeResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookQuantityByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.stock.jaxws.mastering.com/", name = "bookQuantityByCode")
    public JAXBElement<BookQuantityByCode> createBookQuantityByCode(BookQuantityByCode value) {
        return new JAXBElement<BookQuantityByCode>(_BookQuantityByCode_QNAME, BookQuantityByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooksFromItsCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.stock.jaxws.mastering.com/", name = "booksFromItsCodeResponse")
    public JAXBElement<BooksFromItsCodeResponse> createBooksFromItsCodeResponse(BooksFromItsCodeResponse value) {
        return new JAXBElement<BooksFromItsCodeResponse>(_BooksFromItsCodeResponse_QNAME, BooksFromItsCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookQuantityByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.stock.jaxws.mastering.com/", name = "bookQuantityByCodeResponse")
    public JAXBElement<BookQuantityByCodeResponse> createBookQuantityByCodeResponse(BookQuantityByCodeResponse value) {
        return new JAXBElement<BookQuantityByCodeResponse>(_BookQuantityByCodeResponse_QNAME, BookQuantityByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooksFromItsCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.stock.jaxws.mastering.com/", name = "booksFromItsCode")
    public JAXBElement<BooksFromItsCode> createBooksFromItsCode(BooksFromItsCode value) {
        return new JAXBElement<BooksFromItsCode>(_BooksFromItsCode_QNAME, BooksFromItsCode.class, null, value);
    }

}
