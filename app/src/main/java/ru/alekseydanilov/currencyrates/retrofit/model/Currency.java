package ru.alekseydanilov.currencyrates.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Currency {

    @SerializedName("ID")
    @Expose
    private String iD;

    @SerializedName("NumCode")
    @Expose
    private String numCode;

    @SerializedName("CharCode")
    @Expose
    private String charCode;

    @SerializedName("Nominal")
    @Expose
    private Integer nominal;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Value")
    @Expose
    private BigDecimal value;

    @SerializedName("Previous")
    @Expose
    private BigDecimal previous;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getPrevious() {
        return previous;
    }

    public void setPrevious(BigDecimal previous) {
        this.previous = previous;
    }
}
