
package types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tovar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tovar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tovar", propOrder = {
    "ingredient",
    "kol",
    "name",
    "price",
    "recept",
    "srok"
})
public class Tovar {

    protected String ingredient;
    protected int kol;
    protected String name;
    protected int price;
    protected String recept;
    protected String srok;

    /**
     * Gets the value of the ingredient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * Sets the value of the ingredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredient(String value) {
        this.ingredient = value;
    }

    /**
     * Gets the value of the kol property.
     * 
     */
    public int getKol() {
        return kol;
    }

    /**
     * Sets the value of the kol property.
     * 
     */
    public void setKol(int value) {
        this.kol = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the recept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecept() {
        return recept;
    }

    /**
     * Sets the value of the recept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecept(String value) {
        this.recept = value;
    }

    /**
     * Gets the value of the srok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrok() {
        return srok;
    }

    /**
     * Sets the value of the srok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrok(String value) {
        this.srok = value;
    }

}
