
package com.zhy.smail.component.keyboard.xml.layout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Row" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="popupCharacters" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="popupKeyboard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyOutputText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="movable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="sticky" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="modifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="repeatable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyLabelStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="keyEdgeFlags">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="left"/>
 *                                 &lt;enumeration value="right"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rowEdgeFlags">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="top"/>
 *                       &lt;enumeration value="bottom"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="keyHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="verticalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "Keyboard")
public class Keyboard {

    @XmlElement(name = "Row", required = true)
    protected List<Row> row;
    @XmlAttribute(name = "keyWidth")
    protected Integer keyWidth;
    @XmlAttribute(name = "keyHeight")
    protected Integer keyHeight;
    @XmlAttribute(name = "horizontalGap")
    protected Integer horizontalGap;
    @XmlAttribute(name = "verticalGap")
    protected Integer verticalGap;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     * 
     * 
     */
    public List<Row> getRow() {
        if (row == null) {
            row = new ArrayList<Row>();
        }
        return this.row;
    }

    /**
     * Ruft den Wert der keyWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyWidth() {
        return keyWidth;
    }

    /**
     * Legt den Wert der keyWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyWidth(Integer value) {
        this.keyWidth = value;
    }

    /**
     * Ruft den Wert der keyHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyHeight() {
        return keyHeight;
    }

    /**
     * Legt den Wert der keyHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyHeight(Integer value) {
        this.keyHeight = value;
    }

    /**
     * Ruft den Wert der horizontalGap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * Legt den Wert der horizontalGap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalGap(Integer value) {
        this.horizontalGap = value;
    }

    /**
     * Ruft den Wert der verticalGap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalGap() {
        return verticalGap;
    }

    /**
     * Legt den Wert der verticalGap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalGap(Integer value) {
        this.verticalGap = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="popupCharacters" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="popupKeyboard" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyOutputText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="movable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="sticky" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="modifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="repeatable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyLabelStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="keyEdgeFlags">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="left"/>
     *                       &lt;enumeration value="right"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="rowEdgeFlags">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="top"/>
     *             &lt;enumeration value="bottom"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key"
    })
    public static class Row {

        @XmlElement(name = "Key", required = true)
        protected List<Key> key;
        @XmlAttribute(name = "rowEdgeFlags")
        protected String rowEdgeFlags;

        /**
         * Gets the value of the key property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the key property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Key }
         * 
         * 
         */
        public List<Key> getKey() {
            if (key == null) {
                key = new ArrayList<Key>();
            }
            return this.key;
        }

        /**
         * Ruft den Wert der rowEdgeFlags-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRowEdgeFlags() {
            return rowEdgeFlags;
        }

        /**
         * Legt den Wert der rowEdgeFlags-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRowEdgeFlags(String value) {
            this.rowEdgeFlags = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="popupCharacters" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="popupKeyboard" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyOutputText" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="movable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="sticky" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="modifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="repeatable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyLabelStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="keyEdgeFlags">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="left"/>
         *             &lt;enumeration value="right"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Key {

            @XmlAttribute(name = "codes", required = true)
            protected String codes;
            @XmlAttribute(name = "popupCharacters")
            protected String popupCharacters;
            @XmlAttribute(name = "popupKeyboard")
            protected String popupKeyboard;
            @XmlAttribute(name = "keyLabel")
            protected String keyLabel;
            @XmlAttribute(name = "keyOutputText")
            protected String keyOutputText;
            @XmlAttribute(name = "movable")
            protected Boolean movable;
            @XmlAttribute(name = "sticky")
            protected Boolean sticky;
            @XmlAttribute(name = "modifier")
            protected Boolean modifier;
            @XmlAttribute(name = "repeatable")
            protected Boolean repeatable;
            @XmlAttribute(name = "keyIconStyle")
            protected String keyIconStyle;
            @XmlAttribute(name = "keyLabelStyle")
            protected String keyLabelStyle;
            @XmlAttribute(name = "keyWidth")
            protected Integer keyWidth;
            @XmlAttribute(name = "keyEdgeFlags")
            protected String keyEdgeFlags;
            @XmlAttribute(name = "horizontalGap")
            protected Integer horizontalGap;

            /**
             * Ruft den Wert der codes-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodes() {
                return codes;
            }

            /**
             * Legt den Wert der codes-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodes(String value) {
                this.codes = value;
            }

            /**
             * Ruft den Wert der popupCharacters-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPopupCharacters() {
                return popupCharacters;
            }

            /**
             * Legt den Wert der popupCharacters-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPopupCharacters(String value) {
                this.popupCharacters = value;
            }

            /**
             * Ruft den Wert der popupKeyboard-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPopupKeyboard() {
                return popupKeyboard;
            }

            /**
             * Legt den Wert der popupKeyboard-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPopupKeyboard(String value) {
                this.popupKeyboard = value;
            }

            /**
             * Ruft den Wert der keyLabel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyLabel() {
                return keyLabel;
            }

            /**
             * Legt den Wert der keyLabel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyLabel(String value) {
                this.keyLabel = value;
            }

            /**
             * Ruft den Wert der keyOutputText-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyOutputText() {
                return keyOutputText;
            }

            /**
             * Legt den Wert der keyOutputText-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyOutputText(String value) {
                this.keyOutputText = value;
            }

            /**
             * Ruft den Wert der movable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMovable() {
                return movable;
            }

            /**
             * Legt den Wert der movable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMovable(Boolean value) {
                this.movable = value;
            }

            /**
             * Ruft den Wert der sticky-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSticky() {
                return sticky;
            }

            /**
             * Legt den Wert der sticky-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSticky(Boolean value) {
                this.sticky = value;
            }

            /**
             * Ruft den Wert der modifier-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isModifier() {
                return modifier;
            }

            /**
             * Legt den Wert der modifier-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setModifier(Boolean value) {
                this.modifier = value;
            }

            /**
             * Ruft den Wert der repeatable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRepeatable() {
                return repeatable;
            }

            /**
             * Legt den Wert der repeatable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRepeatable(Boolean value) {
                this.repeatable = value;
            }

            /**
             * Ruft den Wert der keyIconStyle-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyIconStyle() {
                return keyIconStyle;
            }

            /**
             * Legt den Wert der keyIconStyle-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyIconStyle(String value) {
                this.keyIconStyle = value;
            }

            /**
             * Ruft den Wert der keyLabelStyle-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyLabelStyle() {
                return keyLabelStyle;
            }

            /**
             * Legt den Wert der keyLabelStyle-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyLabelStyle(String value) {
                this.keyLabelStyle = value;
            }

            /**
             * Ruft den Wert der keyWidth-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getKeyWidth() {
                return keyWidth;
            }

            /**
             * Legt den Wert der keyWidth-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setKeyWidth(Integer value) {
                this.keyWidth = value;
            }

            /**
             * Ruft den Wert der keyEdgeFlags-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyEdgeFlags() {
                return keyEdgeFlags;
            }

            /**
             * Legt den Wert der keyEdgeFlags-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyEdgeFlags(String value) {
                this.keyEdgeFlags = value;
            }

            /**
             * Ruft den Wert der horizontalGap-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getHorizontalGap() {
                return horizontalGap;
            }

            /**
             * Legt den Wert der horizontalGap-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setHorizontalGap(Integer value) {
                this.horizontalGap = value;
            }

        }

    }

}
