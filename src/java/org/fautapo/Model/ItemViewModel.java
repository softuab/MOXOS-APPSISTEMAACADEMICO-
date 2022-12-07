package org.fautapo.Model;

public class ItemViewModel {

    private Integer id;
    private Integer idParent;
    private String value;

    public ItemViewModel(Integer id, Integer idParent, String value) {
        this.id = id;
        this.idParent = idParent;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
