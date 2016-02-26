
package com.mastering.jaxws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookQuantityByCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookQuantityByCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookQuantityByCodeResponse", propOrder = {
    "bookQuantity"
})
public class BookQuantityByCodeResponse {

    protected int bookQuantity;

    /**
     * Gets the value of the bookQuantity property.
     * 
     */
    public int getBookQuantity() {
        return bookQuantity;
    }

    /**
     * Sets the value of the bookQuantity property.
     * 
     */
    public void setBookQuantity(int value) {
        this.bookQuantity = value;
    }

}
