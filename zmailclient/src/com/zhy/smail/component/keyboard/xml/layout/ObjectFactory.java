
package com.zhy.smail.component.keyboard.xml.layout;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zhy.smail.component.keyboard.xml.layout package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zhy.smail.component.keyboard.xml.layout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Keyboard }
     * 
     */
    public Keyboard createKeyboard() {
        return new Keyboard();
    }

    /**
     * Create an instance of {@link Keyboard.Row }
     * 
     */
    public Keyboard.Row createKeyboardRow() {
        return new Keyboard.Row();
    }

    /**
     * Create an instance of {@link Keyboard.Row.Key }
     * 
     */
    public Keyboard.Row.Key createKeyboardRowKey() {
        return new Keyboard.Row.Key();
    }

}
